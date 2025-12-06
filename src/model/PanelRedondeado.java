package model; 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class PanelRedondeado extends JPanel {

    private int arcoAncho = 50;
    private int arcoAltura = 50;
    private Color colorBorde = new Color(165, 40, 174);

    public PanelRedondeado() {
        super();
        setOpaque(false); 
        setBorder(null); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        Shape formaRedondeada = new RoundRectangle2D.Double(
                0, 0, getWidth() - 1, getHeight() - 1, arcoAncho, arcoAltura
        );

        g2.setColor(getBackground());
        g2.fill(formaRedondeada);

        g2.setColor(colorBorde);
        g2.draw(formaRedondeada);

        g2.dispose();
    }

    public void setArc(int ancho, int altura) {
        this.arcoAncho = ancho;
        this.arcoAltura = altura;
        repaint(); // Re-draw the component with new shape
    }

    public void setColorBorde(Color color) {
        this.colorBorde = color;
        repaint();
    }
}