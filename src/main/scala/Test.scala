import datastructures.CircularQueue

object Test extends App {

  val cq = new CircularQueue(4)

  //Create queue with 4 elements populated
  for (i <- 1 to 4){
    cq.enqueue(i)
  }
  cq.printQueue()


  //Perform dequeue/enqueue to view the circular nature
  for (i <- 5 to 10){
    cq.dequeue()
    cq.enqueue(i)
    cq.printQueue()
  }

}
