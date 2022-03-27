import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {
    private int x = 0;
    private int y = 0;
    private String text = "";
    private MyMouseAdapterPanel newAdapter = null;

    public MyPanel() {
        this.newAdapter = new MyMouseAdapterPanel(this);
        addMouseListener(newAdapter);
        addMouseMotionListener(newAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Ariel", 90, 25));
        g.drawString(text, x, y);
    }

    public void setxCoordinate(int newx) {
        this.x = newx;
    }
    public void setyCoordinate(int newy) {
        this.y = newy;
    }
    public void setText(String newText) {
        this.text = newText;
    }

    public int getxCoordinate() {
       return this.x;
    }
    public int getyCoordinate() {
        return this.y;
    }
    public String getText() {
        return this.text;
    }

}
