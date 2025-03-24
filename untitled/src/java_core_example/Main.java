package java_core_example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Thread.activeCount;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(4568, 1234);
        Object acc1id = acc1.getId();
        //int acc1id = (int) acc1.getId();
        System.out.println(acc1id);

//        Account acc2 = new Account("id1234", 4321);
//        System.out.println(acc2.getId());
//
//        Date date = new Date();
//        Date date1 = new java.sql.Date(9999999999L);
//
//        System.out.println(date);
//        System.out.println(date1);
//
//        Calendar calendar = new GregorianCalendar(2025, 0, 18);
//
//        System.out.println(calendar.getTime());
        System.out.println(getSumOfDigits(711));


    }
    public static int getSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
class Account {
    private Object id;
    private int sum;

    public Account(Object id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}


//Integer x = 200;
//        Integer y = new Integer(123);//исключения не будет, но не желательно делать new
//        int x = 5;
//        Integer xx = Integer.valueOf(x);//ручное преобразование примитива в объект
//        int y = xx.intValue();//ручное преобразование объекта в примитив
//        System.out.println(y);
// String s = "6454";
//        System.out.println(Integer.parseInt(s));
//
//        Main m = new Main();
//
//        System.out.println();
//
//        String[] strings = new String[]{"потому", "что", "расчет", "может", "вызвать"};
//
//        //Arrays.sort(strings);//обычный по дефолту алфавитный сорт у класса String
//        Arrays.sort(strings, new LengthStringComparator ());//сорт по длине слов
//        System.out.println(Arrays.toString(strings));
//    }
//}
//class LengthStringComparator implements Comparator<String> {
//
//    public int compare(String firstStr, String secondStr) {
//        return Integer.compare(firstStr.length(),secondStr.length());
//    }
//}
//        List ar = new ArrayList();
//        ar.add(69);
//        ar.add("ssdd");
//        ar.add(56);
//        System.out.println(ar);
//    int[] array = {6, 1, 4, 7, 9, 0, 15, 3, 8, 30, 20};
//
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == 0)
//                continue;
//            if(array[i] % 3 == 0 && array[i] % 5 == 0)
//                System.out.println("FIZZBAZZ");
//
//            else if(array[i] % 3 == 0)
//                System.out.println("FIZZ");
//
//            else if(array[i] % 5 == 0)
//                System.out.println("BAZZ");
//        }
//        System.out.println("__________________________________________________________");
//
//        Arrays.stream(array)
//                .filter(num -> num != 0) // Skip 0
//                .forEach(num -> {
//                    if (num % 3 == 0 && num % 5 == 0) {
//                        System.out.println("FIZZBUZZ");
//                    } else if (num % 3 == 0) {
//                        System.out.println("FIZZ");
//                    } else if (num % 5 == 0) {
//                        System.out.println("BUZZ");
//                    }
//                });

//        Predicate<Integer> isnum = value -> value == 1;
//        //System.out.println(isnum.test(5));//сравнивает и возвращает boolean
//        String s = "456";
//        int x = Integer.parseInt(s);
//        System.out.println(x);
//
//        String s4 = "123.12";
//        double d = Double.parseDouble(s4);
//        System.out.println(d);
//        double d = 0.5;
//        System.out.println((int)Math.ceil(d));
//        MyThr myThr1 = new MyThr("A", 100);
//        MyThr myThr2 = new MyThr("B", 30);
//        myThr1.start();
//
//        myThr1.join();// main и следующий поток выполнится только после завершения данного потока
//        myThr2.start();
//        System.out.println("Hello java_core_example.Main");

//        myThr.shutdown();

