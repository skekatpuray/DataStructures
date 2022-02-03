package exceptions

case class QueueMaxCapacityReachedException (private val msg : String) extends Exception