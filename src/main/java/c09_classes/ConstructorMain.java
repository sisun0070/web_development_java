package c09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
//        Constructor constructor0 = new Constructor();    // 기본 생성자는 자동 생성되기 때문에 정의하지 않아도 된 경우
//
//        // constructor0의 필드에 값 대입
//        constructor0.num = 38;
//        constructor0.name = "안근수";
//
//        // 매개변수 생성자1을 사용하여 생성
//        Constructor constructor1 = new Constructor(37);
//
//        // 여러분들 이름과 나이를 construcotr1에 대입하겠습니다.
//        constructor1.num = 20;
//        constructor1.name = "안근순";
//
//        System.out.println(constructor0.name);
//        System.out.println(constructor0.num);
//        System.out.println("----------------------------------------");
//        System.out.println(constructor1.name);
//        System.out.println(constructor1.num);

        // Constructor(String title)을 이용한 객체 생성
//        Constructor constructor4 = new Constructor("김일");
//        constructor4.num = 20;
//        System.out.println(constructor4.name);
//        System.out.println(constructor4.num);

        // Constructor(int num, String name)을 이용한 객체 생성
        Constructor constructor5 = new Constructor(21,"김이");
        System.out.println(constructor5);
        constructor5.showInfo();

        System.out.println(constructor5.toString());



    }
}
