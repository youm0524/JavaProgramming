package Chapter05;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args){
        int student;
        int[] scores = null;
        boolean run = true;
        System.out.println("1. 학생수 2. 점수 입력 3. 점수 리스트 4. 분석 5. 종료");
        while(run){
            System.out.print("선택 > ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            switch (num){
                case 1:
                    System.out.print("학생수 > ");
                    student = scanner.nextInt();
                    scores = new int[student];
                    break;
                case 2:
                    for(int i = 0; i<scores.length; i++){
                        System.out.printf("scores[%d]>",i);
                        scores[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for(int i = 0; i< scores.length; i++){
                        System.out.printf("socres[%d]: %d",i,scores[i]);
                    }
                    break;
                case 4:
                    int highNum = 0;
                    int sum = 0;
                    for(int i = 0 ; i< scores.length; i++){
                        if(highNum<scores[i]){
                            highNum = scores[i];
                        }
                        sum+=scores[i];
                    }
                    System.out.println(highNum);
                    System.out.println((double) sum / scores.length);
                    break;
                case 5:
                    run = false;
                    break;

            };

        }
    }
}
