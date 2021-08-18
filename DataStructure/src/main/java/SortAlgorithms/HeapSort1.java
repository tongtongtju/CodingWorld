package SortAlgorithms;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-08 0:24
 */
public class HeapSort1 {
    //堆排序
    public static void heapSort(int[] arr){

        //将待排序的数组构成一个大顶堆，arr.length/2-1为第一个非叶子节点
        for (int i = arr.length/2-1; i > 0; i--) {
            //初次调整大顶堆为自底向顶调整
            adjustHeap(arr,i,arr.length);
        }
        // 逐步将每个最大值的根节点与末尾元素交换，并且再调整二叉树，使其成为大顶堆
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr,0,i);// 将堆顶记录和当前未经排序子序列的最后一个记录交换
            //之后的大顶堆调整是自顶向下
            adjustHeap(arr,0,i);// 交换之后，需要重新检查堆是否符合大顶堆，不符合则要调整
        }


    }
    //构建堆
    public static void adjustHeap(int[] arr, int i, int length){
        int temp = arr[i]; //取出当前以index为根节点的局部堆的堆值
        //指针k指向i的叶子节点较大的一个值
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if(k+1 < length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){
                arr[i] = arr[k];
                //指针i指向新的值
//                i = k; //这一步不要忘记，如果没有进行
            }else {
                break;
            }
        }
        arr[i] = temp;
    }


    //交换元素位置
    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
