import java.util.*;

class DeckReveal {
    public static int[] deckRevealedIncreasing(int[] deck) {
        // Arrays.sort(deck);
        int ans[] = new int[deck.length];
        return helper(deck, 0, ans, 0);
    }

    public static int[] helper(int deck[], int index, int ans[], int top) {
        if (index == deck.length || top == deck.length) {
            return ans;
        }

        rotate(deck, 1);
        ans[top] = deck[top];
        return helper(deck, index + 1, ans, top + 1);
    }

    static int[] rotate(int arr[],int k){
        while (k==0) {
            return arr;
        }
            int temp = arr[0];
    
            for(int i =0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
    
            return rotate(arr, k-1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 13, 3, 11, 5, 17, 7 };
        int res[] = deckRevealedIncreasing(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
}
