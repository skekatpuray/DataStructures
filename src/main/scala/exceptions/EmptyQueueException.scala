package exceptions

case class EmptyQueueException(private val msg : String) extends  Exception
