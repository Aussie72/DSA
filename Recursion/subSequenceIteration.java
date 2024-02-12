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
    public static List<List<Integer>> subSequenceIterationDuplicate(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            if(i>0 && (arr[i] == arr[i-1])){
                start = end+1;
            }
            end = ans.size()-1;
            int n = ans.size();
            for(int j=start;j<n;j++){
                List<Integer> are = new ArrayList<>(ans.get(j));
                are.add(arr[i]);
                ans.add(are);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args){
        // int arr[] = {1,2,3,4,5};
        // List<List<Integer>> ans = subSequence(arr);
        // for(List list: ans){
        //     System.out.println(list);
        // }
        int arr[] = {1,2,2};
        List<List<Integer>> ans = subSequenceIterationDuplicate(arr);
        for(List list: ans){
            System.out.println(list);
        }
    }
}
