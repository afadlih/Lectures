package Tree;

public class BinaryTree04 {
    Node04 root;

    public BinaryTree04() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node04(data);
        } else {
            Node04 current = root;
            while(!isEmpty()) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node04(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right== null) {
                        current.right = new Node04(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node04 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void tranversePreOrder(Node04 node) {
        if (node != null) {
            System.out.print( " "+node.data );
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }

    void tranversePostOrder(Node04 node) {
        if (node != null) {
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            System.out.print( " "+node.data);
        }
    }

    void tranverseInOrder(Node04 node) {
        if (node != null) {
            tranverseInOrder(node.left);
            System.out.print( " "+node.data);
            tranverseInOrder(node.right);
        }
    }

    Node04 getSuccessor(Node04 del) {
        Node04 successor = del.right;
        Node04 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node04 parent = root;
        Node04 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // delete
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if there are 2 children
                Node04 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }

        }
    }
}
