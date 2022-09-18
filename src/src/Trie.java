package src;

public class Trie {
    static Node root;
    Trie(){
       root = new Node('\0');
    }
    public static Node insert(String word){
        Node n = root;
        for(int jj= 0; jj<word.length(); jj++){
            Character c =word.charAt(jj);
            System.out.println((int)('a') +" "+ (int)('b')); //97 98
            if(n.children[c-'a'] == null)
                n.children[c-'a'] = new Node(c);
            n = n.children[c- 'a'];
        }
        n.isWord = true;
        return n;
    }
    public static boolean search(String word){
        return(getNode("ok") !=null && getNode("ok").isWord);
    }

    public boolean startsWith(String word){
        return getNode("o") !=null;
    }

    public static Node getNode(String word){
          Node n2 = root;
          for(int kk =0 ;kk< word.length() ;kk++){
              Character c = word.charAt(kk);
              if(n2.children[c-'a'] == null)
                  return null;
              n2 = n2.children[c-'a'];
          }
          return n2;
    }
    
    static class Node{
        boolean isWord;
        Character c;
        Node[] children;
        public Node(char c){
            isWord = false;
            this.c= c;
            children = new Node[26];
        }
    }
    public static void main(String args[]){
        Trie r = new Trie();
        Node x = r.insert("o");
        System.out.println("Root " +x.c);
        System.out.println ("Is Present" +search("ok"));
        for(int i =0; i< 26;i++) {
            if(x.children[i] != null)
            System.out.println(x.c);
        }
    }
}
