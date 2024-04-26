public class Voyelles {
    /* Écrivez vos fonctions ici */
	public static int vowels (String word){
	    int n=0;
		for (int i=0; i<word.length();i++){
		    if (word.charAt(i)=='a' || word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='e'){
		        n=n+1;
		    }
		    else {
		        n=n+0;
		    }
        }
        return n;
    }
    
    public static void main(String[] args) {
        /* Écrivez vos tests ici */
  System.out.println(vowels("Hello World!"));
    }
}

