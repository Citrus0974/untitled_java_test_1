package edu.khityaev.main;

import edu.khityaev.life.ETemperature;
import edu.khityaev.math.NaturalFraction;
import edu.khityaev.math.NaturalFractionBuilder;
import edu.khityaev.structure.DataBase;

import java.util.HashMap;

public class Start7_1 {

    public static void main(String[] args) {
        System.out.println("7.1.1");
        System.out.println("Метод ofNullable уже был, как и статический пустой объект, добавлено notNullable, бросающее исключение");

        System.out.println("7.1.3");
        NaturalFraction nf1 = NaturalFractionBuilder.getNaturalFraction(7,3);
        System.out.println(nf1);
        System.out.println(nf1.doubleValue());

        System.out.println("7.1.4");
        NaturalFraction nf2 = NaturalFractionBuilder.getNaturalFraction(7,3);
        System.out.println(nf1==nf2);

        System.out.println("7.1.5");
        System.out.println(ETemperature.HOT + "" + ETemperature.NORMAL + ETemperature.COLD);

        System.out.println("7.1.6");
        DataBase db = new DataBase(2);
        DataBase.DBConnection con1 = db.createConnection();
        DataBase.DBConnection con2 = db.createConnection();
        DataBase.DBConnection con3 = db.createConnection();
        System.out.println(con2);
        System.out.println(con3);
        con1.putConverter(Integer.class, Integer::parseInt);
        int test1 = con1.get(Integer.class, 0);
        System.out.println(test1);

        System.out.println("7.1.7");

        System.out.println("7.1.8");

        System.out.println("7.1.9");

    }
}
