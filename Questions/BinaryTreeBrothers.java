public class BinaryTreeBrothers {

    private int depthX, depthY;
    private TreeNode parentX, parentY;

    public boolean areBrothers(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        return depthX == depthY && parentX != parentY;
    }

    private void dfs(TreeNode node, TreeNode parent, int x, int y, int depth) {
        if (node == null) {
            return;
        }

        if (node.val == x) {
            depthX = depth;
            parentX = parent;
        } else if (node.val == y) {
            depthY = depth;
            parentY = parent;
        }

        dfs(node.left, node, x, y, depth + 1);
        dfs(node.right, node, x, y, depth + 1);
    }


    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * /
         * 4
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int x = 4, y = 3;

        BinaryTreeBrothers bt = new BinaryTreeBrothers();
        boolean result = bt.areBrothers(root, x, y);
        System.out.println(result);
    }
    
}

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
