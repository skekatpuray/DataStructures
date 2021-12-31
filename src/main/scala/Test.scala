object Test extends App {

  val cq = new CircularQueue(4)
  cq.enqueue(1)
  cq.enqueue(2)
  cq.enqueue(3)
  cq.enqueue(4)

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()

  println(s"Dequeuing: ${cq.dequeue()}")
  cq.printQueue()


  val output = cq.dequeue()
  println(s"Dequeuing: $output")
  cq.printQueue()


}
