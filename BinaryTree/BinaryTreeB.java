package BinaryTree;
import java.util.*;

public class BinaryTreeB {
    
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

        // preorder traversal 
    public static void preorder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
        // inorder traversal 
    public static void inorder(Node root){
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
       // postorder traversal 
    public static void postorder(Node root){
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }



    // levelorder traversal 

    public static void levelorder(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6};
        Node root =BinaryTree.buildTree(nodes);  // Corrected to use BinaryTree
        
        System.out.println("PreOrder");
        preorder(root);
        System.out.println("PostOrder");
        postorder(root);
        System.out.println("InOrder");
        inorder(root);
        System.out.println("LevelOrder");
        levelorder(root);

        System.out.println("height of the tree is  : "+ height(root));

        System.out.println("Count the no of nodes : "+ countNodes(root));

        System.out.println("Sun of the total no of nodes : "+sumOfNodes(root));

        System.out.println("diameter of the tree : " + diameter(root));
    }



    // height of the tree

    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // count no of nodes

    public static int countNodes(Node root ){
        if (root == null) {
            return 0;

        }
        int lcount = countNodes(root.left);
        int rcount = countNodes(root.right);

        return (lcount + rcount)+1;
    }


    // sum of the nodes


    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int lsum = sumOfNodes(root.left);
        int rsum = sumOfNodes(root.right);

        return ((lsum+rsum)+root.data);
    }

    // diameter of the tree or Longest path

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int ldim = diameter(root.left);
        int lh = height(root.left);
        int rdim = diameter(root.right);
        int rh = height(root.right);

        int selfdiam = lh + rh + 1;


        return Math.max(selfdiam , Math.max(ldim, rdim));
    }
}
