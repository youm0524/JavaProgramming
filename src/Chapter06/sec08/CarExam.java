package Chapter06.sec08;

public class CarExam {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setGas(5);

        if(myCar.isLeftGas()){
            System.out.println("출발");
            myCar.run();
        }
        System.out.println("gas 주입 필요");
    }
}
