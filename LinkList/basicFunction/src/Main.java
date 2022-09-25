public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addNodeToTail(1);
        list.addNodeToTail(2);
        list.addNodeToTail(3);
        list.addNodeToTail(4);
        list.addNodeToTail(5);
        list.addNodeToTailOne(6);
        list.addNodeToHead(0);
        list.printLinkList();
        System.out.println("\nLength:" + list.length);
    }
}
