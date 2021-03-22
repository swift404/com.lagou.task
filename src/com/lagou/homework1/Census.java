package com.lagou.homework1;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月10日 4:37 下午
 */
public class Census {


    public static void main(String[] args) {
        //1.先将字符串转为数组
        System.out.println("请输入要计数的字符串，输入后按回车键开始计数");
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] ch1 = s1.toCharArray();
        int big =0;
        int small =0;
        int num =0;
        int other=0;
        //遍历数组，将数组所有元素都进行筛选
        for (int i = 0; i < ch1.length; i++) {
            if('A'<= ch1[i]&&ch1[i]<='Z'){
                big++;
                System.out.println("发现大写字母"+String.valueOf(ch1[i])+"，目前大写字母已有"+big+"个");
            }  else if ('a'<=ch1[i]&&'z'>=ch1[i]) {
                small++;
                System.out.println("发现小写字母"+String.valueOf(ch1[i])+"，目前大写字母已有"+small+"个");
            }else if ('0'<=ch1[i]&&'9'>=ch1[i]){
                num++;
                System.out.println("发现数字"+String.valueOf(ch1[i])+"，目前大写字母已有"+num+"个");

            }else {
                other++;
                System.out.println("发现字符"+String.valueOf(ch1[i])+"，目前大写字母已有"+other+"个");
            }
        }
        System.out.println("大写字母有"+big+"个");
        System.out.println("小写字母有"+small+"个");
        System.out.println("数字有"+num+"个");
        System.out.println("符号有有"+other+"个");
    }

    }

