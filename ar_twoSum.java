import java.util.HashMap;

public class ar_twoSum {
    public static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            int s=book[i];
            int x=target-s;
            if(mp.containsKey(x)){
                return "YES";
            }
            mp.put(book[i],i);
           
        }
        return "NO";
    
    }
    
}
