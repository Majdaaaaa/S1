import java.util.Random;

public class bataille{

  public static int [][]gridComp = new int [10][10];
  public static int [][]gridPlay = new int [10][10];
  public static Random rand = new Random();

  public static int randRange(int a, int b){
    return rand.nextInt(b-a)+a;
  }

  public static String readString(){
    return System.console().readLine();
  }

  public static boolean isInt(String s){
    return s.matches("\\d+");
  }

  public static int readInt(){
    while(true) {
      String s = readString();
      if (isInt(s)) return Integer.parseInt(s);
    }
  }

  public static boolean posOk(int [][]grille, int l, int c, int d, int t){
      if (! ((((l>=0)&&(l<=9)&&(c>=0)&&(c<=9)&&(t>=0))) && (d==1)||(d==2))){
          return false;
      }
      if(d==1){
          for(int i=0;i<t;i=i+1){
              if(c-i<0 || grille[l][c-i]!=0){
                  return false;
              }
          }
          return true;
      }else{
          //vertical
          for(int i=0;i<t;i=i+1){
              if(l+i>=10 || grille[l+i][c]!=0){
                  return false;
              }
          }
          return true;
      }
  }

  public static void initGridComp(){
        //taille des bateaux a inserer
        int[] bateaux={5,4,3,3,2};
        for(int i=0;i<5;i=i+1){
            //on insere le bateau (i+1) de taille bateaux[i] dans gridcomp
            int d=randRange(1,3);
            int l=randRange(0,10);
            int c=randRange(0,10);
            while(posOk(gridComp,l,c,d,bateaux[i])==false){
                d=randRange(1,3);
                l=randRange(0,10);
                c=randRange(0,10);
            }
            //on peut inserer le bateau (i+1)
            if(d==1){
                for(int j=0;j<bateaux[i];j=j+1){
                    gridComp[l][c-j]=i+1;
                }
            }else{
                for(int j=0;j<bateaux[i];j=j+1){
                    gridComp[l+j][c]=i+1;
                }
            }
        }
    }

  public static void printGrid(int[][]grille){
        System.out.println("   A B C D E F G H I J");
        for(int i=0;i<10;i=i+1){
            System.out.print(i+1);
            if(i!=9){
                System.out.print(" ");
            }
            System.out.print(" ");
            for(int j=0;j<10;j=j+1){
                System.out.print(grille[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

  public static int lettreOK(String s){
        //Cette fonction test si s est une lettre valide
        //et renvoie le numero de colonne correspondant
        if(s.equals("A")){
            return 0;
        }else if(s.equals("B")){
            return 1;
        }else if(s.equals("C")){
            return 2;
        }else if(s.equals("D")){
            return 3;
        }else if(s.equals("E")){
            return 4;
        }else if(s.equals("F")){
            return 5;
        }else if(s.equals("G")){
            return 6;
        }else if(s.equals("H")){
            return 7;
        }else if(s.equals("I")){
            return 8;
        }else if(s.equals("J")){
            return 9;
        }else{
            return -1;
        }
    }

  public static int[] placementBateau(String nom){
        String let="Z";
        int c=lettreOK(let);
        while(c==-1){
            System.out.println(" Donnez la lettre pour "+nom);
            let=readString();
            c=lettreOK(let);
        }
        int l=-1;
        while(l<=0 || l>10){
            System.out.println(" Donnez le nombre pour "+nom);
            l=readInt();
        }
        int d=-1;
        while(d!=1 && d!=2){
            System.out.println("Voulez-vous qu'il soit horizontal(1) ou vertical (2)?");
            d=readInt();
        }
        int[]ret={l-1,c,d};
        return ret;
    }

  public static void initGridPlay(){
        String[]nom={"porte-avions","croiseur","contre-torpilleurs","sous-marin","torpilleur"};
        int[] bateaux={5,4,3,3,2};
        for(int i=0;i<5;i=i+1){
            int[] place=placementBateau(nom[i]);
            int l=place[0];
            int c=place[1];
            int d=place[2];
            while(posOk(gridPlay,l,c,d,bateaux[i])==false){
                System.out.println("Erreur: Le "+nom[i]+" ne rentre pas dans la grille");
                place=placementBateau(nom[i]);
                l=place[0];
                c=place[1];
                d=place[2];
            }
            if(d==1){
                for(int j=0;j<bateaux[i];j=j+1){
                    gridPlay[l][c-j]=i+1;
                }
            }else{
                for(int j=0;j<bateaux[i];j=j+1){
                    gridPlay[l+j][c]=i+1;
                }
            }
        }

    }

  public static boolean hasDrowned (int[][] grid, int b){
    //juste pour savoir si un bateau est encore la ou pas
    for(int i=0;i<grid.length;i++){
      for (int j=0;j<grid[i].length;j++){
        if (grid[i][j]==b){
          return false;
        }
      }
    }
    return true;
  }

  public static void oneMove (int[][] grid, int l,int c){
    //fais un coup et verifie si le coup est a l'eau si il a touché un bateau ou qu'il la coulé
  }

    public static void main(String[] args){
        initGridComp();
        System.out.println("Grille de l'ordinateur :");
        printGrid(gridComp);
        initGridPlay();
        System.out.println("Grille du joueur :");
        printGrid(gridPlay);
        System.out.println(hasDrowned(gridPlay,5));
    }

}
