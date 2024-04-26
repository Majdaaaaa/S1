public class TD {
  public static int sumIntArray (int[] t){
    int r=0;
    for (int i=0; i<t.length;i++){
      r=r+1;
    }
    return r;
  }

  public static void moyenne (){
    int d=0;
    int r=0;
    int[] t= {3,5,2,3,6,3,4};
    for (int i=0; i<t.length;i++){
      d=d+t[i];
    }
    r=d/sumIntArray(t);
    //System.out.println(t.length);
    //System.out.println(d);
    System.out.println(r);
  }

  public static int firstOcc(int[] t, int x){
    int res=0;
    for (int i=0;i<t.length;i++){
      if (t[i]==x){
        return i;
      }
    }
    return -1;
  }

  public static int lastOcc(int[] t, int x){
    int res=0;
    for (int i=0;i<t.length-1;i++){
      if (t[i]==x){
        res=res+i;
      }else {
        res=res-1;
      }
    }
    return res;
  }
  public static int[] swap (int[] t){
    int aux =0;
    aux =t[0];
    t[0]=t[t.length-1];
    t[t.length-1]=aux;
    return t;
  }

  public static void printarray (int[] t){
    for (int i=0;i<t.length;i++){
      System.out.print(t[i]+",");
    }
    System.out.println();
  }

  public static int[] array (){
    int[] t=new int[1000];
    for (int i=0;i<1000;i++){
      t[i]=i+1;
    }
    return t;
  }

  public static void array2 (){
    int[] t= new int[8];
    for (int i=0;i<t.length;i++){
      t[i]=2*i+2;
    }
    int[] s=new int[t.length];
    for(int j=0;j<s.length;j++){
      s[j]=t[j]*2;
    }
    printarray(t);
    printarray(s);
  }
  public static int[] array3 (){
    int[] a=new int[10];
    for (int i=0;i<a.length;i++){
      a[i]=i*2;
    }
    return a;
  }

  public static int notZero (int[] t){
    int s = 0;
    for (int i = 0; i < t.length; i++) {
      if (t[i] != 0) {
        s = s + 1;
       }
    }
    return s;
  }

  public static int[] progression (int a,int b,int n){
    int[] t= new int[n];
    for(int i=0; i<n;i++){
      t[i]=a+(i*b);
    }
    return t;
  }

  /*public static int[] intrelace (int[] t1,int[] t2){
    int[] res= new int[t1.length*2];
    int n=0;
    for(int i=0;i<res.length-1;i++){
      if(i%2==0){
        res[i]=t1[n];
      }
      if(i%2!=0){
        res[i]=t2[n];
      }
      n=n+1;
    }

    return res;
  }*/

  public static int plagiarism (int[] t,int[] s){
    for (int i=0; i<t.length;i++){
      for (int j=0;j<s.length;j++){
        if (t[i]==t[j]){
          return i;
        }else {
          return -1;
        }
      }
    }
    return -1;
  }







  public static void main (String[] args){
    /*int [] t={12,-3,22,55,9};
    printarray(swap(t));
    printarray(array());
    array2();
    printarray(array3());
    System.out.println(notZero(t));
    System.out.println(sumIntArray(t));
    moyenne();
    System.out.println(firstOcc(t,2));
    System.out.println(lastOcc(t,1));*/
    int[] t1={0,1,6,2};
    int[] t2={4,4,2,4};
    //printarray(intrelace(t1,t2));
    //printarray(progression(2,2,3));
    System.out.println(plagiarism(t1,t2));
  }
}
