import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFrame;

public class Main extends JFrame{
    int drawAmount = 0;
    public Main(){
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String []args){
        new Main();
    }
    public void paint(Graphics g){
        while(drawAmount <= 2000){
            int randx = (int)((Math.random() * (1100 - -100)) + -100);
            int randy = (int)((Math.random() * (1100 - -100)) + -100);
            int size = (int)((Math.random() * (180 - 100)) + 100);

            int red = (int)((Math.random() * (255 - 0)) + 0);
            int green = (int)((Math.random() * (255 - 0)) + 0);
            int blue = (int)((Math.random() * (255 - 0)) + 0);

            Color color = new Color(red,green,blue);

            g.setColor(color);
            g.fillOval(randx,randy,size,size);

            
            drawAmount++;
        }
        Font font = new Font(Font.MONOSPACED,Font.ITALIC,150);
        g.setFont(font);
        int t = 10000;
        while(t-->0){
        g.setColor(Color.magenta);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.PINK);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.yellow);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.green);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.cyan);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.ORANGE);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.LIGHT_GRAY);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        g.setColor(Color.BLUE);

        g.drawString("Happy", 10,200);
        g.drawString("Teachers", 160,400);
        g.drawString("Day", 610,600);

        }
            
    }
}
