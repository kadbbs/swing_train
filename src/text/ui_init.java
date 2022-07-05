package text;

import javax.swing.*;
import java.awt.*;

import static java.awt.Toolkit.getDefaultToolkit;

public class ui_init {
    public static JFrame jFrame(){
        JFrame jf=new JFrame();
        jf.setBounds(400,500,200,300);
        jf.setLayout(new FlowLayout());
//        JLabel jLabel=new JLabel("账号",SwingConstants.LEFT);
//        jf.add(jLabel);
        //文本框
        JButton jButton=new JButton("输入");
        Icon icon = (Icon) getDefaultToolkit().getImage("img/init.icon");
        jButton.setIcon(icon);
        jf.add(jButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        return jf;
    }
}
