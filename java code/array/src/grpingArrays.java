import java.util.Scanner;

public class grpingArrays {
    public void function( int arr[]){
for(int i=0;i<arr.length;i++){
    int start=arr[i];
//  System.out.println(arr[i]);

for(int j=i+1;j<arr.length;j++){
    System.out.print("("+start+","+ arr[j]+")"+",");
}
System.out.println();
}
                                                              
    }

    public static void main(String argS[]){
        // int a[]={2,3,4,5,6};
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter size");
        int  n=sc.nextInt();
        int a[]=new int[n];
        for(int i =0;i<a.length;i++){
            System.out.print("enter details");
        a[i]=sc.nextInt();

        }
         grpingArrays b=new grpingArrays();
       b.function(a);
    }
}
