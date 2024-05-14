class CountPrime {
    public int countPrimes(int n) {
        int count =0;
        if(n ==1|| n ==0) return count;
       else {
           while (n >1){
               for(int i=2;i<n;i++){
                   if (i !=n){
                       count ++;
                    }
                    else {
                        if(n%i!=0){
                           continue;
                       }
                   }
               }
               n--;
           }
       }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count of prime numbers to 30 is: " + new CountPrime().countPrimes(10));
    }
}