public class Accord {
    /* Écrivez vos fonctions ici */
       public static String withSIfNeeded (String name , int n){
          if (n>=2) {return name;
          } else {return (name + "s");
          }
        } 
    public static void main(String[] args) {
        /* Écrivez vos tests ici */
        System.out.println(withSIfNeeded("pomme",1));
        

    }
}
