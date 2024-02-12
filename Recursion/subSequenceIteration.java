import java.util.*;
public class subSequenceIteration{
    
    public static List<List<Integer>> subSequence(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int num : arr){
            int n = ans.size();
            for(int i=0;i<n;i++){
                List<Integer> are = new ArrayList<>(ans.get(i));
                are.add(num);
                ans.add(are);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        List<List<Integer>> ans = subSequence(arr);
        for(List list: ans){
            System.out.println(list);
        }
    }
}
