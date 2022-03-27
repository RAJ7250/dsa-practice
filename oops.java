import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class oops{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



        int max=-1;

        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=max;
            if(curr>max){
                max=curr;
            }

        }
        for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
        }

        // int []array= new int[n];

        // int mx=-1;
        // for(int i=n-1;i>=0;i--){
        //     array[i]=mx;
        //     if(arr[i]>mx){
        //         mx=arr[i];
        //     }
        // }


        // for(int i=0;i<n;i++){
        //     System.out.print(array[i]+" ");
        // }
        
    }
}