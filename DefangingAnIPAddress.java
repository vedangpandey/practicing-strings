class Solution {
    public String defangIPaddr(String s) {
        StringBuilder st=new StringBuilder();
        String[] sm=s.split("\\.");
        int i=0;
        for(;i<sm.length-1;i++)
        {
            st.append(sm[i]+"[.]");
        }
        st.append(sm[i]);
        return new String(st);
    }
}