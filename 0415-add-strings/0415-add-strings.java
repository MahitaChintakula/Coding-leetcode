class Solution {
    public String addStrings(String num1, String num2) {
        //int num=0,n=0;
        //for(int i=0;i<num1.length();i++){
            //char ch=num1.charAt(i);
            //int digit=ch-'0';
           // num=num*10+digit;
        //}
        //for(int j=0;j<num2.length();j++){
           // char c=num2.charAt(j);
           // int digit2=c-'0';
        //    n=n*10+digit2;
        //}
      //  int sum=num+n;
       // String result="";
       // if(sum==0) return "0";
       // while(sum>0){
            //int rem=sum%10;
            //char add=(char)('0'+rem);
            //result=add+result;
          //  sum=sum/10;
        //}
       // return result;
       int i=num1.length()-1,j=num2.length()-1,carry=0;
       int sum;
       String res="";
       while(i>=0 || j>=0){
        if(i>=0 && j>=0){
            sum=carry+(num1.charAt(i)-'0')+(num2.charAt(j)-'0');
            i--;
            j--;
        }
        else if(i>=0){
            sum=carry+(num1.charAt(i)-'0');
            i--;
        }
        else{
            sum=carry+(num2.charAt(j)-'0');
            j--;
        }
        res=(char)((sum%10)+'0')+res;
        carry=sum/10;
       }
       if(carry>0){
        res=(char)(carry+'0')+res;
       }
       return res;
    }
}