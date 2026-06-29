class Solution {
    public boolean isAnagram(String s, String t){
        ArrayList<Character> l1=new ArrayList<>();
        ArrayList<Character> l2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        l1.add(ch);
        }
        for(int i=0;i<t.length();i++){
        char dh=t.charAt(i);
        l2.add(dh);    
        }
        Collections.sort(l1);
        Collections.sort(l2);

        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        for(int i=0;i<l1.size();i++){
            sb.append(l1.get(i));
        }
        for(int i=0;i<l2.size();i++){
            sb2.append(l2.get(i));
        }
        String m1=sb.toString();
        String m2=sb2.toString();

        return m1.equals(m2);
                
    }
}