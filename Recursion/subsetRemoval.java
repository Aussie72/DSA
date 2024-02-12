public class subsetRemoval{
    public static String removeCharacter(String t){
        if(t.isEmpty()){
            return "";
        }
        char ch = t.charAt(0);
        if(t.startsWith("app") && !t.startsWith("apple")){
            return removeCharacter(t.substring(3));
        } else{
        return ch + removeCharacter(t.substring(1));
        }
        
    }
    public static void main(String[] args){

        String t = removeCharacter("baccapplead");
        System.out.println(t);
    }
}
