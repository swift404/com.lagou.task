package com.lagou.homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月13日 8:21 下午
 */
public class MapTest {
    public static void main(String[] args) {
        //1.准备一个Hashmap集合
        Map<String,Integer> m=new HashMap<String,Integer>();
        //2.将要统计的字符串放入Str数组
        String Str1 =new String("123,456,789,123,456");
        String[]Str = Str1.split(",");

        for (int i = 0; i < Str.length; i++) {
            if (!m.containsKey(Str[i])){
                m.put(Str[i],1);
            }else{
                m.put(Str[i],m.get(Str[i])+1);
            }
        }
        System.out.println("m="+m);//m={123=2 456=2, 789=1}
        /*
         Map.entrySet() 这个方法返回的是一个Set<Map.Entry<K,V>>，Map.Entry 是Map中的一个接口，
         他的用途是表示一个映射项（里面有Key和Value），而Set<Map.Entry<K,V>>表示一个映射项的Set。
         Map.Entry里有相应的getKey和getValue方法，即JavaBean，让我们能够从一个项中取出Key和Value。
         */
        //Set<Entry<T,V>> entrySet()该方法返回值就是这个map中各个键值对映射关系的集合。
        Set<Map.Entry<String,Integer>>s1=m.entrySet();
        for (Map.Entry<String,Integer>me1:s1){
            System.out.println(me1);
            System.out.println(me1.getKey()+"出现了"+me1.getValue()+"次！");
        }
    }
}
