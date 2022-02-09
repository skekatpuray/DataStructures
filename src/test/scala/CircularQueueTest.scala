import datastructures.CircularQueue
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers._

class CircularQueueTest extends AnyFlatSpec {

  println("Running tests")

  "A queue" should "pop values in first in first out" in {
    val queue = new CircularQueue(4)
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)

    assert(queue.dequeue() === 1)
    assert(queue.dequeue() === 2)
    assert(queue.dequeue() === 3)
    assert(queue.dequeue() === 4)
  }

  an [exceptions.EmptyQueueException] should be thrownBy {
    val emptyQueue = new CircularQueue(10)
    emptyQueue.dequeue()
  }

  an [exceptions.QueueMaxCapacityReachedException] should be thrownBy{
    val maxCapacityQueue = new CircularQueue(4)
    maxCapacityQueue.enqueue(1)
    maxCapacityQueue.enqueue(2)
    maxCapacityQueue.enqueue(3)
    maxCapacityQueue.enqueue(4)
    maxCapacityQueue.enqueue(5)
  }









}

