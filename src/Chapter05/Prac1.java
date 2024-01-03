package Chapter05;

public class Prac1 {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int count = 0; // 전체 몇개인지 세기 위한 변수 선언
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j<array[i].length ;j++){
                sum += array[i][j];
                count++;
            }
        }
        double avg = sum / (double)count;
        System.out.println(avg);
    }
}
