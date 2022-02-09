package lc.medium

object MergeIntervals extends App {

  val items = Array( Array(1,3), Array(8,10), Array(2,6), Array(15, 18) )
  //val items = Array( Array(0,0), Array(4,5) )

  val spots = new Array[Int](30)

  items.foreach(item => {
    for (i <- item(0) to item(1)){
      spots(i) = 1
    }
  })

  println()

  var started = false
  var someList = new scala.collection.mutable.ArrayBuffer[Int]()

  for (i <- 0 to spots.length -1){
    if (spots(i) == 1 && started == false){
      someList.addOne(i)
      started = true
    }
    if (started && spots(i) == 0){
      someList.addOne(i - 1)
      started = false
    }
  }

  var someList2 = new Array[Array[Int]](someList.size / 2)

  for (i <- 0 to someList2.length -1){
    someList2(i) = Array(someList(i * 2), someList( (i * 2) + 1))
  }

  someList2.foreach(item => {
    println(s"${item(0)}, ${item(1)}")
  })



}

case class Interval ( x : Int, y : Int)
case class Item (interval : Interval, MaxVal : Int)
