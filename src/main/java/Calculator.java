public class Calculator {

    public Calculator(){
    }

    public int bruchrechnung(int a, int b){

        if(b==0) {
            throw new ArithmeticException("Divdide by zero");
        }
        return a/b;

    }
}
