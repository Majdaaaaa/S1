/* Pour pouvoir générer des nombres aléatoires */
import java.util.Random;

public class Alea {

    /* La procédure suivante renvoie un entier tiré au hasard entre min et max. */
    public static int randInt (int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    static Random rand = new Random ();

    /*********************************/
    /* Fin du code à ne pas modifier */
    /*********************************/
    public static  int  de(){
        int res=randInt(1,6);
        return res;
    }

    public static void yams(){
      int r=de();
      int r1=de();
      int r2=de();
      /*System.out.print(r);
      System.out.print(r1);
      System.out.print(r2 + " /");
      System.out.println();*/
      if(r>r1 && r>r2 && r1>r2){
        System.out.print(r +" ");
        System.out.print(r1 +" ");
        System.out.print(r2 +" ");
      }
      if (r>r1 && r>r2 && r2>r1){
        System.out.print(r +" ");
        System.out.print(r2 +" ");
        System.out.print(r1+" ");
      }
      if(r1>r && r1>r2 && r>r2){
        System.out.print(r1+" ");
        System.out.print(r+" ");
        System.out.print(r2+" ");
      }
      if(r1>r2 && r1>r && r2>r){
        System.out.print(r1+" ");
        System.out.print(r2+" ");
        System.out.print(r+" ");
      }
      if(r2>r1 && r2>r && r1>r){
        System.out.print(r2+" ");
        System.out.print(r1+" ");
        System.out.print(r+" ");
      }
      if(r2>r && r2>r1 && r>r1){
        System.out.print(r2+" ");
        System.out.print(r+" ");
        System.out.print(r1+" ");
      }
      System.out.println();
    }

    public static void main(String[] args) {
      System.out.println(de());
      yams();
    }
}
