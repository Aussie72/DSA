public class Rotate{
public static void rotate(char[] ch, int d){
        d = d%ch.length;
        reverse(ch, 0, d-1);
        reverse(ch, d, ch.length-1);
        reverse(ch, 0, ch.length-1);
    }
    public static void reverse(char[] arr, int start, int end){
        char temp;
        
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        String str = "Geeks for Geeks";
        char[] ch = str.toCharArray();
        
        rotate(ch,2);
        for(int i=0; i<ch.length;i++){
            System.out.print(ch[i]);
        }
        
    }
}