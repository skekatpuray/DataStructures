object Test extends App {


  throwFullQueueError()



  def throwFullQueueError(): Unit = {
    val cq = new CircularQueue(4)
    cq.enqueue(1)
    cq.enqueue(2)
    cq.enqueue(3)
    cq.enqueue(4)
    cq.printQueue()       // Print the contents
    cq.enqueue(5)   // Throw error
  }

  def throwEmptyQueueError(): Unit ={
    val cq = new CircularQueue(3)
    cq.enqueue(1)
    cq.enqueue(2)
    cq.enqueue(3)
    cq.printQueue()       // Print the contents

    cq.dequeue()
    cq.dequeue()
    cq.dequeue()
    cq.dequeue()
  }

}
