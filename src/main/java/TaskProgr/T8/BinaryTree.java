package TaskProgr.T8;

public class BinaryTree {
    private Node root;

    public Node searchNode(int key) {
        return searchNode(root, key);
    }

    private Node searchNode(Node currentNode, int value) {
        if (currentNode.getValue() == value) {
            return currentNode;
        }
        if (currentNode.getValue() > value) {
            return searchNode(currentNode.getLeft(), value);
        }
        else    {
            return searchNode(currentNode.getRight(), value);
        }
    }

    public void add(int value) {
        recursiveAdd(root, value);
    }

    private Node recursiveAdd(Node currentNode, int value) {
        if (currentNode == null) {
            root = new Node(value);
            return root;
        }
        if (currentNode.getValue() > value) {
            if (currentNode.getLeft() == null)  {
                currentNode.setLeft(new Node(value));
            }   else    {
                recursiveAdd(currentNode.getLeft(), value);
            }
        }
        if (currentNode.getValue() < value) {
            if (currentNode.getRight() == null)  {
                currentNode.setRight(new Node(value));
            }   else    {
                recursiveAdd(currentNode.getRight(), value);
            }
            return currentNode;
        }
        return currentNode;
    }
}


