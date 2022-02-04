package lc.medium

object AddTwoNumbers extends App {

  val list1 = Array(2,4,3)
  val list2 = Array(5,6,4)

  val listNode1 : ListNode = null

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    var n_ref1 = l1
    var n_ref2 = l2

    var newList : ListNode = null
    var n : ListNode = null

    var carryOver = 0

    while (n_ref1 != null && n_ref2 != null){
      val val1 = n_ref1.value
      val val2 = n_ref2.value

      n_ref1 = n_ref1.next
      n_ref2 = n_ref2.next

      if (newList == null) {
        newList = new ListNode((val1 + val2 + carryOver) % 10);
        n = newList;
      } else {
        n.next = new ListNode((val1 + val2 + carryOver) % 10);
        n = n.next;
      }
      carryOver = (val1 + val2 + carryOver) / 10;
    }

    if (n_ref1 != null) {
      while (n_ref1 != null) {
        n.next = new ListNode(((n_ref1.value + carryOver) % 10));
        carryOver = ((n_ref1.value + carryOver) / 10);
        n = n.next;
        n_ref1 = n_ref1.next;
      }
    } else if (n_ref2 != null) {
      while (n_ref2 != null) {
        n.next = new ListNode(((n_ref2.value + carryOver) % 10));
        carryOver = ((n_ref2.value + carryOver) / 10);
        n = n.next;
        n_ref2 = n_ref2.next;
      }
    }

    if (carryOver != 0){
      n.next = new ListNode(1);
      n = n.next;
    }


    newList
  }


}

