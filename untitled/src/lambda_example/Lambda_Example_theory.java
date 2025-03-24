package lambda_example;

public class Lambda_Example_theory {
    /*
    Лямбда выражения работают с интерфейсом, в котором есть только 1 абстрактный метод. Такие интерфейсы называются
    функциональными, т.е. пригодными для функционального программирования.

    - примеры короткой записи строго по правилам:
    metodI(() -> 5);//метод интерфейса в параметрах ничего не принимает, подразумевается что return вернет 5

    metodI(s -> s.length());//подразумевает return длины принятого аргумента s

    metodI((String s) -> s.length());//явное обозначение типа, принимаемого в параметрах

    metodI((s, x) -> s.length());//если параметры больше одного то их нужно обернуть в скобки (s, x)

    metod((String s, int x) -> s.length());

    metodI(s -> {return s.length();})//если явно прописать return то обяз-но - ";" и обернуть в фигурные скобки - {}

    Interface i = s -> s.length;//созданная переменная i в данном случае может быть использована многократно

    */
    public static void main(String[] args) {

        abc((x, y) -> x + y);//два аналогичные действия

        abc(new Operation() {
            @Override
            public int getResult(int value1, int value2) {
                return value1+value2;
            }
        });

    }
    static void abc(Operation o){
        System.out.println(o.getResult(5, 6));

    }
}
