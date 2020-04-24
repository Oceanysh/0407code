package cn.itcast.day07.demo04;

/*
   题目：比较两个数据是否相等
 */

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {

        byte a=10;
        byte b=20;
        System.out.println(isName(a,b));

        System.out.println(isName((short)30,(short)40));

        System.out.println(isName(50,60));

        System.out.println(isName(10L,20L));

    }

    public static boolean isSame(byte a,byte b){
        System.out.println("两个BYTE执行");
        boolean name;
        if (a==b){
            name=true;
        }else {
            name= false;
        }
        return name;
    }


    public static boolean isName(short a,short b){
        System.out.println("两个short执行");
        boolean name=a==b?true:false;
        return name;
    }


    public static boolean isName(int a,int b){
        System.out.println("两个INT执行");
        return a==b;

    }

    public static boolean isName(long a,long b){
        System.out.println("两个long执行");
        if (a==b){
            return true;
        }else {
            return false;
        }
    }
}
