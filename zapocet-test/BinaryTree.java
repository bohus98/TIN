import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    void printValuesFromMiddle(Node root) {
        List<Integer> values = new ArrayList<>();
        getValuesFromMiddle(root, values);

        for (int i = values.size() / 2; i >= 0; i--) {
            System.out.print(values.get(i) + " ");
        }
        for (int i = (values.size() / 2) + 1; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }
    }

    void getValuesFromMiddle(Node root, List<Integer> values) {
        if (root != null) {
            getValuesFromMiddle(root.left, values);
            values.add(root.data);
            getValuesFromMiddle(root.right, values);
        }
    }
}
