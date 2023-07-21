package lambda;

public class Main2 {
    public static void main(String[] args) {
        /*Object obj = new Object(){
            int sum(int num1, int num2){
                return num1 + num2;
            }
        };
        obj.sum(1,2);*/

        Example example = (num1, num2) -> num1 + num2;
        System.out.println(example.sum(10, 15));
    }
}
