package java_core_example;

import java.util.Arrays;

public enum Season {
    SPRING("March", "April", "May"), SUMMER("June", "july", "August"),
    AUTUMN("September", "October", "November"), WINTER("Desember", "January", "February");

    String month1, month2, month3;
    Season(String month1, String month2, String month3){//по умолчанию private
        this.month1 = month1;
        this.month2 = month2;
        this.month3 = month3;
    }
    String monthget(){
        return month1 + ", " + month2 + ", " + month3;
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(Season.valueOf("SPRING").month1);
        Season[] arraySeason = Season.values();
        System.out.println(Arrays.toString(arraySeason));
    }
}
