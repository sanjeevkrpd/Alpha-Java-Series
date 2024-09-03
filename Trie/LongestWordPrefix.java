package Trie;

public class LongestWordPrefix {

    // Node class for Trie
    public static class Node {
        Node children[] = new Node[26]; // Array to hold references to child nodes (for each alphabet letter)
        boolean eow = false; // End of word flag
        
        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // Root node of the Trie
    public static Node root = new Node();

    // Method to insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }

        curr.eow = true; // Mark the end of the word
    }

    // Variable to store the longest word found
    static String ans = "";

    // Method to find the longest word with all prefixes present
    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                
                // Backtrack by removing the last character
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "apply", "apple"};

        // Insert words into the Trie
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        // Find the longest word with all prefixes present
        StringBuilder temp = new StringBuilder();
        longestWord(root, temp);

        // Print the result
        System.out.println("Longest word with all prefixes: " + ans);
    }
}
