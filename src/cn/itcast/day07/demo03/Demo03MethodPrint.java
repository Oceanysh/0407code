package cn.itcast.day07.demo03;

/*
   题目：定义一个方法，用来打印指定次数的helloworld
 */

public class Demo03MethodPrint {
    public static void main(String[] args) {
anyPrint(5);
    }
    /*
    返回值：只是进行打印，没有返回值
    方法名anyPrint
    参数列表 int i

     */
    public static void anyPrint(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello world"+i);

        }

    }
}
