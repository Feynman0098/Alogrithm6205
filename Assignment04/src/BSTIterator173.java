import java.util.LinkedList;
import java.util.Stack;

public class BSTIterator173 {

    LinkedList<Integer> list = new LinkedList();
    int cur;

    public BSTIterator173(TreeNode root) {
        inOrder(root);
    }

    public int next() {
        if (list.size() > 0)  {
            cur = list.pollFirst();
            return cur;
        }
        return 0;
    }

    public void inOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            list.add(node.val);
            node = node.right;

        }
    }

    public boolean hasNext() {
        if (list.size() > 0) return true;
        else return false;
    }

}
