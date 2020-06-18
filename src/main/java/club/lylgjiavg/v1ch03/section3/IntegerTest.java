package club.lylgjiavg.v1ch03.section3;

/**
 * @Classname IntegerTest
 * @Description 3.3.1 整型
 * @Date 2020/6/18 16:09
 * @Created by 姜立成
 */
public class IntegerTest {

    public static void main(String[] args) {

        // 十六进制
        long hexVariable = 0X10;
        System.out.println("hexVariable = " + hexVariable);

        // 八进制
        long octVariable = 010;
        System.out.println("octVariable = " + octVariable);

        // 二进制
        long binVariable = 0B10;
        System.out.println("binVariable = " + binVariable);

        // 十进制
        long decVariable = 10;
        System.out.println("decVariable = " + decVariable);

        int intVariable = 20;
        System.out.println("intVariable = " + intVariable);

        short shortVariable = 20;
        System.out.println("shortVariable = " + shortVariable);

        byte byteVariable = 20;
        System.out.println("byteVariable = " + byteVariable);

        // 编译器自动删除 _
        int underVariable = 10_000_123;
        System.out.println("underVariable = " + underVariable);

    }

}
