import java.util.ArrayList;
import java.util.List;

public class ar_superiorElement {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        int n=a.length;
        ArrayList<Integer> ans= new ArrayList<>();
        int max = a[n - 1];

        ans.add(a[n-1]);
        for (int i = n - 2; i >= 0; i--){
        if (a[i] > max) {
            ans.add(a[i]);
            max = a[i];
        }}

    return ans;
   
    }
}
