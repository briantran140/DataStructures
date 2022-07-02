public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete (int value) {
        root = delete(root, value);
    }


    // at the end, it will return the left or rightChild if value found in the tree, if not found in the tree, return null.
    // It will keep doing that until it finds the element it's looking for and if the element doesn't exist we will get null.
    // if it is not the value we're looking for, it returns itself so the parent can set its child back to the same element.
    // The final step always return something but itself, therefor we don't need to worry if it will set its child value to itself
    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if(subtreeRoot == null) {
            return subtreeRoot;
        }

        if(value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if(value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else {
            // Cases 1 and 2: node to delete has 0 or 1 children
            if(subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            }
            else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            // Replace the value in the subtreeRoot node with the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }

        return subtreeRoot;
    }

    public int min() {
        if(root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void traversePostOrder() {
        if(root != null) {
            root.traversePostOrder();
        }
        System.out.println();
    }

    public void traversePreOrder() {
        if(root != null) {
            root.traversePreOrder();
        }
        System.out.println();
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
        System.out.println();
    }

}
