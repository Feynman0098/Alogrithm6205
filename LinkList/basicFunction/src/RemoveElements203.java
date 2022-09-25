public class RemoveElements203 {
    public static void main(String[] args) {
//  create list
        LinkList<Integer> list = new LinkList<Integer>();
        list.addNodeToHead(6);
        list.addNodeToHead(5);
        list.addNodeToHead(4);
        list.addNodeToHead(3);
        list.addNodeToHead(6);
        list.addNodeToHead(2);
        list.addNodeToHead(1);
//  get the rotated list
        LinkList.printFromHead(removeElements(list.head, 6));
    }

    public static ListNode removeElements (ListNode<Integer> head, int val) {

        ListNode<Integer> temp = head;
        ListNode<Integer> beforeTemp = head;
        while (temp != null) {
            if (temp.val == val) {
                if (temp == head) {
                    head = temp.next;
                } else {
                    beforeTemp.next = beforeTemp.next.next;
                }
            }
            beforeTemp = temp;
            temp = temp.next;
        }

        return head;
    }

}
