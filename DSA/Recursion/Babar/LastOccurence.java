public class LastOccurence {
    public static int last(String s , char x , int index, int ans ){
        if(index>=s.length()){
            return ans;
        }
        if(s.charAt(index)==x){
            ans= index;
        }

       return last(s, x, index+1, ans);

    }


static int RightToLEft(String s, char x,int i,int ans){
    if(i<=0){
        return -1;
    }
    if(s.charAt(i)==x){
        ans=i;
        return ans;
    }
   return RightToLEft(s, x, i-1, ans);
}

    public static void main(String[] args) {
        String s ="abcddef";
        // int x= last(s, 'd', 0, 0);
        int x = RightToLEft(s, 'f', s.length()-1, 0);
        System.out.println(x);
    }
}
