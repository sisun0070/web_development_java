package c05_scanner;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            음식점에서 팁을 계산하는 것을 원화 기준으로 한다면?

            10, 12, 15 퍼센트 중 하나를 선택

            인원수를 입력 받아서, 더치페이를 할 수 있도록 구현

            ex)
            100000원짜리 음식을 결제하고, 팁으로 10퍼센트를 준다면
            전체 음식값은 110000원이 된다.
            5명이서 나눈다면, 22000원이 결과값이 됨.

         */
        // 1. 음식 가격을 입력 받아야 함 -> 물어보고 / 입력 받는다 -> scanner

        // 2. 몇 % 퍼센트의 팁을 낼 건지 입력 받아야 함

        // 3. 입력 받은 % 에서 / 100을 연산 해야 함.

        // 4. 3의 결과값 * 1의 결과값을 하게 되면 팁의 가격이 산출됨.

        // 5. 1의 결과값 + 4의 결과값을 하면 전체 음식 가격이 산출됨.

        // 6. 인원수를 입력 받아야 함.

        // 7. 5의 결과값 / 6의 결과값 = 팁을 포함한 더치페이 가격이 산출됨.
//        int foodPrice;
//        int percent;
//        int totalPrice; // 팁과 음식 가격을 합친 데이터의 변수명
//        int people;     // 더치페이 할 인원수를 나타내는 변수명
//        int pricePerPerson; // 1인 당 지불해야하는 가격을 나타내는 변수명
//
//        System.out.print("음식의 가격은 얼마입니까? >>> ");
//        foodPrice = scanner.nextInt();
//        System.out.print("몇 %의 팁을 내기를 원하십니까, 10, 12, 15% 중 하나를 선택하세요 >>> ");
//        percent = scanner.nextInt();
//        // totalPrice를 연산하시오.
//        totalPrice = foodPrice + percent*foodPrice/100;
//        // percent / 100을 할 경우 0.1이 나오면 int가 아니라 double이기 때문에 연산 안됨
//        System.out.print("몇 명이서 나누어 냅니까? >>> ");
//        people = scanner.nextInt();
//        pricePerPerson = totalPrice / people;
//        System.out.println("1인당 지불해야 하는 금액은 " + pricePerPerson + "원입니다.");

    // 20241127 시작 시 -> 밴드네임 로고 // 팁 계산기 int 관련 설명 및 복습

        // 사용될 변수 선언
        int foodPrice;
        int percent;
        // 이거 추가함 -> 선언해서 작성하는 이유는 percent를 int로 고정시켰을 경우
        // 수식을 쓰는 방식이 제한됨
        double percentModified;
        // 여기도 int -> double
        double totalPrice;
        int persons;
        double pricePerPerson;
        // 로고 변수 선언 및 초기화 // 다중라인 데이터의 경우 큰 따옴표 세개 -> String
        String logo = """
                
                ████████ ██ ██████   ██████  █████  ██       ██████ ██    ██ ██       █████  ████████  ██████  ██████ \s
                   ██    ██ ██   ██ ██      ██   ██ ██      ██      ██    ██ ██      ██   ██    ██    ██    ██ ██   ██\s
                   ██    ██ ██████  ██      ███████ ██      ██      ██    ██ ██      ███████    ██    ██    ██ ██████ \s
                   ██    ██ ██      ██      ██   ██ ██      ██      ██    ██ ██      ██   ██    ██    ██    ██ ██   ██\s
                   ██    ██ ██       ██████ ██   ██ ███████  ██████  ██████  ███████ ██   ██    ██     ██████  ██   ██\s
                                                                                                                      \s
                                                                                                                      \s
                
                """;


        System.out.println(logo);
        System.out.print("음식의 가격은 얼마입니까? >>> ");
        foodPrice = scanner.nextInt();
        System.out.print("몇 %의 팁을 내기를 원하십니까, 10, 12, 15% 중 하나를 선택하세요 >>> ");
        percent = scanner.nextInt();
        // double로 percent를 형 변환
        percentModified = (double) percent / 100;
//        System.out.println("percentModified = " + percentModified);   -> test code
//        totalPrice = (foodPrice + (foodPrice*percentModified));
        // foodPrice가 동일한 요소이기 때문에 묶어줌
        totalPrice = foodPrice * (1 + (percentModified));
        System.out.print("몇 명이서 나누어 냅니까? >>> ");
        persons = scanner.nextInt();
        pricePerPerson = totalPrice / persons;
        // 변수 선언을 해당 위치에서 한 이유는 형변환을 위해서는 반드시 pricePerPerson이 초기화돼야되기 때문
        int pricePerPersonInt = (int) pricePerPerson;
        System.out.println("1인당 지불해야 하는 금액은 " + pricePerPersonInt + "원입니다.");



    }
}
