public class TP8b{
    //Exo1:
    public static void printLines (int[][]t){
        for (int i=0;i<t.length;i++){
            for (int j=0;j<t[i].length;j++){
               System.out.print(t[i][j]);
               System.out.print(" ");
            }
            System.out.println("");
        }
    }
    //Exo2-1:
    public static int[][] squareOfZeros (int n){
        int [][] res= new int [n][n];
        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[i].length;j++){
                res[i][j]=0;
            }
        }
        return res;
    }
    //Exo2-2:
    public static int[][] rectOfInt (int n, int p){
        int u=0;
        int [][] res= new int [n][p];
        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[i].length/2;j++){
                u=u+1;
                res[i][j]=u;

            }
        }
        return res;
    }
    //Exo2-3:
    public static int[][] triangleOfInt (int n){
        int [][]res= new int [n][];
        int t=1;
        int u=1;
        for (int i=0;i<n;i++){
            res[i]=new int [t];
            for (int k=0;k<t;k++){
                res[i][k]=u;
                u++;
            }
            t++;
        }
        return res;
    }
    //Exo2-4
    public static int[][] target (int n){
      int[][] res= new int[n][n];

      int y=0;
      for (int i=0;i<res.length;i++){
        for (int j=0;j<res[i].length-1;j++){
          //bordé de 1:
          res[i][j-j]=j-(j-1);
          res[i-i][j]=j-(j-1);
          res[i][n-1]=j-(j-1);
          res[n-1][j]=j-(j-1);
        }
      }
      for (int i=0;i<res.length;i++){
        for (int j=0;j<n/2;j++){
          //diagonale:(mais a faire avec j<n)
          /*res[j-j][j-j]=j-(j-1);
          res[j-(j-1)][j-(j-1)]=j-(j-2);
          res[j-(j-2)][j-(j-2)]=j-(j-3);
          res[j-(j-3)][j-(j-3)]=j-(j-3);
          res[j-(j-4)][j-(j-4)]=j-(j-2);*/
          //ligne par ligne:
          int r=1;
          r=r+j;
          res[n-(n-1)][j]=r;
        }
      }
      for (int i=0;i<res.length;i++){
        for (int j=0;j<n/2;j++){

        }
      }

      return res;
    }





    public static void main (String args[]) {
        //Exo1:
        //int [][]tab = {{1, 2, 3}, {4}, {5, 6}};
        int[][]tab= new int [3][];
        tab[0]= new int [3];
        tab[1]=new int [1];
        tab[2]=new int [2];
        tab[0][0]=1;
        tab[0][1]=2;
        tab[0][2]=3;
        tab[1][0]=4;
        tab[2][0]=5;
        tab[2][1]=6;
        printLines(tab);
        //Exo2-1:
        printLines(squareOfZeros(3));
        //Exo2-2:
        printLines(rectOfInt(2,3));
        //Exo2-3:
        printLines(triangleOfInt(3));
        //Exo2-4
        printLines(target(8));
    }
}
