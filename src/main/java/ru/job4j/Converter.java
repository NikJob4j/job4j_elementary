package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl;
        rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl;
        rsl = value / 50;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        System.out.println("140 rubles are " + dollar + " dollar.");
        float in2 = 140;
        float expected2 = 2;
        float out2 = Converter.rubleToEuro(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed2);
    }
}
