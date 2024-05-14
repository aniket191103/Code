public class ProductExceptSelf  {
        public static int[] productOfArray(int[] arr) {
            int n = arr.length;
            if (n == 1)
                return new int[]{arr[0]};
            int[] answer = new int[n];
            int product = 1;
            for (int i = 0; i < n; i++) {
                product *= arr[i];
                answer[i] = product;
            }
            // Calculate product from the right side and multiply with the left side product
            product = 1;
            for (int i = n - 1; i > 0; i--) {
                answer[i] = answer[i - 1] * product;
                product *= arr[i];
            }
            answer[0] = product; // Assign the product of the rightmost element
            return answer;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            int[] answer = productOfArray(arr);
            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }
        }
    }
