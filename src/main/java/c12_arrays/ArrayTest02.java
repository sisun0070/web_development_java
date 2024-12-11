package c12_arrays;
/*
    String[] names 배열을 선언하고
    출석부의 이름을 입력하도록 하여, names 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇 명의 학생을 등록하겠습니까? >>> 12
    1 번 학생 이름 : 강미경
    2 번 학생 이름 : 권상재
    3 번 학생 이름 : 김용환
    4 번 학생 이름 : 김은수
    5 번 학생 이름 : 박경호
    6 번 학생 이름 : 박수빈
    7 번 학생 이름 : 염진우
    8 번 학생 이름 : 이시후
    9 번 학생 이름 : 이하온
    10 번 학생 이름 : 장시원
    11 번 학생 이름 : 황지선
    12 번 학생 이름 : 옥진서

    [출력 결과]
    1. 강미경
    2. 권상재
    ...
    12. 옥진서

    -> count에 선언된 수 만큼 학생 이름을 입력할 수 있도록 반복문을 작성해야 함.

 */
import java.util.Scanner;
public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇 개짜리 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;

        // 배열의 크기를 결정 짓기 위해서
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        count = scanner.nextInt();
        // 위에서 .nextInt()를 사용했고, 밑에 학생 이름을 입력 받을 예정이기 때문에
        scanner.nextLine(); // 베리어를 미리 작성

        // String 배열 선언 및 초기화
        String[] names = new String[count];

        // 학생의 이름은 count 횟수만큼 입력 받기 위한 반복문 작성
        for (int i = 0; i < count ;  i++) {
            System.out.print((i+1) + " 번 학생 이름 : " );
            names[i] = scanner.nextLine();
        }

        // 학생의 이름을 출력하기 위한 반복문 작성
        System.out.println("[출력 결과]");
        // count만큼 입력 받았기 때문에 count = names.length
        for (int i = 0; i < names.length ;  i++) {

            System.out.println((i+1)+"." + names[i] );
        }






    }
}