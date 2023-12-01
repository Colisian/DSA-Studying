package Java;

/**
 * AddTwoNumbers
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */

 class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class AddTwoNumbers {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2){

        ListNode holder = new ListNode(0); //Initialize a node to build the resulting linkedlist
        ListNode tail = holder; // pointer for the holder node
        int carryOver = 0;

        while (l1 != null || l2 != null) { //loop continues as long as nodes are present
            int sum = carryOver; // calculate the sum of corresponding digits and include carryOver

            if(l1 != null){ //if first node in l1 is not null
                sum += l1.val; //adds the current node integer to the total sum
                l1 = l1.next; //move to next node in l1
            }
            if (l2 != null) {
                sum += l2.val; // adds the current node to total sum 
                l2 = l2.next; //move to next node in l2
            }
            carryOver = sum / 10; //update the carryOver value for the next iteration. If Sum is less than 10 no carryOver, if carryOver is 10 or greater the carryOver is 1 or more
         tail.next = new ListNode( sum % 10);//ensures that the new node of the linked list is a single digit
         tail = tail.next; //move the tail pointer to the new node. tail.next now points to the newly added node 
        }
        // if there is a remaining carryOver after traversing both lists create an addition node for it 
        if (carryOver > 0) {
         tail.next = new ListNode(carryOver); //create a new node at the tail that would contain the carry over value
        }
        return holder.next; //return the next node of the holder node which contains the head of the resulting linked list
    }   
}

/*
 * 
 * Initialize a dummy node (holder) to build the resulting linked list.
 * Initialize a pointer for the dummy (holder) node (ListNode tail = new ListNode(0);) and two pointers to traverse the input linked lists (ListNode l1 and ListNode l2).
 * Initialize a variable to hold the carryOver value (int carryOver = 0;).
 * Traverse both input linked lists simultaneously:
 * Calculate the sum of the corresponding digits in l1 and l2, including the carryOver value from the previous addition.
 * Calculate the value to be stored in the new node by summing the digits and the carryOver.
 * Update the carryOver value for the next iteration.
 * Move to the next nodes in both linked lists.
 * Check if there's a remaining carryOver after traversing both lists. If so, create an additional node for the carryOver.
 * Return the next node of the dummy node, which contains the head of the resulting linked list.
 * 
 * 
 * 
 * 
 * 
 */