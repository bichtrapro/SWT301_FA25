package Example;

public class Calcalator {
    public int add(int a, int b){
        return a+b;
    }
    public float divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return (float)a / b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}
