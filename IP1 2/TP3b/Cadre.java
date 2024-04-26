public class Cadre {
       /* Écrivez vos fonctions ici */
       public static void line (int n){
       for (int i=0;i<n;i=i+1){
         System.out.print('#'); 
      }
  }
       public static void frame (String word){
        System.out.print ('+');
        for (int i=0; i<word.length(); i++){
         System.out.print('-');
         }    
         System.out.print("+\n");
          System.out.print('|');
         System.out.print(word);
          System.out.print("|\n");
          System.out.print ('+');
           for (int i=0; i<word.length(); i++){
         System.out.print('-');
         }    
         System.out.print ('+');
         System.out.print('\n');
       
      } 

    public static void main(String[] args) {
        /* Écrivez vos tests ici */
     //line(7);
     frame("Majda");
    }
}
