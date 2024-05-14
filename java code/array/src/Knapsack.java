import java.util.*;

class Knapsack { 

    static int max(int a, int b) { return (a > b) ? a : b; } 

    static int knapSack(int W, int wt[], int val[], int n) { 
        if (n == 0 || W == 0) 
            return 0; 

        if (wt[n - 1] > W) 
            return knapSack(W, wt, val, n - 1); 

        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), 
                    knapSack(W, wt, val, n - 1)); 
    } 

    public static void main(String args[]) { 
        int profit[] = new int[] { 2,3,1,4}; 
        int weight[] = new int[] {3,4,6,5}; 
        int W = 8; 
        int n = profit.length; 
        System.out.println(knapSack(W, weight, profit, n)); 
    } 
}