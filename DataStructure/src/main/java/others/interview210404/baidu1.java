package others.interview210404;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 16:44
 */
public class baidu1 {
    public static void main(String[] args) {
        int i = test1();
        System.out.println(i);
    }
    public static int test1(){
        int a = 20;
        try{
            return a + 20;
        }catch (Exception e){
            System.out.println("test catch Exception");
        }finally {
            System.out.println(a+"");
            a = a + 10;
        }
        return a;
    }
}
