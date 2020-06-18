package club.lylgjiavg.v1ch03.section3;

/**
 * @Classname FloatTest
 * @Description 3.3.2 浮点类型
 * @Date 2020/6/18 16:24
 * @Created by 姜立成
 */
public class FloatTest {

    public static void main(String[] args) {

        float floatVariable = 3.14f;
        System.out.println("floatVariable = " + floatVariable);

        double doubleVariable = 3.1415926;
        System.out.println("doubleVariable = " + doubleVariable);

        double hexVariable = 0Xap-1;
        System.out.println("hexVariable = " + hexVariable);

        double decVariable = 2.0e-3;
        System.out.println("decVariable = " + decVariable);

        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println("positiveInfinity = " + positiveInfinity);

        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("negativeInfinity = " + negativeInfinity);

        double nan = Double.NaN;
        System.out.println("nan = " + nan);

        System.out.println("Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY : " + (Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY)); // true
        System.out.println("Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY : " + (Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY)); // true
        System.out.println("Double.NaN == Double.NaN : " + (Double.NaN == Double.NaN)); // false
        System.out.println("Double.isNaN(Double.NaN) : " + (Double.isNaN(Double.NaN))); // true



    }

}
