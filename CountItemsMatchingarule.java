{
    public int countMatches(List<List<String>> items, String rulekey, String ruleValue) {
        int c=0;
        for(int i=0;i<items.size();i++)
        {
            
                if(rulekey.equals("type")&&ruleValue.equals(items.get(i).get(0)))c++;

                else if(rulekey.equals("color")&&ruleValue.equals(items.get(i).get(1)))c++;

                else if(rulekey.equals("name")&&ruleValue.equals(items.get(i).get(2)))c++;
            
        }
        return c;
    }
}
