import calculator.MathCalculatorProxy;

/**Tao lớp trung gian MathCalculatorProxy để kiểm soát truy cập vào MathCalculator
 * khi gọ thì gián tiếp thông qua MathCalculatorProxy*/

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();
        double result = mathCalculatorProxy.add(1, 2);
        System.out.println("1 + 2 = " + result);
        result = mathCalculatorProxy.add(1, Double.MAX_VALUE);
        System.out.println("1 + Double.MAX_VALUE = " + result);
    }
}
