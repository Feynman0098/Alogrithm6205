public class SwapNodes1721 {

    public static void main(String[] args) {
//  create list
        LinkList<Integer> list = new LinkList<Integer>();
        list.addNodeToHead(6);
        list.addNodeToHead(5);
        list.addNodeToHead(4);
        list.addNodeToHead(3);
        list.addNodeToHead(2);
        list.addNodeToHead(1);

        LinkList.printFromHead(swapNodes(list.head, 1));
    }

    public static ListNode<Integer> swapNodes(ListNode<Integer> head, int k) {
        int length = 0;
        ListNode<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int nodePosition1;
        int nodePosition2;

        if (k > length - k + 1) {
            nodePosition1 = length - k + 1;
            nodePosition2 = k;
        } else {
            nodePosition1 = k;
            nodePosition2 = length - k + 1;
        }


        if (nodePosition1 == nodePosition2) {
            return head;
        }

        ListNode<Integer> node1 = head;
        ListNode<Integer> node2 = head;
        ListNode<Integer> befNode1 = head;
        ListNode<Integer> befNode2 = head;
        temp = head;
        ListNode befTemp = null;
        int count = 0;
        while (temp != null) {
            if (count == nodePosition1 - 1 && count == 0) {
                befNode1 = befTemp;
                node1 = temp;
            } else if (count == nodePosition1 - 1) {
                befNode1 = befTemp;
                node1 = temp;
            } else if (count == nodePosition2 - 1) {
                befNode2 = befTemp;
                node2 = temp;
            }
            count++;
            befTemp = temp;
            temp = temp.next;
        }

        if (befNode1 == null) {
            if (node1 == befNode2) {
                node1.next = null;
                node2.next = node1;
                head = node2;
            } else {
                node2.next = node1.next;
                node1.next = null;
                befNode2.next = node1;
                head = node2;
            }
        } else {
            if (node1 == befNode2) {
                node1.next = node2.next;
                node2.next = node1;
                befNode1.next = node2;
            } else {
                temp = node1.next;
                node1.next = node2.next;
                node2.next = temp;
                befNode1.next = node2;
                befNode2.next = node1;
            }
        }
        return head;
    }

}
