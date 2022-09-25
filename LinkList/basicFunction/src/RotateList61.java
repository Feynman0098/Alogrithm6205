public class RotateList61 {

    public static void main(String[] args) {
//  create list
        LinkList<Integer> list = new LinkList<Integer>();
        list.addNodeToHead(4);
        list.addNodeToHead(3);
        list.addNodeToHead(2);
        list.addNodeToHead(1);
        list.addNodeToHead(0);
//  get the rotated list
        LinkList.printFromHead(rotateList(list.head, 17));
    }

    public static ListNode rotateList (ListNode<Integer> head, int k) {
        if (head == null) return null;
        int length = 1;
        ListNode tailNode = head;
        while (tailNode != null && tailNode.next != null) {
            tailNode = tailNode.next;
            length++;
        }
        if ((k % length) == 0) {return head;}
        int num = length - (k % length);

        ListNode startNode = head;
        ListNode endNode = new ListNode();
        for (int x = 0; x < num; x++) {
            endNode = startNode;
            startNode = startNode.next;
        }
        endNode.next = null;
        tailNode.next = head;
        return startNode;
    }



}
