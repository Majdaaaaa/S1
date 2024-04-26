public class TD6 {
  //exo1
  public static String[] funcAB (int a) {
    String[] t = new String[a];
    String s = "ab";
    for (int i = 0; i < a; i++) {
      t[i] = s;
      s = s + "ab";
    }
    return t;
  }
  //exo2
  public static int doublon (String[] t){
    for (int i=0;i<t.length;i++){
      for (int j=i+1;j<t.length;j++){
        if(t[i].equals(t[j])){
          return i;
        }
      }
    }
    return -1;
  }
  //exo3
  public static int[][] table(){
    // pour faire la table de n'importe quel nombre on met un parametre n et donc les 2 10 devienne des n
    int[][] t= new int [10][10];
    for (int i=0;i<t.length;i++){
      for(int j=0;j<t[i].length;j++){
        t[i][j]=(i+1)*(j+1);
      }
    }
    return t;
  }
  //exo4-1
  public static boolean carre (int[][] t){
    //teste que tout les tableaux du tableau t on la meme longeur que le tableau t lui meme ce qui cree un carre
    for (int i=0;i<t.length;i++){
      if(t[i].length!=t.length){
        return false;
      }
    }

    return true;
  }
  //exo4-2
  public static int[] aplatir(int[][] t){
    int[] res= new int[t.length*t.length];
    int ind=0;
    for (int i=0;i<t.length;i++){
      for (int j=0; j<t[i].length;j++){
        res[ind]=t[i][j];
        ind++;
      }
    }
    return res;
  }
  //exo4-3
  public static boolean domaine (int[] t){
    for (int i=0;i<t.length;i++){
      if (t[i]<0 || t[i]>t.length){
        return false;
      }
    }
    return true;
  }
  //exo4-4
  public static boolean differents(int[] t){
    for (int i=0;i<t.length-1;i++){//le -1 c psq on cherche les doublons, on a pas besoin d'aller jusqu'au bout donc si i vas jusqu'au bout ca ne sert a rien psq ya d'autre sur qui tester (comprends stp)
      for (int j=i+1;j<t.length;j++){
        if (t[i]==t[j]){
          return false;
        }
      }
    }
    return true;
  }
  //exo4-5
  public static boolean magique (int[][] t){
    int[] s=aplatir(t);
    if (!carre(t) || !domaine(s) || !differents(s)){
      return false;
    }
    int p=0;
    for (int i=0;i<t.length;i++){
      p=p+t[0][i];
    }
    for (int i=1;i<t.length;i++){
      int q=0;
      for (int j=0;j<t[i].length;j++){
        q=q+t[i][j];
      }
      if (q!=p){
        return false;
      }
    }
    for (int i=1;i<t.length;i++){
      int q=0;
      for (int j=0;j<t[i].length;j++){
        q=q+t[j][i];
      }
      if (q!=p){
        return false;
      }
    }
    int nn =0;
    for (int i=0;i<t.length;i++){
      nn=nn+t[i][i];
    }
    if (nn!=p){
      return false;
    }
    int pp=0;
    for (int i=0;i<t.length;i++){
      pp=pp+t[i][t.length-i-1];
    }
    if (pp!=p){
      return false;
    }
    return true;
  }




  public static void printA (int []t){
    //la fonction qui affiche un tableau
    for (int i=0;i<t.length;i++){
      System.out.print(t[i]+" ");
    }
    System.out.println();
  }
  public static void printS (String[]t){
    for (int i=0;i<t.length;i++){
      System.out.println(t[i]+" ");
    }
  }
  public static void printAA(int[][]t){
    for (int i=0;i<t.length;i++){
      for(int j=0;j<t[i].length;j++){
        System.out.print(t[i][j]+" ");
      }
    System.out.println();
    }
  }


  public static void main (String[] args){
    //exo1
    printS(funcAB(5));
    System.out.println();

    //exo2
    String [] t={"aaa","bbb","ccc","aaa"};
    System.out.println(doublon(t));
    System.out.println();

    //exo3
    printAA(table());
    System.out.println();

    //exo4
    int[][] tab={{2,7,6},{9,5,1},{4,3,8}};
    printA(aplatir(tab));
    System.out.println(magique(tab));


  }
}
