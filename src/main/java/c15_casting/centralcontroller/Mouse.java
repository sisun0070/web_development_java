package c15_casting.centralcontroller;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("마우스 전원을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스 전원을 끕니다.");
    }

    // 클래스 고유의 메서드 생성
    public void leftClick() {
        System.out.println("왼쪽 버튼 클릭");
    }
}
