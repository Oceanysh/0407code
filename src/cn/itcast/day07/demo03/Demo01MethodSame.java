package cn.itcast.day07.demo03;

/*
题目要求：定义一个方法，判断两个数字是否相同
 */

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isName(10,20));
        System.out.println(isName(20,20));
    }
    /*
    定义方法三要素：
    返回值类型
    方法名称
    参数列表
     */
    public static boolean isName(int a,int b){
        /*boolean name;
        if (a == b) {
            return true;
        }else {return false;
    }*/

        /*boolean name=a==b?true:false;
        return name;*/


        /*boolean name=a==b;
        return name;*/

        return a==b;//保证return后面东西是boolean值
}}
