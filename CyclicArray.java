import java.util.*;
class CyclicArray {
    static void reverse(int[] arr,int start,int end){
        while(start <= end ){
            int temp;
            temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;            
        }
    }
    static void printarr(int[] arr,int s) {
        for(int i=0;i<=s;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");        
    }
    static void inputarr(int[] arr,int s) {
        Scanner b=new Scanner(System.in);
        System.out.println("enter numbers:");
        for(int i=0;i<=s;i++){
            arr[i]=b.nextInt();
        }
    }
    

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the size");
        int n=a.nextInt();
        int[] arr=new int[n];
        inputarr(arr,n-1);
        System.out.println("enter number of rotations");
        int k=a.nextInt();
        k=k%n;
        if(k!=0){
            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            printarr(arr,n-1);}
        else{
            printarr(arr,n-1);
        }
    }   
}