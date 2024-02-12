public class mobileKeyPad{
    public static void letter(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i= (digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+ i);
            letter(up.substring(1),p+ch);
        }
        
    }
    public static void main(String[] args){
        letter("24","");
    }
}
