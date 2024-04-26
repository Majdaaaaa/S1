import java.io.IOException;

public class Display {
  public static int[][] negatif (int[][]t ){
    int[][] res= new int [t.length][t.length];
    for (int i=0;i<t.length;i++){
      for(int j=0;j<t[i].length;j++){
        res[i][j]=-t[i][j]+255;
      }
    }
    return res;
  }




  public static void array (int[][] t){
    for (int i=0;i<t.length;i++){
      for(int j=0;j<t[i].length;j++){
        System.out.print(t[i][j]+ " ");
      }
    }
    System.out.println();
  }


  public static void main(String[] args) throws IOException {
    int[][] t={{0, 128, 255}, {128, 255, 255}, {255,255,255}};
    array(negatif(t));

  }
  public static int [][] getGray(String filename) throws IOException {
      Picture p = new Picture(filename);
      return p.getGray();
  }
  public static void drawGray(int [][] gray) {
    Picture p = new Picture(gray);
    p.draw();
  }
  public static void saveGray(int [][] gray, String filename) throws IOException {
    Picture p = new Picture(gray);
    p.save(filename);
  }
}
