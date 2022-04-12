package test.TPlink2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 20, 30, 50, 71, 105};
        System.out.println(index(arr, 50));

    }
    static int index(int[] arr, int key){

        int low = 0;
        int high = arr.length - 1;
        int middle = 0;

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        while(low <= high){
            middle = (low + high) / 2;
            if(arr[middle] > key){

                high = middle - 1;
            }else if(arr[middle] < key){

                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;

    }
}
