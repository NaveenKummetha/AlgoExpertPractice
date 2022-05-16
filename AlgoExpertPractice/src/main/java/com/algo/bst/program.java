//public class program {
//    // This is an input class. Do not edit.
//    static class BST {
//        public int value;
//        public BST left = null;
//        public BST right = null;
//
//        public BST(int value) {
//            this.value = value;
//        }
//    }
//
//    public static void main(String[] args) {
//        program.BST root = new program.BST(15);
//        root.left = new program.BST(5);
//        root.left.left = new program.BST(2);
//        root.left.left.left = new program.BST(1);
//        root.left.left.right = new program.BST(3);
//        root.left.right = new program.BST(5);
//        root.right = new program.BST(20);
//        root.right.left = new program.BST(17);
//        root.right.right = new program.BST(22);
//        int k = 3;
//        findKthLargestValueInBst(root,k);
//    }
//    public static int  findKthLargestValueInBst(BST tree, int k) {
//        findIt(tree, k, 0, 0);
//        return prev;
//    }
//
//    static int prev;
//
//    public static void findIt(BST tree, int k, int prev, int current) {
//        if (tree.right != null) {
//            findIt(tree.right, k, prev, current);
//        }
//        current++;
//        if (k == current) {
//            prev = tree.value;
//            return;
//        }
//
//        if (tree.left != null) {
//            findIt(tree.left, k, prev, current);
//        }
//    }
//}
