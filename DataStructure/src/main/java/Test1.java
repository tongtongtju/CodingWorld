import java.io.*;

/**
 * @author 吃西瓜的通酱
 * @createTime 2022-03-23 23:11
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        convert();
    }
    public static void convert() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = null;
        while ((line=bufferedReader.readLine())!=null){
            if("over".equals(line)){
                break;
            }else {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }

        }
        bufferedWriter.close();
    }
}
