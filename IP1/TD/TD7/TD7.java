public class TD7{
  //exo9
  public static boolean isEven (int a){
    /*if (a%2==0){
      return true;
    }else{
      return false;
    }*/
    //VERSION PLUS COURTE:
    return(a%2==0);
  }
  //exo10
  public static boolean findValueTab (int[] t, int v){
    int i=0;
    boolean trouve=false;
    while(i<t.length && !trouve){
      if(t[i]==v){
        trouve=true;
      }
      i++;
    }
    return trouve;
  }
  //exo16
  public static String conversionBinaire(int n){
    String res="";
    while (n>0){
      res=(n%2)+res;
      n=n/2;
    }
    return res;
  }
  //exo19-1
  public static int log (int n){
    int i=0;
    while (n>1){
      n=n/2;
      i++;
    }
    return i;
  }
  //exo22
  //voir tel fonction syracuse
  //exo23
  /*public static void proust (String s){
    int l=80;
    while (l>0){

    }
  }*/


  //decalage circulaire d'un tableau
  public static void shiftRight (int[] t,int n){
    

  }





  public static void main (String[] args){
    //exo5
    /*int a=0;
    int i=0;
    while(i<32){
      a=a+i;
      i++;
    }
    System.out.print(a);*/
    //exo9
    System.out.println(isEven(11));
    //exo16
    System.out.println(conversionBinaire(128));
    //exo19-1
    System.out.println(log(8));

  }
}
