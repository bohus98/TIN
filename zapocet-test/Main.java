import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        List<Integer> values = Arrays.asList(5, 3, 7, 2, 4, 6);

        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("Inorder traversal of binary tree:");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Values from the middle node upwards and downwards:");
        tree.printValuesFromMiddle(tree.root);
    }
}
