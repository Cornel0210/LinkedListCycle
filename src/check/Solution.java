package check;

import java.util.HashSet;
import java.util.Set;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer. Internally, pos is used to denote the index of the node
 * that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */

public class Solution {


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }

        Set<ListNode> checked = new HashSet<>();
        while (head!= null){
            if (!checked.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }




    /*public boolean hasCycle(ListNode head) {

        Map<ListNode, ListNode> relations = new HashMap<>();
        while (head != null && head.next != null){
            relations.put(head, head.next);
            if (relations.containsKey(head.next)){
                return true;
            }
            head = head.next;
        }
        return false;
    }*/
}
