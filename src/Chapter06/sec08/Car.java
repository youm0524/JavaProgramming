package Chapter06.sec08;

public class Car {
    //필드 선언
    int gas;

    //리턴 없는 메소드로 gas 값 변경
    void setGas(int gas){
        this.gas = gas;
    }

    //gas 필드값이 0이면 false, 0이 아니면 true 리턴하는 boolean
    boolean isLeftGas(){
        if (gas == 0){
            System.out.println("가스가 없슴");
            return false;
        }
        System.out.println("가스가 있슴");
        return true;
    }

    //gas 필드값이 0이면 메소드 종료
    void run(){
        while(true){
            if(gas>0){
                System.out.println("잔량:"+gas);
                gas -=1;
            } else {
                System.out.println("멈춤, 잔량 : "+ gas);
                return; //메소드 종료
            }
        }
    }
}
