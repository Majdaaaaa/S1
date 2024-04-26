public class LapinBlanc {
       /* Écrivez votre fonction ici */
       public static void secondes (int s){
       int h=s/3600;
       int m=(s%3600)/60;
       int sec=s%60;
      System.out.println(h); 
      System.out.println(m);
      System.out.println(sec);
     }

    public static void main(String[] args) {
       /* Écrivez vos tests */
     secondes(3725);
    }
}
//CA MARCHEEEEEEEE





