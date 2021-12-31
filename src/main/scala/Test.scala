object Test extends App {

  val cq = new CircularQueue(4)
  cq.enqueue(1)
  cq.enqueue(2)
  cq.enqueue(3)
  cq.enqueue(4)


  var item = cq.dequeue()
  cq.enqueue(5)
  cq.enqueue(6)
  item = cq.dequeue()
  cq.enqueue(6)


  cq.printQueue()

}
