package src.stringManipulation;

class PalindromeChecker{
    boolean isPalindrome(String one){
       
        if(new StringBuilder(one).reverse().toString().equals(one) )
            return true;
        return false;
    }
    
    boolean isPalindrome2(String s){
        s = s.toLowerCase();
        for(int i = 0, j = s.length()-1;i<j;i++,j--){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) //The while is necessarry to handle 2 whitespaces => 2 skips/2 increments
                i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
public class PalindromeCheck {
    public static void main(String args[]){
       System.out.println( new PalindromeChecker().isPalindrome("dud"));
        System.out.println( new PalindromeChecker().isPalindrome2("A man, a plan, a canal Panama"));
    }
}
