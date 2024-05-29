package Tree;

public class BinaryTreeMain04 {
    public static void main(String[] args) {
        BinaryTree04 bt04 = new BinaryTree04();
        bt04.add(6);
        bt04.add(4);
        bt04.add(8);
        bt04.add(3);
        bt04.add(5);
        bt04.add(7);
        bt04.add(9);
        bt04.add(10);
        bt04.add(15);
        System.out.println("PreOrder Traversal: ");
        bt04.tranversePreOrder(bt04.root);
        System.out.println("");
        System.out.println("inOrder Traversal: ");
        bt04.tranverseInOrder(bt04.root);
        System.out.println("");
        System.out.println("PostOrder Traversal: ");
        bt04.tranversePostOrder(bt04.root);
        System.out.println("");
        System.out.println("Find Node: "+bt04.find(5));
        System.out.println("Delete Node:8 ");
        bt04.delete(8);
        System.out.println("");
        System.out.println("PreOrder Traversal: ");
        bt04.tranversePreOrder(bt04.root);
        System.out.println("");

    }
}
