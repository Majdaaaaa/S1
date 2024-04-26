public class Yoda {
      /* Écrivez vos fonctions ici */
       public static void yoda (int n){
        for (int i=0;i<n; i=i+1){ System.out.println ("May the force be with you");
        }
      }
      
        
       
    public static void main(String[] args) {
       /* Écrivez vos tests et le code à exécuter ici */
      /*Q1:  for(int i=0;i<100;i++) {
          System.out.println("May the force be with you.");
        }*/
       yoda (0);
       for ( int i = 0; i < 42; i ++) {
            yoda (100) ;
         }
     /*Q3: il affiche la phrase de yoda 100*42 fois */
        
    }
}
