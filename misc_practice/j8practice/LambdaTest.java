public class LambdaTest{

    public static void main(String[] args) {
        LambdaInterface lambdaInterface = (int x) -> x * x;
        System.out.println(lambdaInterface.getSquare(5));
    }

}
