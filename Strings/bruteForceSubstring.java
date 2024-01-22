public class bruteForceSubstring {
    public static void main(String args[]){
        String s = "ABCDEFGGSABCDEFGH";
        String pat = "ABCDEFG";
        
        for (int i =0; i<s.length(); i++){
            for (int j = 0; j<pat.length();j++){
                if (s.charAt(i) == pat.charAt(j)){
                
                    
                    if(j == pat.length()-1){
                        int t = i - pat.length() +1;
                        System.out.println("Present at indices from: "+ t + " to " + i);
                    }
                    
                    i++;
                    
                
                } 
            }
        }

    }
}