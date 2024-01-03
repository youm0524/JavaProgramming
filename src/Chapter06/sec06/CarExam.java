package Chapter06.sec06;

public class CarExam {
    public static void main(String[] args){
        Car myCar = new Car();
        System.out.println("제작 회사 : "+ myCar.company);
        System.out.println("모델 명 : " + myCar.model);
        System.out.println("속도 : " + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정 속도 " + myCar.speed);
    }
}
