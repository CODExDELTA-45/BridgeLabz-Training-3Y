import java.util.*;
public class ATM_cal {
    public static void cal(int[] arr){
        int s=0,j=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            if(s<0){
                System.out.println("OverDraft.");
                j++;
                break;
            }
        }
        if(j==0) {
            System.out.println("Final Balance = " + s);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        cal(arr);
    }
}
