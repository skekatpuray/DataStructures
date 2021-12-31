object Test extends App {

  val cq = new CircularQueue(4)
  cq.enqueue(1)
  cq.enqueue(2)
  cq.enqueue(3)
  cq.enqueue(4)
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()


}
