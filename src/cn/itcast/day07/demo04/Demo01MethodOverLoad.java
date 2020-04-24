package cn.itcast.day07.demo04;

/*
   对于功能类似的方法，因为参数列表不一样，需要记住很多方法，太麻烦。

   方法重载（Overload):多个方法名称一样，但是参数列表不一样

   好处：只需要记住唯一一个方法名称，就可以实现类似多个功能


   方法重载与下列因素有关：
   1.参数个数不同
   2.参数类型不同
   3.多类型顺序不同


    与下列因素无关
    1.参数的名字
    2.与方法返回值无关*/

public class Demo01MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

    }

    public static int sum(int a, int b) {
        return a + b;

    }


    /*
    错误写法，与参数名字无关，因为把10给a还是给x分不清

    public static int sum(int x, int y) {

        return x+y;

    }
    */


    /*错误写法，与方法返回值类型无关。因为单独调用时候，不用返回值时区分不开
    public static double sum(int a, int b) {
        return a + b;

    }*/


    public static int sum(double a, double b) {
        return (int)(a + b);

    }
    public static int sum(double a, int b) {
        return (int)(a + b);

    }

    public static int sum(int a, double b) {
        return (int)(a + b);

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;

    }
}
