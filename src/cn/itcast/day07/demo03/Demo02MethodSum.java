package cn.itcast.day07.demo03;
/*
   题目：定义一个方法，求1到100的和
 */


public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是"+sum());
    }

    /*
    返回值：有
    方法名：sum
    参数列表：无参数，因为1到100确定*/
    public static int sum() {
        int number=0;
        for (int i = 1; i <= 100; i++) {
            number += i;
        }
        return number;
    }
}
