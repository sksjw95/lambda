
// 매개변수와 리턴값이 없는 람다식

package lambda;

public class Main3 {
    public static void main(String[] args) {
       // MyFunctionalInterface myFunctionalInterface = ()->{}; // 아무 값도 출력은 안되지만 오류는 아니다.
        MyFunctionalInterface example = ()-> System.out.println("accept()호출");
        example.accept();

    }

}
