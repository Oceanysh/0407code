/*
方法格式：
public static void 方法名称（）{
方法体}
 */

package cn.itcast.day07;

public class Demo01Method {
    public static void main(String[] args) {
        Method();

    }

    public static void Method() {
        for (int j = 0; j < 5; j++) {

            for (int i = 0; i < 20; i++) {

                System.out.print("*");
            }

            System.out.println();
        }


    }


}

