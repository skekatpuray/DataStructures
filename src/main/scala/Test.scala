object Test extends App {

  val cq = new CircularQueue(4)
  cq.enqueue(1)
  cq.enqueue(2)
  cq.enqueue(3)
  cq.enqueue(4)
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")

  println(s"Dequeuing: ${cq.dequeue()}")

  cq.enqueue(5)
  cq.printQueue()
  cq.enqueue(6)
  cq.printQueue()

}
