public class InsertCircular708 {

    public static void main(String[] args) {
        ListNode head = insertVal(null, 4);
        insertVal(head, 1);
        insertVal(head, 7);
        insertVal(head, 8);
        insertVal(head, 2);
        insertVal(head, 3);
        insertVal(head, 0);

        ListNode<Integer> temp = head;
        do {
            System.out.println(temp.val);
            temp = temp.next;
        } while (temp!=head);
    }

    public static ListNode insertVal (ListNode<Integer> head, int val) {

        ListNode<Integer> temp = head;
        ListNode<Integer> newNode = new ListNode<Integer>();
        newNode.val = val;

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            return head;
        } else if (head.next == head) {
            head.next = newNode;
            newNode.next = head;
            return head;
        }

        do {
            if (temp.val <= val && temp.next.val >= val){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }else if (temp.val > temp.next.val && val > temp.val) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            } else if (temp.val > temp.next.val && temp.next.val >= val) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        } while (temp != head);

        return head;
    }
}
