package cn.itcast.day07;

/*
方法有参数（小括号里有内容）/

无参数（）小括号留空
 */

public class Demo03MethodParam {

    public static void main(String[] args) {
        sum(5,6);
        method();
    }//乘法运算，必须给两个数
    //有参数

    public static void sum(int a,int b) {
        int result=a*b;
        System.out.println("结果是："+result);

    }

    //打印10次文本字符串
    //无参数
    public static void method() {

        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");

        }

    }
}
