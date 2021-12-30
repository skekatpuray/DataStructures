package exceptions

case class StackEmptyException(private val msg: String) extends Exception
