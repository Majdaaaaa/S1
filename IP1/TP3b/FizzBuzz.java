public class FizzBuzz {
    /* Écrivez vos fonctions ici */
    public static String fizzbuzz (int n) {
        for (int i=0;i<=n;i++){
            if (i%3==0){
                return "Fizz";}
            else if (i%5==0){
                return "Buzz";}
             else if (i%3==0 && i%5==0){
                return "Fizz Buzz";}
             else {
                return "";}
       }
       return "";
    }
        
    

    public static void main(String[] args) {
        /* Écrivez vos tests ici */
        System.out.println(fizzbuzz(15));

    }
}
