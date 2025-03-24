package java_core_example;

public class Animal {

    String brain = "Изначальное значение brain в классе java_core_example.Animal";
    String heart = "Изначальное значение heart в классе java_core_example.Animal";

    public static int animalCount = 7700000;

    public Animal(String brain, String heart) {
        System.out.println("Выполняется конструктор базового класса java_core_example.Animal");
        System.out.println("Были ли уже проинициализированы переменные класса java_core_example.Animal?");
        System.out.println("Текущее значение статической переменной animalCount = " + animalCount);
        System.out.println("Текущее значение brain в классе java_core_example.Animal = " + this.brain);
        System.out.println("Текущее значение heart в классе java_core_example.Animal = " + this.heart);

        this.brain = brain;
        this.heart = heart;
        System.out.println("Конструктор базового класса java_core_example.Animal завершил работу!");
        System.out.println("Текущее значение brain = " + this.brain);
        System.out.println("Текущее значение heart = " + this.heart);
    }
}

class Cat extends Animal {

    String tail = "Изначальное значение tail в классе java_core_example.Cat";

    static int catsCount = 37;

    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        System.out.println("Конструктор класса java_core_example.Cat начал работу (конструктор java_core_example.Animal уже был выполнен)");
        System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
        System.out.println("Текущее значение tail = " + this.tail);
        this.tail = tail;
        System.out.println("Текущее значение tail = " + this.tail);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
        System.out.println("\n");
        System.out.println(cat instanceof Animal);/*true, Оператор instanceof нужен для того, чтобы проверить,
        был ли объект, на которую ссылается переменная X, создан на основе какого-либо класса Y. Здесь связь
        с классом родителя, т.к. при создании объекта в первую очередь вызывается класс родителя.*/
    }
}
