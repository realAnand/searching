public class Main {
    public static void main(String args[]){
        int arr[] = {5,10,15,25,35};
        int target = 20;
        System.out.println(binarySearch(arr,target));;
    }

    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
