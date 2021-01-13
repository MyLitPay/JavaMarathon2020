package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        addNode(14, root);
        addNode(23, root);
        addNode(11, root);
        addNode(16, root);
        addNode(22, root);
        addNode(27, root);
        addNode(5, root);
        addNode(15, root);
        addNode(18, root);
        addNode(24, root);
        addNode(150, root);
        addNode(8, root);

        dfs(root);
    }

    public static void addNode(int value, Node root) {
        Node node = new Node(value);
        if (value >= root.getValue()) {

            if (root.getRightChild() == null) {
                root.setRightChild(node);
            } else {
                addNode(value, root.getRightChild());
            }
        } else {

            if (root.getLeftChild() == null) {
                root.setLeftChild(node);
            } else {
                addNode(value, root.getLeftChild());
            }
        }
    }

    public static void dfs(Node root) {
        Node first = root.getLeftChild();
        if (first != null) {
            dfs(first);

        } else {
            System.out.println(root.getValue());

            if (root.getRightChild() != null) {
                Node next = root.getRightChild();
                dfs(next);
            }
        }

        Node last = root.getRightChild();
        if (last != null) {
            dfs(last);

        } else {
            System.out.println(root.getValue());

            if (root.getRightChild() != null) {
                Node next = root.getRightChild();
                dfs(next);
            }
        }
    }

}