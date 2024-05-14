package Hashing;

import java.util.Scanner;

public class Hashing1 {
    static Scanner sc = new Scanner(System.in);
    static void Fetch(int arr[], int num) {
        int n = arr.length;
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter number");
         
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println("Occurence ");
            System.out.println(hash[number]);
        
        }
        
        
        static void FetchCharacter(String s){
            int hash[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) -'a' ]++;
            }
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
            sc.close();
        }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 2, 1, 3 };
        // Fetch(arr, 1);
        String s = "abcdabeh";
        FetchCharacter(s);
    }

}
