package SortAlgorithms;


import static SortAlgorithms.HeapSort1.heapSort;

/**
 * @author �����ϵ�ͨ��
 * @createTime 2021-03-19 20:56
 */
public class SortTest {
    public static void main(String[] args) {
//        int[] arr = { 8, 4, 5, 7, 1, 3, 6, 2 };
        int[] arr = {8,4,5,7,1};
//        bubbleSort(arr);
//        insertSort(arr);
//        selectSort(arr);
//        shellSort(arr);
//        quickSort(arr,0,arr.length-1);
        heapSort(arr);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s\t",arr[i]);
        }

    }




    //����
    public static void quickSort(int[] arr, int low, int high){
        int i,j,pivot;
        if(low >= high){
            return;
        }
        i = low;
        j = high;
        pivot = arr[i];
        while(i<j){
            while(i<j && arr[j]>pivot){
                j--;
            }
            if(i<j){
                arr[i++] = arr[j];
            }
            while(i<j && arr[i]<pivot){
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
    //ϣ������
    public static void shellSort(int[] arr){
        int temp;
        for (int gap = arr.length/2; gap>0; gap/=2) {

            for (int i = gap; i < arr.length; i++) {
                for (int j = i-gap; j >= 0; j-=gap) {
                    if (arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }

        }
    }

    //��������
    public static void insertSort(int[] arr){
        //��Ҫ�ҵ������λ�ã��������ֵ
        int insertValue;
        int insertIndex;
        for (int i = 1; i < arr.length; i++) {
            insertValue = arr[i];
            insertIndex = i;//�����λ������ǰһ��ֵ
            while (insertIndex>0 && insertValue<arr[insertIndex-1]){
                arr[insertIndex] = arr[insertIndex-1];
                insertIndex--;
            }
            if(insertIndex!=i){
                arr[insertIndex] = insertValue;
            }
        }
    }
    //ѡ������
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (min>arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex!=i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

    //ð������
    public static void bubbleSort(int[] arr){
        int temp;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            //������е��Ż�
            if(flag){
                flag = false;
            }else{break;}
        }
    }
}

