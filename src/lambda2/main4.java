
package lambda2;

public class main4 {
    public static void main(String[] args) throws Exception{
        MyFunctionalInterface example ;
        example =(x) ->{
            int result = x * 5;
            System.out.println(result);
        } ;
            example.accept(2);

            example = (x) -> System.out.println(x*5);
            example.accept(2);
    }
}
