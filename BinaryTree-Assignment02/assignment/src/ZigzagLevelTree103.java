import java.util.ArrayList;
import java.util.List;

public class ZigzagLevelTree103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList();
        int level = 0;
        addToList(root, level, list);
        return list;
    }

    public void addToList(TreeNode node, int level, List list){
        if (node==null) return;
        if (level % 2 == 0) {
            if (list.size() <= level) {
                ArrayList tempList = new ArrayList();
                tempList.add(node.val);
                list.add(tempList);
            } else {
                ((List<Integer>)list.get(level)).add(node.val);
            }
        } else {
            if (list.size() <= level) {
                ArrayList tempList = new ArrayList();
                tempList.add(node.val);
                list.add(tempList);
            } else {
                ((List<Integer>)list.get(level)).add(0, node.val);
            }
        }
        level++;
        addToList(node.left, level, list);
        addToList(node.right, level, list);
    }

}
