package cn.itcast.day07;
/*
题目要求：
1.定义一个方法，用来【求出】两个数字之和
2.定义一个方法，用来【打印】两个数之和
*/


public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(5, 6);
        System.out.println("结果是" + num);

        System.out.println(getSum(7,8));
        printMethod(5,8);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;//谁调用getSum，就把计算结果给谁

    }

    public static void printMethod(int a, int b) {
        int result = a + b;
        //没有返回值，不把结果告诉任何人，直接打印输出。因此用void型
        System.out.println(result);
    }
}



