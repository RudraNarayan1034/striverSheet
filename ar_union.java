public class ar_union{
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++){
            arr.add(a[i]);
        }
        for(int i=0;i<m;i++){
            arr.add(b[i]);
        }


        Collections.sort(arr);
        int i=0;
        for(int j=1;j<n+m;j++){
            if(arr.get(j)!=arr.get(i)){
                arr.set(i+1,arr.get(j));
                i++;
            }
        }
        return arr.subList(0,i+1);
        
        
        
    }
}