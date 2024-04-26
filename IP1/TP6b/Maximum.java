public class Maximum {
  // Écrivez vos fonctions ici
  public static int maximum(int[] tab){
    int aux=0;
    int res=0;
    for(int i=0;i<tab.length;i++){
      if(tab[i]>aux){
        aux=tab[i];
        res=i;
      }
    }
    return res;
  }
  public static void main(String[] args) {
    int[] tab = {1000,7,1,1,1};
    System.out.print(maximum(tab));
  }
}
