package LeetCode;

class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int counter = 1;
        int mid = 0;

        while (temp.next != null) {
            counter++;
            temp = temp.next;
        }

        mid = counter / 2;
        if (counter % 2 == 0) {
            mid = counter / 2 + 1;
        }

        temp = head;

        while (mid != 0) {
            temp = temp.next;
            mid--;
        }

        return temp;
    }
}
