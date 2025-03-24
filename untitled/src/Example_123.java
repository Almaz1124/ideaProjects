import java.util.Arrays;
import java.util.HashMap;

public class Example_123 {
    public static void main(String[] args) {
        HashMap<byte[], Integer> hashMap = new HashMap<>();
        byte[] a = {4, 8, 6, 8};
        byte[] b = {4, 5, 6, 8};
        byte[] c = {4, 5, 6, 8};

        hashMap.put(a, 4);
        hashMap.put(b, 5);
        hashMap.put(c, 6);

        System.out.println(c.hashCode());
        System.out.println(hashMap.get(c));

        //c[3] = 127;
        System.out.println(hashMap.get(c));
        System.out.println(b.hashCode());
        System.out.println(hashMap.containsValue(6));

        setNull(a);
        System.out.println(Arrays.toString(a));

        int[] array = {4, 9, 6, 0, 8, 2, 1, 5, 9, 3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 3));
    }
    static void setNull(byte [] x) {/* в параметрах передается массив или объект по ссылке (копия ссылки),
    поэтому изменения будут применены к объекту; с примитивами наоборот передаются по значению (копия значения),
    поэтому результат не будет отображен на самом значении примитива*/
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
        }
    }

    public static int binarySearch(int[] array, int x) {
        int low = 0;

        int high = array.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if (x < array[mid])
                high = mid - 1;

            else if (x > array[mid])
                low = mid + 1;

            else
                return mid;
        }
        return -1;
    }
}

