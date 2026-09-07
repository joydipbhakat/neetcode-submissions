/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
      var reverseList = reverse(head)
      val p1 = reverseList
      var prev: ListNode? = null
      var current = p1
      if(n==1)
      {
        return reverse(reverseList?.next)
      }
        for(i in 0 until n-1)
        {
            prev = current
            current = current?.next
        }
        if(current?.next != null)
            prev?.next = current?.next
        else
            prev?.next = null
    
      return reverse(p1)
    }

    fun reverse(head:ListNode?): ListNode? {
        var prev:ListNode? = null
        var current = head

        while(current!=null){
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}
