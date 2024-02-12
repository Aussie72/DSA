import java.util.*;
public class permutations{
    
    public static void permutations(String t, String p){
        if(t.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = t.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(t.substring(1), f+ch+s);
        }
    }
    
    public static void main(String[] args){
        permutations("abc","");
    }
}
