public class MaxSubArrayProduct {
    public static int Product(int arr[]){
        int n = arr.length;
        int product =Integer.MIN_VALUE;
        int current_product=1;
        int newProduct= 0;
        int j =0;
        int i =0;
        while (i<n-1) {
            j=i+1;
        current_product = arr[i]*arr[j];

        newProduct=Math.max(current_product, product);
            product=newProduct;
            i++;

    }
    if(n<=1){
        return arr[0];
    }
    
            return product;
    }


        public static int kedane(int arr[]){
            int n =arr.length;
            int product=Integer.MIN_VALUE;
            int prefix=1;int suffix=1;
            for(int i=0;i<n;i++){
                    if(prefix==0) prefix=1;
                    if(suffix==0)suffix=1;
                    prefix*=arr[i];
                    suffix*=arr[n-i-1];
                    product= Math.max(product, Math.max(suffix, prefix));

            }
            return product;
        }

        
    
    public static void main(String[] args) {
        int arr[]={6,-5,4};
        int arr2[]= {-2,92};
        System.out.print(kedane(arr2));
    }
}
