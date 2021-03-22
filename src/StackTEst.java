import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月08日 8:41 下午
 */
public class StackTEst {

    public static void main(String[] args) {
        //1.准备一个Stack类型的对象并打印
        Stack s1 =new Stack();
        System.out.println("S1 = "+s1);
        System.out.println("========================");
        for (int i = 0; i <= 5; i++) {
            Object obj = s1.push(i*11);
            System.out.println("入栈的元素是"+obj );
            System.out.println("栈中的元素有"+s1);//11 22 33 44 55
        }
        /*

         */
        Object obj2 =s1.peek();
        System.out.println("获取到的栈顶元素是"+obj2);
        System.out.println("——————————————————————————————————————");
        //4.对栈中所有元素依次出栈并打印
        int len =s1.size();
        for (int i = 0; i <=len; i++) {
            System.out.println("出栈的元素是"+s1.pop());//55 44 33 22 11

        }

    }
}