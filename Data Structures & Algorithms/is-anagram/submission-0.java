class Solution {
    public boolean isAnagram(String s, String t){
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            list.add(ch);
        }
        int count=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(list.contains(ch)){
                count++;
            }
        }
        return count==s.length();
    }
}
