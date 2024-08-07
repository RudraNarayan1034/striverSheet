class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        int spans[]=new int[n];
        spans[0]=1;
        // Your code here
        //Miantain the indexes(days)
        Stack<Integer>stack =new Stack<>();
        //first price index is 0
        stack.push(0);
        for(int day=1;day<n;day++){
            //Stack pop,currentprice>stack peek price
            while(!stack.isEmpty() && price[day]>=price[stack.peek()]){
                stack.pop();
            }
            spans[day]=stack.isEmpty()?day+1:day-stack.peek();
            stack.push(day);
        }
        return spans;
    }
}
