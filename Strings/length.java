public class length{
    public static void main(String[] args){
        String name = "Kaustubh Desai";
        name = name+'\0';
        int count = 0;
        
        while(name.charAt(count) != '\0'){
            count++;
        }
        System.out.println(count);
        
    }
}