package Trie;

public class StartWithQuestion {


    public static class  Node {
        
        Node children[] = new Node[26];
        boolean eow = false;
        
        public Node(){
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int level = 0; level < word.length(); level++){
            int index = word.charAt(level) - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }

        curr.eow = true;
    }


    public static void main(String[] args) {
        

        String words[] = {"apple", "app" , "mango","man","woman"};

        String prefix= "app";

        String prefix2 = "moon";


        for (int i = 0; i < words.length; i++) {
            
            insert(words[i]);
        }

        System.out.println(startWith(prefix));
        System.out.println(startWith(prefix2));
    }

    public static boolean startWith(String prefix){
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            
            int index = prefix.charAt(i) - 'a';

            if (curr.children[index] == null) {
                
                return false;
            }

            curr = curr.children[index];

        }

        return true;
    } 

}
