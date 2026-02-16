class Solution {
    public String toGoatLatin(String sentence) {
        String vowels="aeiouAEIOU";
        String[] words=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String newword;
            if(vowels.indexOf(word.charAt(0)) != -1){
                newword=word+"ma";
            }
            else{
                newword=word.substring(1)+word.charAt(0)+"ma";
            }
            for(int j=0;j<=i;j++){
                newword+="a";
            }
            res.append(newword);
            if(i < words.length - 1 ){
                res.append(" ");
            }
        }
        return res.toString();
    }
}