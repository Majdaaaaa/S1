public class Conditions {
      /* Écrivez vos fonctions ici */
         public static int absolute (int x){
           if (x>0) {return x;
        } else {return -x;
        }
 
    }
        public static String solve (int x,int y, int z){
           if (x+y==z) {return "x+y=z";
      	} else if (x-y==z) {return "x-y=z";
      	} else if (-x-y==z) {return "-x-y=z";
      	} else if (-x+y==z) {return "-x+y=z";
      	} else {return "Rien du tout!";
     }	 
    }

    public static void main(String[] args) {
         /* Écrivez vos tests et le code à exécuter ici */
        System.out.println(solve(73,25,10));
        System.out.println(solve(10,10,20));

    }
}

/*q2: 73-37*/
