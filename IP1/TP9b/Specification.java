public class Specification {

  public static String charAtPosition (String s, int i) {
    if (i < 0 || i > s.length()-1) {
      return "";
    } else
      return String.valueOf(s.charAt(i));
  }

  public static int minArray(int[] arr) {
    int min = arr[0];
    if(arr=={ }){
      return 0;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static int[] initArray(int i) {
    int[] arr = new int[i+1];
    for (int j = 0; j<arr.length; j++) {
      arr[j] = j;
    }
    return arr;
  }

  public static int dichotomicSearch(int[] arr, int i) {
    // faut diviser par 2 a chaque fois pour trouver i
    int min = 0;
    int max = arr.length;
    int pos = (min + max) / 2;

    while (min != max) {
      if (arr[pos] < i) {
        min = pos;
      } else if (arr[pos] > i) {
        max = pos;
      } else {
        return pos;
      }
    }
    return -1;
  }

  public static boolean forallNotEmpty(String[] arr) {
    boolean b = false;
    for (int i = 0; i < arr.length; i++) {
      if (!"".equals(arr[i])) {
        b = true;
      }
    }
    return b;
  }

  public static boolean existsPositiveLine(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean b = false;
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] >= 0) {
          b = true;
        }
      }
      if (!b) {
        return false;
      }
    }
    return true;
  }

  //affichage tableau:
  public static void printIntArray(int[] a) {
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i] + " ");
      }
      System.out.println();
  }

  public static void Test1(){
    if(charAtPosition("test",0).equals("t")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("test",5).equals("")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("test",4).equals("")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("",5).equals("")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("",0).equals("")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("",-1).equals("")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("test",-5).equals("")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(charAtPosition("test",3).equals("t")) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }

  public static void Test2(){
    int []arr= {2,5,9,10,4,33,1,3};
    int []arr2={ };
    if(minArray(arr2)==0){
      System.out.println(true);
    } else {
      System.out.println(false);
    }
    if(minArray(arr)==1){
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }

  /*public static void Test3 (){
    if (initArray(0)=={0}){
      System.out.println(true);
    }else {
      System.out.println(false);
    }
    if(initArray(1)=={0,1}){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
    if(initArray(-1)=={}){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
    if(initArray(4)=={0,1,2,3,4}){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }*/


  public static void main (String[] args) {
    Test2();
  }

}