//}
//class MyThr extends Thread {
//    private volatile boolean running = true;
//
//    private final String name;
//    private final int range;
//
//    public MyThr (String name, Integer range) {
//        this.name = name;
//        this.range = range;
//super.setDaemon(isDaemon);//задает самый низкий приоритет и поток может до конца не выполниться, будет прерван после выполнения основного потока
//super.setPriority(priority); приоритет 1 до 10 подается в конструктор
//    }
//    public void run() {
//        int counter = 0;
//        while(counter <= range) {
//            System.out.println(name + " : " + counter++);
//        }
//    }
//    public void shutdown() {
//        this.running = false;
//    }
//}
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
//        Thread thread = new Thread(new Runner());
//        thread.start();
//        myThread.start();
//    }
//class Runner implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Pin");
//        }
//    }
//}
//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Pong");
//        }
//    }
//}
//        Scanner sc = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        while (sc.hasNextInt()) {
//            int x = sc.nextInt();
//            if(x < min) {
//                min = x;
//            }
//        }
//        System.out.println(min);
//        boolean isExit = false;
//        while (!isExit) {
//            int x = 0;
//            String s;
//            while (!isExit){
//                if(sc.hasNextInt())
//                    x += sc.nextInt();
//                else {
//                    s = sc.nextLine();
//                    if(s.equals("EXIT")){
//                        isExit = true;
//                        System.out.println(x);
//                    }
//                }
//            }
//            sc.close();
//
//    public static String x = "qwe";
//    public static void main(String[] args){
//        String a = "asd";
//        String b = "zxc";
//        String c = x.equalsIgnoreCase(b)? "true":"false";
//        System.out.println(c);

//        Scanner sc = new Scanner(System.in);
//        int a, b, c;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        if (a == b && b == c)
//            System.out.println(a + " " + b + " " + c);
//        else if (a == b)
//            System.out.println(a + " " + b);
//        else if (a == c)
//            System.out.println(a + " " + c);
//        else if (b == c)
//            System.out.println(b + " " + c);
//        String m = " , явитесь в военкомат";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Age: ");
//        int age = sc.nextInt();
//
//        if (age >= 18 && age <= 28)
//            System.out.println(name + m);
// binarySearch, low middle high
//        System.out.print(binarySearch(new int[]{1, 4, 5, 6, 7, 9, 15, 16, 22}, 5));
//    public static String binarySearch(int [] a, int x){
//        int low = 0;
//        int high = a.length -1;
//        while (low <= high){
//            int middle = low + (high - low)/2;
//            if (x < a[middle])
//                high = middle -1;
//            else if (x > a[middle])
//                low = middle +1;
//            else
//                return middle + " - индекс элемента: " + x;
//        }
//        return x + " - данный элемент отсутствует в массиве";
//    }
//        System.out.println(linearSearch(new int[]{2, 5, 8, 0, 3, 6, 9, 1, 7}, 3));
//
//    }
//    public static String linearSearch(int [] A, int x){
//        for(int i = 0; i < A.length; i++){
//            if(A[i] == x)
//                return i + " - индекс элемента: " + A[i];
//        }
//        return x + " - данный элемент отсутствует в массиве";
//    }
//Math.метод - класс (коллекция) содержащий статические математические методы, которые можно вызывать не создавая объект этого классы
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ").append("world").append("!");
//        System.out.println(sb);
//        System.out.println(factorial(5));
//
//    }
//    public static int factorial(int n){
//        if (n <= 1)
//            return n;
//        return n * factorial(--n);// или (n - 1)
//    }
//        Season a = Season.AUTUMN;
//        Season b = Season.WINTER;
//        Season c = Season.valueOf("SUMMER");
//        Season.SPRING.monthget();
//        System.out.println(Season.SPRING.monthget());
//        System.out.println(a);
//        System.out.println(a instanceof Season);// а является объектом класса Объект->Season
//        System.out.println(b.name());
//        System.out.println(c);
//        Car asd = new Car(180, 2000, "red");
//        Car qwe = new Car(200, 1800, "red");
//
//        System.out.println(asd.equalse(qwe));// сравнивание объектов по цвету
// с переопределением метода в классе


