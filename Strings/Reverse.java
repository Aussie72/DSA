public class Reverse{
    public static void main(String[] args){
        String name = "Kaustubh Desai";
        String name1 = "";
        
        for (int i=0;i<name.length();i++){
            name1 = name.charAt(i)+name1;
        }
        System.out.println(name1);
    }
}