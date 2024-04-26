public class TD5 {
  //exo5
  public static void swap (int i, int j, int[] tab ){
    //echange de deux variables
    int aux=tab[i];
    tab[i]=tab[j];
    tab[j]=aux;
  }

  public static void printab (int []t){
    //la fonction qui affiche un tableau
    for (int i=0;i<t.length;i++){
      System.out.print(t[i]+" ");
    }
    System.out.println();
  }
  //exo6
  public static void reverse(int [] tab){
    //int[] res=new[tab.length];
    for(int i=0;i<tab.length;i++){
      //res[i]=tab[t.length-i-1];
      swap(i,tab.length-i-1,tab);
    }
    //return tab;
  }

  public static void main (String[] args) {
    int []t = {1,2};
    swap(0,1,t);
    printab(t);
    int []tab= {0, 1, 2, 3, 4, 5};
    System.out.println(reverse(tab));

  }
}
