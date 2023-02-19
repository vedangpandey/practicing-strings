class Solution {
    public String interpret(String c) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(;i<c.length()-1;i++)
        {
            if(c.charAt(i)=='G')sb.append("G");
            else if(c.charAt(i)=='('&&c.charAt(i+1)==')')sb.append("o");
            else if(c.charAt(i)=='('&&c.charAt(i+1)=='a')sb.append("al");
        }
        if(c.charAt(i)=='G')sb.append("G");
        return new String(sb);
    }
}