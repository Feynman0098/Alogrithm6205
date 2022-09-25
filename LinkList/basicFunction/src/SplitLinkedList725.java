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

        ArrayList result = splitLinkedList(list.head, 3);
        System.out.println(result);

    }

    public static ArrayList splitLinkedList (ListNode<Integer> head, int k) {
        ArrayList array = new ArrayList<>();

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;

        int x = length / k;
        int y = length % k;

        for (int a = 0; a < k; a++) {
            ArrayList tempArray = new ArrayList<>();
            for (int b = a < y ? x + 1 : x; b > 0; b--) {
                tempArray.add(temp.val);
                if (temp != null) temp = temp.next;
            }

            array.add(tempArray);
        }
        return array;
    }

}
