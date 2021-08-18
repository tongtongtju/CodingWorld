package LeetCode;


/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-02 23:41
 */
public class LeetCode04 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2};

        int[] arr2 = new int[]{3,4};
        LeetCode04 leetCode04 = new LeetCode04();
//        leetCode04.quickSort(arr1,0,arr1.length-1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        double medium = leetCode04.findMedianSortedArrays(arr1, arr2);
        System.out.println(medium);


    }
    //合并数组＋快排
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        int[] intArray = new int[len];
        for (int i = 0; i < len1; i++) {
            intArray[i] = nums1[i];
        }
        for (int i = 0; i < len2; i++) {
            intArray[len1+i] = nums2[i];
        }
        quickSort(intArray,0,len-1);
        if(len%2 == 0){
            return (intArray[len/2-1]+intArray[len/2])/2.0;
        }else {
            return intArray[len/2];
        }

    }
    public void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int pivot = arr[i];
        while(i<j){
            while (i<j && arr[j]>pivot){
                j--;
            }
            if(i<j){
                arr[i++] = arr[j];
            }
            while (i<j && arr[i]<pivot){
                i++;
            }
            if(i<j){
                arr[j--] = arr[i];
            }
        }
        arr[i] = pivot;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }
}
