public class Main {
    public static void main(String[] args) {


    }
    static void sayhello(){
        System.out.println("HELLO!");
    }
    ()-> System.out.println("HELLO!");//람다


    void example1(){
        System.out.println(5);
    }
    // 람다
    ()->{
        System.out.println(5);
    }
    int sum(int num1, int num2){
        return num1 + num2;
    }
    (int num1, int num2) ->{return num1+num2;} //람다
    // 메서드 바디 (중괄호)안에 명령문이 하나만 있는 경우 return과
    // 중괄호 생략가능
    (int num1, int num2) -> num1 + num2;
}