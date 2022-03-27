import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {
    public int x = 0;
    public int y = 0;
    public String text = "";
    private MyMouseAdapterPanel newAdapter = null;

    public MyPanel() {
        newAdapter = new MyMouseAdapterPanel(this);
        addMouseListener(newAdapter);
        addMouseMotionListener(newAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Ariel", 90, 25));
        g.drawString(text, x, y);
    }


}
