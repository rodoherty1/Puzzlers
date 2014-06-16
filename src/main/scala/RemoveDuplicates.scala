import scala.collection.immutable.BitSet

object RemoveDuplicates {

    def mergeSort(l: List[Int]): List[Int] = {
        def merge(left: List[Int], right:List[Int]): List[Int] = {
            (left, right) match {
                case (Nil, right) => right
                case (left, Nil) => left
                case (l :: ls, r :: rs) => if (l < r) l :: merge (ls, right) else r :: merge (left, rs)
            }
        }
        
        def sort(l: List[Int]): List[Int] = {
            val n = l.length / 2
            
            if (n == 0) l
            else {
                val (left, right) = l splitAt n
                merge(sort(left), sort(right))
            }
        }
        
        if (l.length < 2) l
        else sort(l)
    }
    
    
    def apply(l: List[Int]): List[Int] = {
        def removeDuplicates(xs: List[Int], value: Int): List[Int] = {
            xs match {
                case (Nil) => List()
                case (x :: xs) => if (x == value) removeDuplicates(xs, value)
                				else x :: removeDuplicates(xs, x); 
            }
        }
        
        val sorted = mergeSort(l)

        sorted match {
            case Nil => sorted
            case (x :: Nil) => sorted
            case (x :: xs) => x :: removeDuplicates(xs, x)
        }
    }
}