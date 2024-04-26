public class Concatenation {
    /* Écrivez vos fonctions ici */
    public static String concatNTimes (String s, int n){
        if (n>0){
            for (int i=0;i<=n;i++){
                System.out.print(s);
            }
        }
        else {
            return "";
        }
       return "";
    }

    public static void main(String[] args) {
        /* Écrivez vos tests ici */
        System.out.println(concatNTimes("M",7));
    }
}
