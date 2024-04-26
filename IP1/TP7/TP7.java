public class TP7{
    public static void letters2word (char[] tab){
        /*2eme methode*/
        /*String res="";*/
        for (int i=0;i<tab.length; i++){
            /*res=res+(tab[i])*/
            System.out.print(tab[i]);
        }
        System.out.println("");
    }
    
    public static void stutterword (char[] tab1, int[] tab2){
        if (tab1.length != tab2.length){
            System.out.println("Erreur");
        }
        else {
            for (int i=0; i<tab1.length; i++){
                for (int j=tab2[i];j>0;j--){
                System.out.print(tab1[i]);
                }
            }
        }
        System.out.println("");
    }
    
    public static char[] word2letters (String m){
        char[] res=new char[m.length()];
        for (int i=0;i<m.length();i++){
            res[i]=m.charAt(i);
        }       
        return res;
    }
    /*tancate ([] t, int size){
        char [] newt= new char[size];
        for (i=0,j<size,j++){
        newt[j]=t[j];
        }
    return newt;
    }
    f (t){
        int pos=0;
        /*initialiser tableau newtt
        for(int i=0,i<t.length;i++){
            if not_in(newtt,t[i] {
                newtt[]=t[i];
                c=c+1;
                }
            }
        }
     not_in(t,c){
        for (int i=o;i<t.lenth,i++){
            if (t[i]==c){
                return true;
                }
            }
        return false; */  /*c un peu ce qu'il faut faire pour la question 4 mais en mal fait */
   
    
            
    
    
    
    
    public static void main (String[] args) {
        char[] tab={'P','l','a','c','a','r','d'};
        letters2word(tab);
        char[] tab1={'a','b','c','d'};
        int[] tab2={2,2,3,4};
        stutterword(tab1,tab2);
        /*c normal que ca affiche une chaine de caractere car c un tableau de characteres:*/
        System.out.println(word2letters("placard"));
        
        
    }


}
