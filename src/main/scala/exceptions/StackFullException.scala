package exceptions

case class StackFullException(private val msg: String) extends Exception

