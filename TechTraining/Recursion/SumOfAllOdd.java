public class SumOfAllOdd {
    static void sum (int n[], int sum){
        sum = sumHelper(n, sum, 0);
        System.out.print(sum);
    }
    static int sumHelper(int n[] ,int sum ,int index ){

        while (index>=n.length) {
            return sum;
        }
            if(n[index]%2==0){
                sum+= 0;
            }
            else
            {
                sum=sum+n[index];
            }
           return sumHelper(n, sum,index+1);

           
    }
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    sum(arr, 0);
    // System.out.println(x);
 }   
}
