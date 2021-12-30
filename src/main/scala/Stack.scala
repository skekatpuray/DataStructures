import exceptions.StackEmptyException

class Stack (var initialSize : Int) {

  private var _index : Int = 0

  private val itemArray = new Array[Item](initialSize)

  def pop() : Int = {
    if (_index > 0) {
      val item = itemArray(_index)
      itemArray(_index) = null
      _index = _index - 1
      item.value
    }
    else {
      throw StackEmptyException("Stack is empty")
    }
  }

  def push(item : Int): Unit ={
    itemArray(_index + 1) = Item(item)
    _index = _index + 1
  }

  def peek() : Int = {
    0
  }

  def numberOfItems ():Int={
    _index
  }
}
