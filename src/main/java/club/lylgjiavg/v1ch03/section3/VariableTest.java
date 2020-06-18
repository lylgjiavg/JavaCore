package club.lylgjiavg.v1ch03.section3;

/**
 * @Classname VariableTest
 * @Description 3.4 变量
 * @Date 2020/6/18 17:23
 * @Created by 姜立成
 */
public class VariableTest {

    enum Size {SL, AS}

    public static void main(String[] args) {

        // 是否可做 java 变量名的字母
        boolean isIdentifierStart = Character.isJavaIdentifierStart('姜');
        System.out.println(isIdentifierStart);

        short a = 1;
        short b = 1;

        int c = a + b;

        Size s =Size.AS;


    }

}
