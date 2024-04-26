public class Signes {
  public static int[] samesign (int[] t1,int[] t2){
    int[] res= new int[t1.length];
    for (int i=0;i<t1.length;i++){
      if(t1[i]>0 && t2[i]>0 || t1[i]<0 && t2[i]<0){
        res[i]=1;
      }else{
        res[i]=-1;
      }
    }
    return res;
  }

  public static void array (int[] t){
    for (int i=0;i<t.length;i++){
      System.out.print(t[i]+" ,");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] t1 = {1000,1,-1,1};
    int[] t2 = {-1,1,-1,-1000};
    array(samesign(t1,t2));
  }
}
