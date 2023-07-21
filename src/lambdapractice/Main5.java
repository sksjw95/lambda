package lambdapractice;

public class Main5 {
    public static void main(String[] args) {
        Game game = ()->{
            System.out.println("람다 표현식");
        };
        game.play();
    }
}
