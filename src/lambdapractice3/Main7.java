package lambdapractice3;

public class Main7 {
    public static void main(String[] args) {
        //중괄호 안에 명령문이 한줄인 경우 return과 중괄호 생략가능
        Game3 game3 = ()-> "lambda";
        System.out.println(game3.play());
    }
}
