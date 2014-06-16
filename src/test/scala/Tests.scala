import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Tests extends WordSpec with ShouldMatchers {
    
    "My Puzzlers objects should" should {
        "Remove duplicates from List()" in {
            RemoveDuplicates(List()) should be (List())
        }

        "Remove duplicates from List(1, 2, 3)" in {
            RemoveDuplicates(List(1, 2, 3)) should be (List(1, 2, 3))
        }

        "Remove duplicates from List(1, 1, 2, 2, 3, 3)" in {
            RemoveDuplicates(List(1, 1, 2, 2, 3, 3)) should be (List(1, 2, 3))
        }

        "Remove duplicates from List(2, 5, 8, 4, 3, 7, 6, 2, 5, 4, 9, 8, 1, 2, 3, 2)" in {
            RemoveDuplicates(List(2, 5, 8, 4, 3, 7, 6, 2, 5, 4, 9, 8, 1, 2, 3, 2)) should be (List(1, 2, 3, 4, 5, 6, 7, 8, 9))
        }

        "Merge sort List(3, 2, 1)" in {
            RemoveDuplicates.mergeSort(List(3, 2, 1)) should be (List(1, 2, 3))
        }

        "Merge sort List()" in {
        	RemoveDuplicates.mergeSort(List()) should be (List())
        }
    }
}