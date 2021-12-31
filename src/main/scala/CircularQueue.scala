class CircularQueue (var initialSize : Int ) {

  private var front = 0
  private var rear = 0

  private val items = new Array[Item](initialSize)

  def enqueue(item : Int): Unit = {
    items(rear % initialSize) = Item(item)
    rear += 1
  }

  def dequeue() : Int = {
    if (isEmpty){
      val item = items(front % initialSize)
      items(front % initialSize) = null
      front += 1
      item.value
    }
    else {
      println("Empty queue")
      0
    }
  }

  def printQueue(): Unit = {
    for (i <- front to (rear - 1)){
      print(s"${items(i % initialSize).value} " )
    }
    println()
  }

  def isFull : Boolean = {
    false
  }

  def isEmpty : Boolean =  (front % initialSize == rear % initialSize)
}
