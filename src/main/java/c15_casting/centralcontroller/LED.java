package c15_casting.centralcontroller;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED의 전원을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }

    // 지시사항 1번
    public void changeColor() {
        System.out.println("색깔을 바꿉니다.");
    }
}
