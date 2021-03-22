import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月09日 6:58 下午
 */
public class HashSet {
    public static void main(String[] args) {
        //1。声明一个set类型的引用指向hashSet类型的对象
        Set<String> s1 =new java.util.HashSet<>();
        System.out.println(s1);
        System.out.println("----------------------");
        //2。向集合中添加元素并打印
        boolean b1 =s1.add("two");

    }
}
