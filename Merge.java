public class Merge {
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,4,9};

        mergeSort(arr,0,arr.length-1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int arr[],int l, int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            conquer(arr, l, r, mid);
        }
    }

    public static void conquer(int arr[], int l, int r, int mid){

        int merged[]= new int[r-l+1];
        int idx1 = l;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= r){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]= arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        } 

        while(idx1<=mid){
            merged[x++] = arr[idx1];
        }

        while(idx2<=r){
            merged[x++] = arr[idx2];
        }
    }
}
