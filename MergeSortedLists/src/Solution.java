public class Solution {



    public ListNode mergeTwoLists(ListNode list1 , ListNode list2) {
            ListNode dummy = new ListNode();
            ListNode curr = dummy;

            while (list1 != null && list2 != null) {
                if(list1.val > list2.val) {
                    curr.next = list2;
                    list2 = list2.next;
                }
                else {
                    curr.next = list1;
                    list1 = list1.next;
                }
                curr = curr.next;
            }

            curr.next = (list1 != null) ? list1 : list2;

            return dummy.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1 );

        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);



    }

}
