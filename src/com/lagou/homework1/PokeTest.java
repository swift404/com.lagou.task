package com.lagou.homework1;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月16日 4:30 下午
 */
public class PokeTest {
    public static void main(String[] args) {
        //1、准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker = new HashMap<>();

        //创建一个List集合，存储牌的索引，也就是上边Map集合中的key值
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //定义两个集合，一个用来存储花色，一个用来存储牌的序号
        List<String> colors = List.of("♠","♥","♦","♣");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");

        //将大王和小王存储到集合中
        int index = 0;                  //定义一个键的索引
        poker.put(index,"大王");        //添加大王到集合的0索引
        pokerIndex.add(index);
        index ++;
        poker.put(index,"小王");        //添加小王到集合的1索引
        pokerIndex.add(index);
        index ++;

        //采用双重 foreach 来循环遍历两个集合，将花牌和序号进行拼接，组成54张牌，并添加到 poker 集合中
        //类似于二维数组 [4][13] 打印的棋盘,棋盘上的每一点就相当于一张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);     //从2索引开始添加牌
                pokerIndex.add(index);                //每加一张牌，便把该牌的索引也加到集合中
                index ++;
            }
        }


        //2、洗牌  将牌的索引顺序打乱  使用 Collections 中的 shuffle(List) 方法
        Collections.shuffle(pokerIndex);

        //3、发牌
        //定义4个集合，存储玩家牌的索引和底牌的索引
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //遍历索引集合，获取每一张牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if ( i >= 51){    //最后三张为底牌
                //给底牌发牌
                diPai.add(in);
            }else if ( i % 3 == 0){    //给玩家1发牌
                player1.add(in);
            }else if ( i % 3 == 1){    //给玩家2发牌
                player2.add(in);
            }else if ( i % 3 == 2){    //给玩家3发牌
                player3.add(in);
            }
        }

        //4、排序  默认升序排列
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);

        //5、看牌
        lookPoker("旺财1", poker, player1);
        lookPoker("旺财2", poker, player2);
        lookPoker("旺财3", poker, player3);
        lookPoker("底牌", poker, diPai);
    }

    //看牌方法  遍历上述4个集合并打印
    public static void lookPoker(String name, HashMap<Integer,String> poker, ArrayList<Integer> list){
        System.out.print(name + ":");

        //获取牌的索引
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();         //打印完每个玩家进行换行
    }

}
