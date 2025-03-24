package java_core_example;

import java.util.Scanner;

public class CLC {
    private int a;
    private int b;
    private String c;

    Scanner num = new Scanner(System.in);

    public CLC() {
        setNum1();
        setNum2();
        setChar();
//        System.out.println("Результат: " + getSumma());
    }

    public void setNum1() {
        System.out.print("Введите 1-е число: ");
        if(num.hasNextInt()) {
            a = num.nextInt();
        } else {
            System.out.println("Перезапустите программу и введите число");
        }
    }

    public void setNum2() {
        System.out.print("Введите 2-е число: ");
        if(num.hasNextInt()) {
            b = num.nextInt();
        } else {
            System.out.println("Перезапустите программу и введите число");
        }
        String b2 = num.nextLine();
    }
    public void setChar() {
        System.out.print("Напишите действие: ");
        c = num.nextLine();

        if (c.equals("+"))
            System.out.println(a+b);
        else if (c.equals("-"))
            System.out.println(a-b);
        else if (c.equals("*"))
            System.out.println(a*b);
        else if (c.equals("/"))
            System.out.println(a/b);
        else
            System.out.println("Вы ввели не математическое действие. Перезапустите программу и попробуйте еще раз.");
    }
}