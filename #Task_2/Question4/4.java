class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        ArrayList<Character> al1=new ArrayList<>();
        String s="";
        
     if(l1>l2){
         for(int i=0;i<l2;i++){
             al1.add(word1.charAt(i));
             al1.add(word2.charAt(i));
         }
         for(int i=l2;i<l1;i++){
             al1.add(word1.charAt(i));
         }
         
     }
    else if(l2>l1){
            for(int i=0;i<l1;i++){
             al1.add(word1.charAt(i));
             al1.add(word2.charAt(i));
            }
            for(int i=l1;i<l2;i++){
             al1.add(word2.charAt(i));
            }
            
        }
        else{
            for(int i=0;i<l1;i++){
                al1.add(word1.charAt(i));
                al1.add(word2.charAt(i));
            }
        }
        for(Character c:al1){
            s+=c;
           
        }
        return s;
        
    }
}
