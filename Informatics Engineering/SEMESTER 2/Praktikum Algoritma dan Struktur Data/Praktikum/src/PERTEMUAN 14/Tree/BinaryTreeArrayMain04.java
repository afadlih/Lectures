package Tree;

public class BinaryTreeArrayMain04 {
    public static void main(String[] args) {
        
    BinaryTreeArray04 bta04 = new BinaryTreeArray04();
    int[] data = {6, 4, 8,3,5,7,9,0,0,0};
    int idxLast = 6;
    bta04.populateData(data, idxLast);
    System.out.println("\ninOrder Traversal: ");
    bta04.tranverseInOrder(0);
    System.out.println("\n");
    }
}
