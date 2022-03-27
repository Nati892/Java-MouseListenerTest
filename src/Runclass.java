import javax.swing.*;

public class Runclass {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        MyPanel myPanel=new MyPanel();
        frame.add(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
    }


}
