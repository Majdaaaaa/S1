public class Palindromes {
    /* Écrivez vos fonctions ici */
     public static String reverse (String s) {
        String r = "";
        for(int i = 0; i < s.length (); i++) {
            r = r + s.charAt(s.length () - (i+1));
        }
        return r;
    }
    public static boolean palindrome (String word){
        if (word.equals(reverse(word))){ 
            return true;}
        else {
            return false;}
    }
   public static boolean palindrome_bis (String word){
        
        

    public static void main(String[] args) {
        /* Écrivez vos tests ici */
    System.out.println(palindrome("rotor"));
    }
}
