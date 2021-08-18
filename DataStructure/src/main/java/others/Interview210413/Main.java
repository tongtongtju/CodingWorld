package others.Interview210413;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-13 21:57
 * 斜对角打印矩阵，美团面试编程
 */
public class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        //System.out.println("Hello World!");
        int[][] matrix = new int[][]{
            {1,2,3},{4,5,6},{7,8,9}
        };
        int[] ints = printMatrix(matrix);
        for (int anInt : ints) {
            System.out.print(anInt+"");
        }
    }
    public static int[] printMatrix(int[][] matrix){
        if (matrix.length == 0){
            return new int[0];
        }
        int length = matrix.length;
        int[] result = new int[length*length];
        int m = 0, n = 0, index = 0; //定义横纵坐标及result索引
        for (int i = 0; i < 2 * length - 1; i++) {
            if(i%2 == 0){
                while(m>=0 && n < length){
                    result[index] = matrix[m][n];
                    index++;
                    m--;
                    n++;
                }
                if(n<length){
                    m++;
                }else{
                    m = m + 2;
                    n--;
                }
            }else{
                while(m<length && n>=0){
                    result[index] = matrix[m][n];
                    index++;
                    m++;
                    n--;
                }
                if(m<length){
                    n++;
                }else{
                    m--;
                    n = n + 2;
                }
            }
        }
        return result;
    }
}
