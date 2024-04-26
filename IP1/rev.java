import java.util.Random;
public class rev{
  /* La procédure suivante renvoie un entier tiré au hasard entre min et max. */
  public static int randInt (int min, int max) {
      int randomNum = rand.nextInt((max - min) + 1) + min;
      return randomNum;
  }
  static Random rand = new Random ();

  //met des tiret a la place des lettre du mot s
  public static void pendu (String s){
    String res="";
    for (int i=0;i<s.length();i++){
      res=res+"-";
    }
    System.out.println(res);
  }
  //afiche un mot a l'envers
  public static void envers (String s){
    for (int i=s.length()-1;i>=0;i=i-1){
      System.out.print(s.charAt(i));
    }
    System.out.println();
  }
  //les nombres cardinaux en anglais
  public static void printOrdinal (int n){
    String res=String.valueOf(n);
    if(res.charAt(res.length()-2)=='1'){
      System.out.println(n +"th");
    }
    if(n==1 || (res.charAt(res.length()-1)=='1' && n!=11)){
      System.out.println(n+"st");
    }
    if(n==2 || (res.charAt(res.length()-1)=='2' && n!=12)){
      System.out.println(n+"nd");
    }
    if(n==3 || (res.charAt(res.length()-1)=='3' && n!=13)){
      System.out.println(n+"rd");
    }
    if( (res.charAt(res.length()-1)!='1') || (res.charAt(res.length()-1)=='2') || (res.charAt(res.length()-1)=='3') ){
      System.out.println(n +"th");
    }
  }
  //affiche tout les diviseurs du nombre n
  public static void divisors (int n){
    for (int i=1;i<n;i++){
      if(n%i==0){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
  // dire si c nombre n est parfait (un nombre parfait est un nombre qui == a la somme de ses diviseurs hors lui meme )
  public static void isPerfect (int n){
    int s=0;
    for (int i=1;i<n;i++){
      if(n%i==0){
        s=s+i;
      }
    }
    if(n==s){
      System.out.println(n +" est parfait");
    }
  }

  //affiche tout les nombre parfait a partir d'un certain rang
  public static void enumPerfect (int m){
    for(int i=1;i<=m;i++){
      isPerfect(i);
    }
  }
  //faire un triangle avec des *
  public static void triangle (int n){
    for (int i=1;i<=n;i++){
      for (int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  //savoir si un nombre est premier
  public static boolean isPrime (int n){
    int res=0;
    for (int i=1;i<=n;i++){
      if(n%i==0){
        res++;
      }
    }
    if(res==2){
      return true;
    }
    return false;
  }
  //la somme des nombre premier de 1 a n
  public static int sumPrime (int n){
    int res=0;
    for (int i=1;i<=n;i++){
      if(isPrime(i)){ //deja une expression booleanne donc pas besoin de faire ==true
        res=res+i;
      }
    }
    return res;
  }
  //si une valeur est dans un tableau /comparaison de tableau
  public static int plagiarism (int[] t,int[] s){
    for (int i=0;i<t.length;i++){
      for(int j=0;j<s.length;j++){
        if(t[i]==s[j]){
          return i;
        }
      }
    }
    return -1;
  }
  //renvoie l'indice d'une valeur qui apparafit 2 fois dans un tableau
  public static int autoPlagiarism (int[] s){
    for(int i=0;i<s.length;i++){
      for (int j=0;j<i;j++){
        if(s[i]==s[j]){
          return i;
        }
      }
    }
    return -1;
  }
  //exam 2020-2021
  //exo3-1:
  public static boolean checkNumero(String ch){
    if(ch.length()==10 && ch.charAt(0)=='U' && ch.charAt(1)=='P' ){
      return true;
    }
    return false;
  }
  //exo3-2:
  public static boolean checkTab (String[] tab){
    if(tab.length==10 && tab[0].equals("U") && tab[1].equals("P") ){
      return true;
    }
    return false;
  }
  //exo3-3:
  public static boolean checkDiff (String[] tab){
    for (int i=0;i<tab.length;i++){
      for (int j=0;j<i;j++){
        if(tab[i]==tab[j]){
          return true ;
        }
      }
    }
    return false;
  }
  //exo3-4:
  public static boolean plusGrand (String ch1, String ch2){
    String res="";
    String res1="";
    for(int i=2;i<ch1.length();i++){
      res=res+ch1.charAt(i);
      res1=res1+ch2.charAt(i);
    }
    int aux=Integer.valueOf(res);
    int aux1=Integer.valueOf(res1);
    if(checkNumero(ch1) && checkNumero(ch2) && aux>aux1){
      return true;
    }
    return false;
  }
  //exo3-5
  public static boolean present (String[] tab,String st){
    for (int i=0;i<tab.length;i++){
      if(tab[i].equals(st)){
        return true;
      }
    }
    return false;
  }
  //exo3-6
  public static String[] formeGroupe(String[] tab,int n){
    String[] t=new String[n];
    if(n>0 && n<tab.length){
      for(int i=0;i<n;i++){
        int s=randInt(0,tab.length-1);
        t[i]=tab[s];
      }
    }
    return t;
  }
  //exo4-1
  public static int filmsVus (int[][] vote, int i){
    int res=0;
    if (i>(vote.length-1)){
      return -1;
    }
    for (int n=i;n<=i;n++){
      for(int j=0;j<vote[n].length;j++){
        if (vote[i][j]==0 || vote[i][j]==1){
          res=res+1;
        }
      }
    }
    return res;
  }
  //exo4-2
  public static int plusAime (int[][] vote){
    int res=0;
    for(int i=0;i<vote.length-2;i++){
      if(vote[i][0]==vote[i+1][0] && vote[i+1][0]==vote[i+2][0]){
        res=i;
      }
    }
    return res;
  }







  public static void array (int[] t){
    for(int i=0;i<t.length;i++){
      System.out.print(t[i]+ " ");
    }
    System.out.println();
  }
  public static void Sarray(String[] t){
    for(int i=0;i<t.length;i++){
      System.out.print(t[i]+" ");
    }
    System.out.println();
  }
  public static void main (String[] args){
    pendu("majda");
    envers("majda");
    printOrdinal(44);
    divisors(60);
    isPerfect(28);
    enumPerfect(10);
    triangle(5);
    System.out.println(isPrime(9));
    System.out.println(sumPrime(10));
    int[] t={6,2,1,8,6};
    int[] s={4,5,0,1};
    System.out.println(plagiarism(t,s));
    System.out.println(autoPlagiarism(t));
    System.out.println(checkNumero("UP50218932"));
    String[] tab={"U","P","5","0","2","1","8","9","3","2"};
    System.out.println(checkTab(tab));
    System.out.println(checkDiff(tab));
    System.out.println(plusGrand("UP13009734","UP12009735"));
    System.out.println(present(tab,"P"));
    String[] yup={"UP13009734","UP12009735","UP50218932","UP22007501","UP22206003"};
    Sarray(formeGroupe(yup,3));
    int [][] vo={{0,0,0},{1,0,-1},{1,1,-1},{0,1,0},{0,1,0}};
    System.out.println(filmsVus(vo,1));
    System.out.println(plusAime(vo));
    

    /*String jour = "";
    char n='a';
    switch( n ) {
      case 'a' : jour = "Lundi";
      break;
      case 'b': jour = "Mardi";
      break;
      case 'c': jour = "Mercredi";
      break;
      case 'd' : jour = "Jeudi";
      break;
      case 'e':jour = "Vendredi";
      break;
      case 'f' : jour = "Samedi";
      break;
      case 'g' : jour = "Dimance";
      break;
      default : jour = "Invalide";
      break;
    }
    System.out.println(jour);*/
  }
}
