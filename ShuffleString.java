class Solution {
    public String restoreString(String s, int[] in) {
        char[] ch=new char[s.length()];
        for(int i=0;i<in.length;i++)
        {
            ch[in[i]]=s.charAt(i);
        }
        return String.valueOf(ch);
    }
}