public class Calculator {
    int result; //the "int" here is the instance variable
    public int add(int num1, int num2){ //the "int" here is the return type. "num1" and "num2" are local variables
        result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addValue = calculator.add(10,20); //the integers here are called arguments
    }
}
