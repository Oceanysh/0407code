package cn.itcast.day07;

/*
   参数：进入方法的数据；
   返回值：从方法中出来的数据

   定义方法的完整格式：

   修饰符 返回值类型 方法名称（参数类型 参数名称....）{

           方法体
           return 返回值；
   }


   返回值类型固定为void 这种只能单独调用 不能打印调用或赋值调用
 */

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用：方法名称（参数）；
        sum(10,20);

        //打印调用：System.out.println(方法名称（参数））；
        System.out.println(sum(10,20));

        //赋值调用：数据类型 变量名称=方法名称（参数）；
        int number=sum(50,20);
        System.out.println(number);


    }

    public static int sum(int a,int b){
        int result=a+b;
        return  result;
    }
}
