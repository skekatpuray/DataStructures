import exceptions.StackEmptyException

class Stack (var initialSize : Int) {

  private var _index : Int = 0

  private val itemArray = new Array[Item](initialSize)

  def pop() : Int = {
    if (_index > 0) {
      val itemValue = itemArray(_index).value
      itemArray(_index) = null
      _index -= -1
      itemValue
    }
    else {
      throw StackEmptyException("Stack is empty")
    }
  }

  def push(item : Int): Unit = {
    if (_index <= initialSize){
      itemArray(_index + 1) = Item(item)
      _index += 1
    }
  }

  def peek() : Int = {
    0
  }

  def numberOfItems ():Int={
    _index
  }
}
