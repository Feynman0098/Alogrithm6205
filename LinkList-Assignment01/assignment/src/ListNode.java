public class ListNode<T> {

//    values of node
    public T val;
//    next position of node
    public ListNode<T> next;
//    constructors
    ListNode () {
        this.val = null;
        this.next = null;
    }
    ListNode (T val) {
        this.val = val;
        this.next = null;
    }
    ListNode (T val, ListNode<T> nextNode) {
        this.next = nextNode;
        this.val = val;
    }
}
