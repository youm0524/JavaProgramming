package Chapter06.sec10;

public class CalculatorExa {
    public static void main(String[] args) {
        double result = 10 * 10 * Calculator.pi; // 정적 요소는 클래스 이름으로 접근
        Calculator calculator = new Calculator();
        double result2 = 10 * 10 * calculator.pi; // 이런식으로 객체 참조 변수는 잘 안함

        int result3 = Calculator.minus(5,3);
        int result4 = Calculator.plus(3,4);
        System.out.println("result :"+result3);
        System.out.println("result :"+result4);
    }
}
