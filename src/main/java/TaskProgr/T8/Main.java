package TaskProgr.T8;

public class Main {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(17);
        binaryTree.add(8);
        binaryTree.add(19);
        binaryTree.add(5);
        binaryTree.add(14);
        Node node = binaryTree.searchNode(19);
        System.out.println(node);
    }
}
