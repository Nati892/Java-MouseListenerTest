import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapterPanel extends MouseAdapter {

    MyPanel panel = null;

    public MyMouseAdapterPanel(MyPanel new_panel) {
        panel = new_panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point curr = e.getPoint();
        drawMyString(curr.x, curr.y, "clicked");
        super.mouseClicked(e);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point curr = e.getPoint();
        drawMyString(panel.x, panel.y, "dragged");
        super.mouseDragged(e);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        drawMyString(panel.x, panel.y, "moved");
        super.mouseMoved(e);
    }

    private void drawMyString(int newx, int newy, String newtext) {
        panel.x = newx;
        panel.y = newy;
        panel.text = newtext;
        panel.repaint();

    }
}
