public class Loop5 {
    public static void main(String[] args) {
        int num =7642;
        int copy = num;
        int count=0;
        while(copy !=0){
            copy =copy/10;
            count++;
        }
        int last= num %10;
        int first=0;
        int mid =0;
        
   
        first = num/(int)(Math.pow(10, count-1));
        num/=10 ;
        mid =num%(int)Math.pow(10, count-2); 
        mid = mid*10;
        last =last *(int)Math.pow(10, count-1); 
        // System.out.println(first+" "+mid+" "+last);
        System.out.println(last+mid+first);
    }
}
