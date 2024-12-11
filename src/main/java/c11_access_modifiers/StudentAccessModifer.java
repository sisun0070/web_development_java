package c11_access_modifiers;
/*
    접근지정자(Access Modifier) :
        클래스, 메서드, (플드) 변수 등에 대한 접근 권한을 제어하는 데 사용됨.

        종류 :
            1) public : 모든 클래서에서 접근할 수 잇음
            2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
               자식 클래스에서 접근 가능
            3) default(package-private) : 접근 지정자를 명시하지 않으면
                default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
            4) private : 같은 클래스 내에서만 접근 가능
 */

public class StudentAccessModifer {
    private int studentCode;
    private String studentName;
    private double studentAverage;

        // 기본 생성자 / 매개 변수 생성자 전부 선언하세요
    StudentAccessModifer () {}

    public StudentAccessModifer(int studentCode) {
        this.studentCode = studentCode;
    }

    public StudentAccessModifer(String studentName) {
        this.studentName = studentName;
    }

    public StudentAccessModifer(double studentAverage) {
        this.studentAverage = studentAverage;
    }

    public StudentAccessModifer(int studentCode, String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
    }

    public StudentAccessModifer(int studentCode, double studentAverage) {
        this.studentCode = studentCode;
        this.studentAverage = studentAverage;
    }

    public StudentAccessModifer(String studentName, double studentAverage) {
        this.studentName = studentName;
        this.studentAverage = studentAverage;
    }

    public StudentAccessModifer(int studentCode, String studentName, double studentAverage) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAverage = studentAverage;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentAverage() {
        return studentAverage;
    }

    public void setStudentAverage(double studentAverage) {
        this.studentAverage = studentAverage;
    }

    // showInfo() 메서드를 public으로 정의하세요

    public void showInfo() {
        System.out.println(studentName + "학생의 학번은 " + studentCode + "이며, 평균 점수는 " + studentAverage + "점입니다.");
    }



    // 실행 예
    // 황지선 학생의 학번은 20241205이며, 평균 점수는 100.0입니다.

    // alt + insert 후에 아무런 필드를 선택하지 않는다는 것은 기본 생성자를 만들겠다는 의미
    // 해당 코드가 있는 이유는 기본적으로는 기본 생성자가 default이지만
    // 하나라도 생성자를 정의하는 순간 기본 생성자 역시 명시적으로 정의돼있어야 하기 때문



}
