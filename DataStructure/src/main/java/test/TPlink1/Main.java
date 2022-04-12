package test.TPlink1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int temp = n;
        while(temp>0){
            temp -= extractBit(a);
            a--;
        }
        System.out.println(extractTuple(a + 1)[Math.abs(temp)]);

    }
    static int extractBit(int a){
        int i = 0;
        while(a>0){
            a = a / 10;
            i++;
        }
        return i;
    }
    static int[] extractTuple(int a){
        int num = extractBit(a);
        int b = 0;
        int[] tuple = new int[num];
        while(a>0){
            b = a%10;
            a = a/10;
            num--;
            tuple[num]=b;
        }
        return tuple;

    }
}
