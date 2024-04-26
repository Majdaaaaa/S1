public class BouclesDOr {
        /* Écrivez vos fonctions ici */
       public static void count_to( int n){
         for (int i=0; i<=n; i++) {System.out.println (i);
           }
         }
       public static void filter_even (int n) {
           if (n%2==0){System.out.println(n);
           } else {System.out.println("...");
           }
     }
        
       
       
    public static void main(String[] args) {
         /* Écrivez vos tests et le code à exécuter ici */
       for (int i=0; i<=0; i++){System.out.println(i);
       }
        count_to(0);
          
       for (int i=0;i<=65535;i++){filter_even(i);
       }
    }
}
