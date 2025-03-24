package lambda_example;

public class Lambda {
    //    private static int value1 = 2, value2 = 4;
    public static void main(String... arguments) {

    }
}
// (String[] args) - аналогично
//        int[] nums = {4, 8, -3, 0, -6};
//
//        IntStream.of(0, -9, -8, 3).filter(value -> value < 0).forEach(System.out::println);
//        Arrays.stream(nums).filter(a -> a < 0).forEach(System.out::println);
//
// два аналогичных операций
//        for (int a : nums) if (a < 0) System.out.println(a);

//        Consumer<String> asd = lambda_example.Lambda::pr;
//        asd.accept("qweriuyt");
//    private static void pr(String a) {
//        System.out.println(a);
//System.out.println(getOperation('/').getResult(12 , 6));
//  }
//    private static lambda_example.Operation getOperation(char s) {
//        switch (s) {
//            case '*':
//                return (value1, value2) -> value1 * value2;
//            case '/':
//                return (value1, value2) -> value1 / value2;
//            case '+':
//                return (value1, value2) -> value1 + value2;
//            case '-':
//                return (value1, value2) -> value1 - value2;
//            default:
//                return (value1, value2) -> 0;
//        }
//    }

//        Predicate<Integer> isnum = value -> value == 1;// встроенный интерфейс с методом тест, проверяет соответствие чисел
//        System.out.println(isnum.test(5));
//        System.out.println(isnum.test(0));
//
//        Predicate<String> prr = a -> a == "Star";// проверка строки тем же методом
//        System.out.println(prr.test("Star"));
//        Consumer<String> asd = str1 -> System.out.println(str1);
//Consumer<String> asd = System.out::print;
// asd.accept("Hello")

//        Function<Integer, Double> converter = v -> Double.valueOf(v);
//        System.out.println(converter.apply(6));

//        Supplier<String> text = () -> {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter text: ");
//            return sc.nextLine();
//        };
//        System.out.println(text.get());
//        UnaryOperator<Double> zxc = a -> Math.sqrt(a);// вычисление корня числа
//        System.out.println(zxc.apply(4.0));
//
//        BinaryOperator<Double> asd = (x, z) -> Math.pow(x, z);// возведение в степень
//        System.out.println(asd.apply(2.0, 5.0));// 2 в 5 степени

//        lambda_example.Operation2<Integer> op1 = (a, b) -> a + b;
//        lambda_example.Operation2<String> op2 = (a, b) -> a + b;
//
//        System.out.println(op1.getResult2(5, 8));
//        System.out.println(op2.getResult2("5", "8"));

//        lambda_example.Operation op = (value1, value2) -> value1 + value2;
//
//        System.out.println(op.getResult(4, 7));
//
//        lambda_example.Printer p1 = str -> System.out.println(str);
//        //lambda_example.Printer p1 = System.out::println;
//        p1.pr("Hello");
//
//        Factorial fc = value -> {
//            int result = 1;
//
//            for (int i = 1; i <= value; i++) {
//                result *= i;
//            }
//            return result;
//        };
//        System.out.println(fc.getResult(4));
//
//        System.out.println(factorial(4));// с вызовом обычного метода без лямбды

//    public static int factorial(int n){
//        if (n <= 1)
//            return n;
//        return n * factorial(--n);// или (n - 1)
//    }
