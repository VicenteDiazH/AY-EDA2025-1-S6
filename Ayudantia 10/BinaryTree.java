public class BinaryTree {

    // Clase interna que representa un nodo del árbol binario
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Métodos de recorrido del árbol
    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    // Función para calcular la altura del árbol
    public int height(TreeNode root) {
        if (root == null) {
            return -1; // Altura de árbol vacío
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Método principal
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construcción del árbol binario
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        // Mostrar altura
        System.out.println("Altura del árbol: " + tree.height(root));

        // Recorridos
        System.out.println("\nRecorrido InOrder:");
        tree.inOrder(root);

        System.out.println("\nRecorrido PreOrder:");
        tree.preOrder(root);

        System.out.println("\nRecorrido PostOrder:");
        tree.postOrder(root);
    }
}
