//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int arr[])
    {
        //code here
        List<Integer>result=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        //previous /left smaller element
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                result.add(-1);
                stack.push(arr[i]);
            }
            else{
                while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                    stack.pop();
                }
                result.add(stack.isEmpty()?-1:stack.peek());
                stack.push(arr[i]);
            }
        }
        return result;
    }
}