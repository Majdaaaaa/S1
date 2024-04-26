import java.util.Random;
public class sudoku {
    public static int[][] grilleSimple (){
        int[][] t={{1,2,3,4,5,6,7,8,9},{4,5,6,7,8,9,1,2,3},{7,8,9,1,2,3,4,5,6},{2,3,1,5,6,4,8,9,7},{5,6,4,8,9,7,2,3,1},{8,9,7,2,3,1,5,6,4},{3,1,2,6,4,5,9,7,8},{6,4,5,9,7,8,3,1,2},{9,7,8,3,1,2,6,4,5}};
        return t;
    }
    
    public static void afficheGrille (int[][] t){
        for (int i=0;i<t.length;i++){
            for (int j=0; j<t[i].length;j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void echangeLignes (int a, int b, int[][]t){
        int[][] aux= new int[t.length][t.length];
        for (int i=0;i<t.length;i++){
                aux[i][i]=t[a][i];
                t[a][i]=t[b][i];
                t[b][i]=aux[i][i];          
        }
    }
    
    public static void echangeColonnes (int a, int b, int[][]t){
        int[][] aux= new int[t.length][t.length];
        for (int i=0;i<t.length;i++){
                aux[i][i]=t[i][a];
                t[i][a]=t[i][b];
                t[i][b]=aux[i][i];          
        }
    }
    
    public static Random rand = new Random () ;
    public static int randRange ( int a , int b ) {
        return rand.nextInt (b - a ) + a ;
    }
    
    public static void echangeLignesAleatoire (int[][] t){
        int i=randRange(0,3);
        int j=randRange(0,3);
        int k=randRange(0,3);
        int[][]aux =  new int[t.length][t.length];
        for (int y=0;y<t.length;y++){
            aux[y][y]=t[i+3*j][y];
            t[i+3*j][y]=t[k+3*j][y];
            t[k+3*j][y]=aux[y][y];       
        }
    }
    
    public static void echangeColonnesAleatoire (int[][] t){
        int i=randRange(0,3);
        int j=randRange(0,3);
        int k=randRange(0,3);
        int[][]aux =  new int[t.length][t.length];
        for (int y=0;y<t.length;y++){
            aux[y][y]=t[y][i+3*j];
            t[y][i+3*j]=t[y][k+3*j];
            t[y][k+3*j]=aux[y][y];       
        }
    }
    
    public static int[][] produitGrillePleineAleatoire (int n){
        int[][] t=grilleSimple(); 
        for (int i=0;i<=n;i++){
        int h=randRange(0,2);
            if(h==0){
                echangeLignesAleatoire(t);
            }else {
                echangeColonnesAleatoire(t);
            }
        }
        return t;
    }
    
    public static int[][] produitGrille (int n,int m){
        int[][] t= produitGrillePleineAleatoire(n);
        for(int p=0;p<=m;p++){
            int i=randRange(0,9);
            int j=randRange(0,9);
            t[i][j]=0;   
        }
        return t;
    }
    
    public static int[][] aide (int i, int j){
        int[][]t= produitGrille(i,j);
        for (int n=0;n<t.length;n++){
            for(int m=0;m<t[n].length;m++){
                
        }
    }





    public static void main (String[] args){
        int t[][] = grilleSimple();
        //afficheGrille(t);     
        afficheGrille(produitGrille(5,5));
    }






}
