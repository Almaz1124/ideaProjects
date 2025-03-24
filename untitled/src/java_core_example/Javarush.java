package java_core_example;

import java.util.Arrays;
import java.util.Scanner;

public class Javarush {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);//4 + (4 * 4) слева на право сначала проставляются значения
        //int b = a++ + (--a * a++);//3 + (3 * 3)
        //int z = a++ + ++a;//3 + 5
        System.out.println(b);
    }
}
//        int x = 7;
//        //x = x & 25;
//        x = x & 5;//побитовые операции
//        //x = x & 3;
//        x = x & 12;
//        x = x | 1;
//        System.out.println(x);
//        int[] array = getArr();
//        System.out.println(Arrays.toString(array));
//        System.out.println(getMin(array));
//    }
//
//    public static int[] getArr() {
//        Scanner scanner = new Scanner(System.in);
//        int[] array2 = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = scanner.nextInt();
//        }
//        scanner.close();
//        return array2;
//    }
//
//    public static int getMin(int[] arrayInt) {
//        int x = Integer.MAX_VALUE;
//        for (int i = 0; i < arrayInt.length; i++) {
//            x = Math.min(x, arrayInt[i]);
//        }
//        return x;
//    }
//        String[] s = new String[10];
//        for (int i = 0; i < 10; i++) {
//            s[i] = new String();
//            //System.out.println(new String("" + i));
//            //System.out.println(Arrays.toString(s));
//        }
//        for (int i = 0; i < 5; i++) {
//            int[] a = new int[]{};
//        }
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println(s[5] + "...");
//
//        String s1 = "asd";
//        int x = 5;
//
//        int count = 2;
//        int value;
//        switch (count) {
//            case 1:
//                value = 12;
//                break;
//            case 2:
//                value = 55;
//                break;
//            case 3:
//                value = 52;
//                break;
//            default:
//                value = 0;
//        }
//
//        int value1 = switch (count) {
//            case 1 -> 12;
//            case 2 -> 32;
//            case 3 -> 52;
//            default -> 0;
//        };
//
//        int value2 = switch (count) {
//            case 1, 3, 5 -> 12;
//            case 2, 4, 6 -> 52;
//            default -> 0;
//        };
//
//        int value3 = switch (count) {
//            case 1:
//                yield 12;
//            case 2:
//                yield 22;
//            case 3:
//                yield 55;
//            default:
//                yield 0;
//        };
//        System.out.println(value + "\n" + value1 + "\n" + value2 + "\n" + value3);
//        int[] array = {5, 1, 7, 0, 6};
//        for (int i : array)
//            System.out.println(i);
//
//        fillArray(array, 4);
//        System.out.println(array);
//
//        for (int i : array)
//            System.out.println(i);
//
//        int[] array2 = {0, 12, 5, 9, 2};
//        array2 = Arrays.copyOfRange(array, 0, 12);
//        System.out.println(Arrays.toString(array2));
//    }
//
//    static void fillArray(int[] ar, int value) {
//        for (int i = 0; i < ar.length; i++)
//            ar[i] = value;
//        long num = 3;
//        System.out.println(ninthDegree(num));
//    }
//    public static long cube(long a) {
//        return a * a * a;
//
//    }
//    public static long ninthDegree(long b) {
//        long x = cube(b);
//        return cube(x);
//    }

//        int[] array = {11, 22, 33, 44, 55};
//        printArray(array);
//        reverseArray(array);
//        printArray(array);
//
//    }
//
//    public static void reverseArray(int[] array) {
//        int[] array2 = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = (array2.length - 1) - i; ; ) {
//                array2[j] = array[i];
//                break;
//            }
//
//        }
//        System.out.println();
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = i; ; ) {
//                array[j] = array2[i];
//                break;
//            }
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + ", ");
//        }
//    }
//}
