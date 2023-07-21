package methodreference;

import java.util.function.IntBinaryOperator;

public class MethodReferences {
    public static void main(String[] args) {
        IntBinaryOperator operator;
        // 정적 메서드
        // 클래스이름 :: 메서드명
        operator = Calculator::staticMethod;
        System.out.println("정적메서드 결과 : " + operator.applyAsInt(3,5));

        // 인스턴스 메서드
        // 인스턴스명 :: 메서드명
        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과 : " + operator.applyAsInt(3,5));
    }
}
