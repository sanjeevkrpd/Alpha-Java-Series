package TreesPractics;

public class Tree {

    static class Node {

        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    
    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left= BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6};

        
        BinaryTree.BuildTree(arr);
    }
}
