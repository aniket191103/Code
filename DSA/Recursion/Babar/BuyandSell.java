public class BuyandSell {
    static void Buy_Sell(int price[],int i ,int min , int max){
        if(i >=price.length){
            System.out.println(max);
            return;
        }
            if(price[i]<min){
                min = price[i];
        }


        if(max<price[i]-min){
            max=price[i]-min;
        }
        Buy_Sell(price, i+1, min, max);
    }
 public static void main(String[] args) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int arr []= {7,1,5,3,6,4};
    Buy_Sell(arr, 0,min, max);
 }   
}
