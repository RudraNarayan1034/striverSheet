class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        boolean isSameSize=false;
        for(int i=0;i<asteroids.length;i++){
            isSameSize=false;
            //current Big,Small Stack peek ,stack peek pop
            //Moving right,move left
            while(!stack.isEmpty()&&(stack.peek()>0 && asteroids[i]<0)){
                //checking collision ,pop(smaller)
                if(Math.abs(asteroids[i])>stack.peek()){
                    stack.pop();//smaller one will remove
                    continue;
                }
                else if (Math.abs(asteroids[i])==stack.peek()){ //asteroid size are same
                    stack.pop();
                }
                isSameSize=true;
                 break;
            }
            if(!isSameSize){
                stack.push(asteroids[i]);//push the big one in stack
            }
           
        }
        //store the result
        int result[]=new int[stack.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result; 
    }
}