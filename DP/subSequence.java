import java.util.*;
public class subSequence{
    // public static void subSequence(String q, String p){
    //     if(q.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = q.charAt(0);
    //     subSequence(q.substring(1),p+ch);
    //     subSequence(q.substring(1),p);
        
    // }
    public static ArrayList<String> subSequence(String q, String p){
        if(q.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        
        char ch = q.charAt(0);
        ArrayList<String> left = subSequence(q.substring(1),p+ch);
        ArrayList<String> right = subSequence(q.substring(1),p);
        
        left.addAll(right);
        return left;
        
        
    }
    public static void main (String[] args) {
        ArrayList<String> arr = subSequence("abc","");
        for(String string: arr){
            System.out.println(string);
        }
    }
}
