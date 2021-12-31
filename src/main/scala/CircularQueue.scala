class CircularQueue (var initialSize : Int ) {

  private var front = 0
  private var rear = 0

  private val items = new Array[Item](initialSize)

  def enqueue(item : Int): Unit = {
    if (isFull == false) {
      items(rear % initialSize) = Item(item)
      rear += 1
    } else {
      println(s"Queue is full!!  Unable to add $item")
    }

  }

  def dequeue() : Int = {
    if (!isEmpty) {
      val item = items(front % initialSize)
      items(front % initialSize) = null
      front += 1
      item.value
    }
    else {
      println("-----Empty Queue-----")
      0
    }
  }

  def printQueue(): Unit = {
    if (!isEmpty){
      for (i <- front to (rear - 1)){
        print(s"${items(i % initialSize).value} " )
      }
      println()
    }
    else
      println("Empty Queue!")

  }

  def isFull : Boolean = (rear - front == 4)

  def isEmpty : Boolean = (front == rear)
}
