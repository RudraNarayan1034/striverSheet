class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long>stack=new Stack<>();
        long result[]=new long[n];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return result;
    } 
}
