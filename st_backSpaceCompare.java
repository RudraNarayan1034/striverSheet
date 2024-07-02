class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first=remainInStack(s);
        String second=remainInStack(t);
        return first.equals(second);
    }
    String remainInStack(String str){
        StringBuilder stack=new StringBuilder();
        for(char singleChar:str.toCharArray()){
            if(singleChar!='#'){
                stack.append(singleChar);//similar to push at end
            }
            else if(stack.length()>0){
                //backsapce char found
                //remove the last inserted character
                stack.deleteCharAt(stack.length()-1);
            }
        }
        return stack.toString();//stringbuilder convert to string
    }
}