//        String a = "Hello";
//        String b = "Hello";//b указывает на тот же объект (экономия памяти)
//
//        System.out.println(a == b);//true потому что указывают на один объект

//        String a = new String ("Hello");
//        String b = new String ("Hello");
//        System.out.println(a == b);//false созданы разные объекты
//        System.out.println(a.equals(b));//true
//        System.out.println(a.equals(b) == b.equals(a));//true

//        String a = "Hellodfg";
//        System.out.println(a.substring(0, 5));//метод срезания строки
//
//        String b = "Startpokj".substring(0, 4);
//        System.out.println(b);

//        Scanner sc1 = new Scanner(System.in);
//
//        while (sc1.hasNextInt()) {
//            int x = sc1.nextInt();
//            if (x == 0) {
//                try {
//                    throw new EXCep();
//                } catch (EXCep e) {
//                    System.out.println("Число должно быть больше нуля");
//                }
//            }
//        }
//    File file = new File("wdfsw");
//
//        try {
//            Scanner sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//        System.out.println("После обработки исключения");


//        String a = File.separator;// выставление слэша
//        String b = a + "Users" + a + "User" + a + "Desktop" + a + "test.txt";
//
//        File test = new File(b);
//
//        Scanner abc = new Scanner(test);
//        while(abc.hasNextLine()){
//            System.out.println(abc.nextLine());
//        }
//        abc.close();
//
//        InputStreamReader r = new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\test.txt"));
//
//        Scanner z = new Scanner(r);
//
//        while(z.hasNextLine()){
//            System.out.println(z.nextLine());
//        }
//        abc.close();

//        float a = 48.2F;
//        long b = 3214561445547888598L;
//
//        int c = (int) a;
//        int d = (int) b;
//        int v = 999999999;
//
//        System.out.println(c + "\n" + b + "\n" + v);

//        Integer x = 123;
//        int c = Integer.parseInt("454");
//
//        System.out.println(c);

//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.add(42);
//        list.add(93);
//        list.add(61);
//        list.add(0, 6);
//        System.out.println(list.size() + "\n");
//
//        for (int i : list) {
//            System.out.println(i);
//        }
//        int x = list.get(2); // в х передал элемент 2 индекса
//        System.out.println("\n" + x);

//        Test test = new Test();
//        List list2 = new ArrayList(); //динамический массив
//        list2.add(123);
//        list2.add("cat");
//        list2.add(test); // добавление объекта в массив
//        String a2 = (String) list2.get(1);
//        int a3 = (int) list2.get(0);
//        System.out.println(a2 + "\n" +a3);
//        System.out.println(test);

//        System.out.printf("String %.2f \n",45.225556); //%.2f цифры после запятой с округлением в большую сторону
//        System.out.printf("String %-10d\n",532); //выравнивание по левому краю
//        System.out.printf("String %10d\n",8); //выравнивание по правому краю
//        System.out.printf("String %10d\n",10000);
//        System.out.printf("String %10d\n",100000000);
//        System.out.printf("String %d10",532);/ 10 - ширина символов (длина строки)
//        System.out.printf("This is %s a string, %d", "EFDF", 5676);// про принтФ
//        StringBuilder b = new StringBuilder("Hello");

//        String a = "asdfghj";
//        a = a.toUpperCase();
//
//        b.append(" my").append(" friend").append("!");
//        System.out.println(b.toString());


