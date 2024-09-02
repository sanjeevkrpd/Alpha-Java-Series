package Trie;

public class PrefixProblem {

    public static class Node {
        Node[] childrend = new Node[26];
        boolean eow = false;
        int freq = 0;

        Node() {
            for (int i = 0; i < childrend.length; i++) {
                childrend[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.childrend[idx] == null) {
                curr.childrend[idx] = new Node();
            } else {
                curr.childrend[idx].freq++;
            }
            curr = curr.childrend[idx];
        }

        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) {
        if (root == null) return;

        if (root.freq == 1) {
            System.out.println(ans); 
            return;
        }

        for (int i = 0; i < root.childrend.length; i++) {
            if (root.childrend[i] != null) {
                findPrefix(root.childrend[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};

        
        for (String word : words) {
            insert(word);
        }

        System.out.println("Unique prefixes for each word:");
        for (String word : words) {
            Node curr = root;
            String prefix = "";
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (curr.childrend[idx] == null) {
                    break;
                }
                prefix += word.charAt(i);
                curr = curr.childrend[idx];
                if (curr.freq == 1) {
                    System.out.println("Unique prefix for " + word + " is: " + prefix);
                    break;
                }
            }
        }
    }
}
