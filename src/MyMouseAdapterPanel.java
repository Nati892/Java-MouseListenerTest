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
        drawMyString(panel.getxCoordinate(), panel.getyCoordinate(), "dragged");
        super.mouseDragged(e);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        drawMyString(panel.getxCoordinate(), panel.getyCoordinate(), "moved");
        super.mouseMoved(e);
    }

    private void drawMyString(int newx, int newy, String newtext) {
        panel.setxCoordinate(newx);
        panel.setyCoordinate(newy);
        panel.setText(newtext);
        panel.repaint();

    }
}