//        List<Car> testCar = new ArrayList<>();
//        testCar.add(new Car(487456247));
//        asd(testCar);
//        Transport.setCountTr();
//    }
//    private static void asd(List <Car> tr) {
//        for (Car t : tr) {
//            System.out.println("vin №" + t);
//        }
//    }
//    private static void asd(List <Car> tr) {
//        for (Transport t : tr) {
//            System.out.println("vin №" + t);
//        }
//    }
//    private static void asd(List <? extends Transport> tr) {
//        for (Transport t : tr) {
//            System.out.println("vin №" + t);
//        }
//    }
//class Test {
//    String a = "Test";
//    public String toString(){
//        return a;
//    }

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(8);
//        arr.add(60);
//        arr.add(35);
//        arr.add(0, 66);
//        arr.add(2, 9);
//        System.out.println("Количество элементов: " + arr.size() + "\n");
//
//        for(Integer i : arr){
//            System.out.print(i + ", ");
//        }
//        int a = 0;
//        while (true){
//            if (a == 100)
//                break;
//            System.out.println(a);
//            a++;
//        }
//        Random rand = new Random();
//        for (int i = 0; i < 1; i++) {
//            System.out.println(rand.nextInt(6)+1);
//        }

//        System.out.println(Fibonachi.fibEffective(5));

//        CLC calculyator = new CLC();
      /*  Car bmw = new Car(250, 1400, "black", new byte[]{0, 100, 10});
        bmw.engine.setValues(true, 250);
        bmw.engine.info();

        Truck faw = new Truck(140, 3400, "red", new byte[]{100, 0, 100}, true);
        faw.engine.setValues(false, 700);
        faw.engine.info();

        Truck man = new Truck(15, 5000, "wnite", new byte[]{100, 0, 100}, false);

        Transport opel = new Car(250, 1200, "green", new byte[]{10, 20, 10});
        bmw.moveObject(200);
        faw.moveObject(90);

        Car flyCar = new Car(760.9f, 900, "white", new byte[]{0, 20, 10}) {
            @Override
            protected void moveObject(float speed) {
//                super.moveObject(speed);

//                this.engi
ne.isReady(true);
                System.out.println("Машина летит " + speed);
            }
        }

        flyCar.moveObject(400);
        faw.setCountTruck();
        Transport.setCountTr();*/
//        Car amg = new Car("amg");
//        byte[] nums1 = new byte[]{3, 7, 2, 8, 9};
//        int a = summaArray(nums1);
//        System.out.println("Результат: " + a);
//
//        byte[] nums2 = new byte[]{34, 9, 22, 93};
//        int b = summaArray(nums2);
//        System.out.println("Результат: " + b);
//
//        byte[] nums3 = new byte[] {2, 4, 3, 2};
//        int c = summaArray(nums3);
//        System.out.println("Результат: " + c);
//    }
//    public static int summaArray(byte[] num){
//        int a = 0;
//        for(int i = 0; i<num.length; i++)
//            a += num[i];
//        return a;
//    }
//Transport bmw = new Transport();
//bmw.color = "black";
//bmw.speed = 250;
//bmw.weight = 1800;
//System.out.println("цвет: " + bmw.color);
//        CLC c = new CLC();
//        Scanner num = new Scanner(System.in);
//        System.out.print("Введите 1-е число: ");
//        if (num.hasNextInt()) {
//            c.a = num.nextInt();
//        } else {
//            System.out.println("Перезапустите программу и введите число");
//        }

//        System.out.print("Введите 2-е число: ");
//        c.b = num.nextInt();
//        String bb = num.nextLine();
//
//        System.out.print("Напишите действие: ");
//        c.c = num.nextLine();
//        num.close();
//        double z;
//
//        switch (c.c) {
//            case "+":
//                z = c.a + c.b;
//                System.out.print("Результат: " + z);
//            break;
//
//            case "-":
//                z = c.a - c.b;
//                System.out.print("Результат: " - z);
//                break;
//            case "*":
//                z = c.a * c.b;
//                System.out.print("Результат: " * z);
//                break;
//            case "/":
//                if (c.b == 0)
//                    System.out.println("Деление не может быть на 0");
//                else {
//                z = c.a / c.b;
//                System.out.print("Результат: " / z);
//                break;}
//
        /*int[][] nums = {{4, 4, 5, 6}, {9, 8, 3, 7}};
        System.out.println(Arrays.deepToString(nums));
        int a = nums [0][2] + nums [1][0] / nums [1][2];
        System.out.println(a);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }*/