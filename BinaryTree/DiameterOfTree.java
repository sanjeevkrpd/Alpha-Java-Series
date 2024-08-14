package BinaryTree;

public class DiameterOfTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // binary tree
    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }  
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }


    public static Info diameter(Node root){

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rgInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rgInfo.diam) , leftInfo.ht+rgInfo.ht+1);

        int ht = Math.max(leftInfo.ht,rgInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6};

        Node root = BinaryTree.buildTree(nodes);

      System.out.println(diameter(root).diam);
    }
}
