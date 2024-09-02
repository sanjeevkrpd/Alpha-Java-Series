package Trie;

public class WordBreak {

    public static class Node {
        Node[] children = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); 

    public static void insert(String word) {
        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = c - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            current = current.children[idx];
        }

        current.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';

            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        return curr.eow;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(wordBreak("ilikesamsung")); 
    }

    public static boolean wordBreak(String key) {
        if (key == null || key.isEmpty()) {
            return true;
        }

        for (int i = 0; i < key.length(); i++) {
            if (search(key.substring(0, i + 1)) && wordBreak(key.substring(i + 1))) {
                return true;
            }
        }
        return false;
    }
}
