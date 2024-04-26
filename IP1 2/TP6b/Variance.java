public class Variance {
  public static int variance (int[] tab){
    int m=0;
    int var=0;
    int aux=0;
    int aux1=0;
    for (int i=0;i<tab.length;i++){
      aux=aux+tab[i];
    }
    m=aux/tab.length;
    for (int j=0;j<tab.length;j++){
      aux1=aux1+((tab[j]-m)*(tab[j]-m));
    }
    var=aux1/tab.length;
    return var;
  }

  public static void main(String[] args) {
    int[] t = {100,1,1,1};
    System.out.println(variance(t));
  }
}
