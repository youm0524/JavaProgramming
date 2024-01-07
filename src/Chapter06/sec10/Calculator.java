package Chapter06.sec10;

public class Calculator {
    String color;
    void setColor(String color){this.color = color;}
    static double pi = 3.14;  //정적 멤버
    static int plus(int x, int y){return x+y;} //정적 메소드
    static int minus(int x, int y){return x-y;}
}
