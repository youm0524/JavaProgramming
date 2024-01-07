package Chapter06.sec10;

public class Television {
    static String model = "LCD";
    static String company = "aa";
    static String info;
    static {
        info = company + "-" + model;
    }
}
