public class BSTToSortedDoublyLinkedList426 {

    static Node head = null;
    static Node before = null;
    public static Node treeToDoublyList(Node root) {
        if (root == null) return null;
        helper(root);
        return head;
    }

    public static Node helper(Node root) {
        if (root.left != null) {
            treeToDoublyList(root.left);
        }
        Node n = new Node(root.val);
        if (head == null) {
            head = n;
            before = n;
        }
        if (before != null) {
            before.right = n;
            n.left = before;
            n.right = head;
            head.left = n;
        }
        before = n;
        if (root.right != null) {
            treeToDoublyList(root.right);
        }

        return root;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, n2, n5);

        Node res = treeToDoublyList(n4);
    }


}
