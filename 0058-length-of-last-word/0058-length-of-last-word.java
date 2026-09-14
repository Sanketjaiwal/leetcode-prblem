class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        String[] words = s.split(" ");
        char[] charArray = words[words.length-1].toCharArray();
        for(int i=charArray.length-1;i>=0;i--){
            // if(charArray[i]==' '){
            //     return length;
            // }
            length++;
        }
        return length;
    }
}