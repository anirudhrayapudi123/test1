public class BinarySearch {
    public static void main(String[] args){
    /*    int arr[]={2,4,13,23,34,43,45,54};
        int n=4;
        int first=0;
        int last=arr.length;

        int k=0;
        for(int i=1;i<=arr.length;i++){
            if(first<=last) {
                int mid = first + (last - first) / 2;
                //System.out.println(mid);
                if (n == arr[mid]) {
                    k = mid;
                    break;
                } else if (n > arr[mid]) {
                    first = mid;
                    last = arr.length;
                } else {
                    first = 0;
                    last = mid;
                }
            }
            else{
                break;
            }

        }
        System.out.println(k);
*/
        int arr[]={2,4,23,43,45,54,56,67};
        int target=23;
        int first=0;
        int last=arr.length;
        int k=binarySearch(target,first,last,arr);
        System.out.println(k);
    }
    public static int binarySearch(int target,int first,int last,int[] arr){
        if(first<=last){
            int mid=first+(last-first)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                return binarySearch(target,mid+1,last,arr);
            }
            else if(target<arr[mid]){
                return binarySearch(target,0,mid-1,arr);
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }
}
