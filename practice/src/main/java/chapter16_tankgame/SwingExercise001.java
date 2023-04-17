package chapter16_tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.Panel;

public class SwingExercise001 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();//创建
        Container cc= jf.getContentPane();//返回窗体ContentPane对象
        cc.setBackground(Color.blue);//设置组件的颜色
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(500, 200);//设置大小
        jf.setLocation(300, 200);//设置位置
        jf.setTitle("中国好！");//设置标题
        JLabel jl = new JLabel("我爱中国！");// 创建一个JLabel标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);// 使标签文字居中
        cc.add(jl); // 将标签添加至容器
        jf.setVisible(true);//设置显示
    }
}
