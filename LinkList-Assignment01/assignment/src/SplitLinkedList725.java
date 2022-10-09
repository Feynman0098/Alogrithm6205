import java.util.ArrayList;

public class SplitLinkedList725 {

    public static void main(String[] args) {

        //  create list
        LinkList<Integer> list = new LinkList<Integer>();
        list.addNodeToHead(10);
        list.addNodeToHead(9);
        list.addNodeToHead(8);
        list.addNodeToHead(7);
        list.addNodeToHead(6);
        list.addNodeToHead(5);
        list.addNodeToHead(4);
        list.addNodeToHead(3);
        list.addNodeToHead(2);
        list.addNodeToHead(1);

        ListNode[] result = splitLinkedList(list.head, 3);

    }

    public static ListNode[] splitLinkedList (ListNode<Integer> head, int k) {

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;

        ListNode[] array = new ListNode[k];

        int x = length / k;
        int y = length % k;

        for (int a = 0; a < k; a++) {
            int num = ( a < y )? x + 1 : x;
            ListNode[] tempArray = new ListNode[num];
            ListNode tempHead = null;
            ListNode befTemp = null;
            for (int b = 0; b < num; b++) {
                tempArray[b] = temp;
                if (b == 0) {
                    tempHead = temp;
                }
                befTemp = temp;
                if (temp != null) temp = temp.next;
                if (b == num - 1) {
                    befTemp.next = null;
                }
            }

            array[a] = tempHead;
        }
        return array;
    }

}
