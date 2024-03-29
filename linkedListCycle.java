import java.util.HashSet;

/**
 * @author : Yuyang Sun
 * @date: 1/23/2022, Sun
 **/

public class linkedListCycle {

    public boolean solution5(ListNode head){
        //check special case
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        //if slow == fast, meaning it has cycle.
        while (slow != fast){

            if (fast == null || fast.next == null){
                return false;
            }
            //slow moving one step, fast moving 2 step
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    // no need check special case, head = null
    public boolean solution3(ListNode head){

        HashSet<ListNode> s = new HashSet<>();
        while (head != null){

            if (s.contains(head)){
                return true;
            }
            else{
                s.add(head);
            }
            head = head.next;
        }
        return false;
    }

    //not work, too slow
    public boolean solution(ListNode head){
        //check special case
        if (head == null || head.next == null) return false;

        int head_value = head.val;
        while (head.next != null){
            head = head.next;
            if (head_value == head.val){
                return true;
            }
        }
        return false;
    }

    // need to check special case first, head = null;
    public boolean solution2(ListNode head){

        HashSet<ListNode> s = new HashSet<>();
        //check special case
        if (head == null || head.next == null) return false;

        while (head.next != null){
            head = head.next;
            if (s.contains(head)){
                return true;
            }
            else{
                s.add(head);
            }
        }
        return false;
    }


     //Definition for singly-linked list
     class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

}
