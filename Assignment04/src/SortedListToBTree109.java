public class SortedListToBTree109 {


    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            TreeNode res = new TreeNode(head.val);
            res.left = null;
            res.right = null;
            return res;
        }

        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode pre = head;
        while (temp2 != null && temp2.next !=null) {
            pre = temp1;
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        TreeNode res = new TreeNode(temp1.val);
        pre.next = null;
        res.left = sortedListToBST(head);
        res.right = sortedListToBST(temp1.next);

        return res;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-10);
        ListNode node2 = new ListNode(-3);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        sortedListToBST(node1);
    }

}
