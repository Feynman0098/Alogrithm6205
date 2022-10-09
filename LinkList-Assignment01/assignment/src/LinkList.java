public class LinkList<T> {

    public ListNode<T> head;
    public ListNode<T> tail;

    public int length = 0;

    LinkList () {
        head = null;
        tail = null;
    }

//  Add node to head
    public void addNodeToHead (T data) {
        ListNode<T> addNode = new ListNode(data, head);
        head = addNode;
        if (head.next == null) {
            tail = head;
        }
        length++;
    }

//    Add node to tail O(1)
    public void addNodeToTailOne (T data) {
        ListNode addNode = new ListNode(data, null);
        if (head == null) {
            head = addNode;
            tail = head;
            length++;
            return;
        }
        tail.next = addNode;
        tail = addNode;
        length++;
    }

//    Add node to tail O(n)
    public void addNodeToTail (T data) {
        ListNode<T> addNode = new ListNode(data, null);
        ListNode<T> temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }

        tail = temp;
        if (head == null) {
            head = addNode;
            tail = head;
            length++;
            return;
        }
        tail.next = addNode;
        tail = addNode;
        length++;
    }

//    Print Link list
    public void printLinkList () {
        ListNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void printFromHead (ListNode<Integer> head) {
        ListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

//    count length of link list
    public int countLength () {
        if (head == null) {
            return 0;
        }
        ListNode<T> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

}
