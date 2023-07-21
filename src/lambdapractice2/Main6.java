package lambdapractice2;

public class Main6 {
    public static void main(String[] args) {
        Game2 game2 = (a,b)->{
            System.out.println(a*b);
        };
        game2.play(4,5);
    }
}
