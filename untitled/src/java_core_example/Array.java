package java_core_example;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        int[] array = {8, 22, 30, 90, 38, 15, 16};

        Arrays.stream(array)
                .filter(e -> (e % 3) == 0).forEach(e -> System.out.println("ot even"));
    }
}

        //System.out.println(100.0 / 0.0);//выведется Infinity бесконечность
        //System.out.println((1d/0d) / (1d/0d));//Nan - результат деления бесконечности на бесконечность
//        List<Integer> nums = new ArrayList<>();
//
//
//        for(int i = 0; i < 10; i++)
//            nums.add(i * 2);
//
//        //nums.remove(0);// удаление элемента
//        //System.out.println(nums + "\n");
//        nums.addFirst(55);
//        for(int i : nums)
//           System.out.print(i + " ");
//
//        //System.out.println("\n" + nums.get(5));
//        //System.out.println(nums);
//        nums = new LinkedList<>();
//        System.out.println(nums);


//        int[] nums = new int[]{7, 5, 27, 9, 10, 1, 9, 3, 4, 0, 12, 2};
//Arrays.sort(nums);// сортировка массива
//        Integer [] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
//        Arrays.sort(numsBoxed, Comparator.reverseOrder());
//        Arrays.sort(numsBoxed, (a,b) -> (b-a)); 3 строки для сортировки в Stream API в обратной последовательности
//int[] nums2 = Arrays.stream(nums).sorted().toArray();// сортировка с возможностью присвоения в другой массив
// System.out.println(Arrays.toString(nums));

//        boolean asd = true;
//        while (asd) {// O(n²) сортировка пузырьком Bubble sort
//            asd = false;// boolean для прохода несколько раз до отсортировки
//            for (int i = 1; i < nums.length; i++)
//                if (nums[i] < nums[i - 1]) {
//                    swap(nums, i, i - 1);
//                    asd = true;
//                }
//
//        for (int left = 0; left < nums.length; left++) {//O(n²) Selection sort - сортировка выбором
//            int minInd = left;
//            for (int i = left; i < nums.length; i++) {
//                if (nums[i] < nums[minInd])
//                    minInd = i;
//            }
//            swap(nums, left, minInd);
//        }
//        for (int left = 0; left < nums.length; left++) {//O(n²) Insertion sort - сортировка вставками
//            int value = nums[left];
//            int i = left - 1;
//            for (; i >= 0; i--) {
//                if (value < nums[i]) {
//                    nums[i + 1] = nums[i];
//                } else {
//                    break;
//                }
//            }
//            nums[i + 1] = value;
//        }
//        for (int i = 1; i < nums.length; i++) {// Shuttle sort
//            if (nums[i] < nums[i - 1]) {
//                swap(nums, i, i - 1);
//                for (int z = i - 1; (z - 1) >= 0; z--) {
//                    if (nums[z] < nums[z - 1]) {
//                        swap(nums, z, z - 1);
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//int gap = nums.length / 2;
// Пока разница между элементами есть
//        while (gap >= 1) {// Сортировка Шелла
//            for (int right = 0; right < nums.length; right++) {
//                // Смещаем правый указатель, пока не сможем найти такой, что
//                // между ним и элементом до него не будет нужного промежутка
//                for (int c = right - gap; c >= 0; c -= gap) {
//                    if (nums[c] > nums[c + gap]) {
//                        swap(nums, c, c + gap);
//                    }
//                }
//            }
//            // Пересчитываем разрыв
//            gap = gap / 2;
//        }
//mergeSort(nums, 0, nums.length-1);
// System.out.println(Arrays.toString(nums));
//        int a = 5, b = 2;
//        int y = a > b ? a : b;
//        int x = Math.min(a, b);
//        int f = b < 8? 50:100;// тернарное сравнение
//                System.out.println(y + ", " + x + ", " + f);
//        System.out.println(searchNum(nums, 5));
//int[] nums2 = new int[]{4, 2, 9, 3, 6, 1, 9};
//System.out.println(maxNum(nums2));
//        int[] nums3 = new int[]{0, 200, 275, 340, 450, 560, 840, 900, 1200};
//        System.out.println(stopAB(nums3, 300));
//        //int a = 5;
//        //String abc = a > 5 ? "a больше 5" : a < 5 ? "a меньше 5" : "а равно 5";
//        //System.out.println(abc);
//    }
//
//    public static int stopAB(int[] road, int benz) {
//        int result = 0;
//        int stop = 0;
//        while (stop < road.length - 1) {
//            int newstop = stop;
//            while (newstop < road.length - 1 &&
//                    road[newstop + 1] - road[stop] <= benz)
//                newstop++;
//
//            if (newstop == stop)
//                return -1;
//
//            if(newstop < road.length-1)
//                result++;
//            stop = newstop;
//        }
//        return result;
//    }

//    public static String maxNum(int[] a) {
//        Arrays.sort(a);
//        String b = "";
//        for (int i = a.length - 1; i >= 0; i--)
//            b += a[i];
//
//        return b;
//    }

//    public static void mergeSort(int[] source, int left, int right) {//O(n log n) Merge sort сортировка слиянием
//        // Выберем разделитель, т.е. разделим пополам входной массив
//        int delimiter = left + ((right - left) / 2) + 1;
//        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
//        if (delimiter > 0 && right > (left + 1)) {
//            mergeSort(source, left, delimiter - 1);
//            mergeSort(source, delimiter, right);
//        }
//        // Создаём временный массив с нужным размером
//        int[] buffer = new int[right - left + 1];
//        // Начиная от указанной левой границы идём по каждому элементу
//        int cursor = left;
//        for (int i = 0; i < buffer.length; i++) {
// Мы используем delimeter чтобы указывать на элемент из правой части
//            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
//            if (delimiter > right || source[cursor] < source[delimiter]) {
//                buffer[i] = source[cursor];
//                cursor++;
//            } else {
//                buffer[i] = source[delimiter];
//                delimiter++;
//            }
//        }
//        System.arraycopy(buffer, 0, source, left, buffer.length);
//    }


//    public static String searchNum(int[] n, int x) {// бинарный поиск
//        int a = 0;
//        int z = n.length - 1;
//        while (a <= z) {
//            int m = a + (z - a) / 2;
//            if (x < n[m])
//                z = m - 1;
//            else if (x > n[m])
//                a = m + 1;
//            else
//                return m + " - number element: " + x;
//
//        }
//        return x + " - no element";
//    }

//    private static void swap(int[] array, int ind1, int ind2) {
//        int tmp = array[ind1];
//        array[ind1] = array[ind2];
//        array[ind2] = tmp;
//
//    }
