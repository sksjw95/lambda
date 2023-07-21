package lambda3;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) throws Exception{
        MyFunctionalInterface example;

        example = (x,y)->{
            int result = x+y;
            return result;
        };
        int result1 = example.accept(2,5);
        System.out.println(result1);

        example = (x,y)->{
            return x+y;
        };
        int result2 = example.accept(2,5);
        System.out.println(result2);


        // 중괄호 안에 명령문이 한 줄만 있는 경우 중괄호와 return 생략 가능
        example = (x,y)-> x+y;
        int result3 = example.accept(2,5);
        System.out.println(result3);

        example = (x,y)-> sum(x,y);
        int result4 = example.accept(2,5);
        System.out.println(result4);
    }
    public static  int sum(int x, int y){
        return x+y;
    }
}
