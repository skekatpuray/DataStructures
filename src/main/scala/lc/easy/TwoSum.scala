package lc.easy
import scala.collection.mutable.HashMap

object TwoSum {

  def main(args : Array[String]): Unit ={

    var found = false
    val nums = Array(2,7,11,15)
    val target = 9
    var cursor = 0
    val map = new HashMap[Int, Int]()
    var one = 0
    var two = 0
    while (found == false && nums.size > cursor){
      val diff = target - nums(cursor)
      if (map.contains(nums(cursor))){
        found = true
        one = map.get(nums(cursor)).getOrElse(0)
        two = cursor
      }
      else
        map += (diff -> cursor)
      cursor += 1
    }
    val returnArr = Array(one, two)
  }
}
