package src.stringManipulation.easy;

public class StringReversal {
    public static void main(String args[]){
        String s = "abcd";
      
        StringBuilder s2 = new StringBuilder();
        for(int i = s.length()-1; i>=0 ; i--){
            System.out.println("Reversed "+ s.charAt(i));
            s2 = s2.append(s.charAt(i));
        }
        System.out.println("Reversed "+ s2);
    }
}
