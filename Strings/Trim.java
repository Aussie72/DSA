public class Trim{
    public static void main(String[] args){
        char name[] = "Kaustubh Desai".toCharArray();
        int count = 0;
        for (int i = 0;i<name.length;i++){
            if (name[i] != ' '){
                name[count++] = name[i];
            }
        }
        System.out.println(String.valueOf(name).subSequence(0, count));
        
    }
}