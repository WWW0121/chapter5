package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/25 17:22
 */
public class Demo01 {
    public static void main(String[] args) {
        // 类名  对象名 = new 类名（）;
        Uncle uncle1 = new UncleOne();
        if (uncle1 instanceof UncleTwo){
            UncleTwo u2 = (UncleTwo) uncle1;
            u2.faHongbao();
        }
        if (uncle1 instanceof  UncleOne){
            UncleOne u1 = (UncleOne) uncle1;
            u1.chouyan();
            u1.faHongbao();
        }
    }

}
