import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;

public class GUIMatrix extends JFrame {




    public GUIMatrix() {

        this.setSize(800, 800);

        this.setTitle("drawing shapes");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    drawing draw=new drawing();
        this.add(draw);

        this.setVisible(true);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                drawing.xCoord=e.getX();
                drawing.yCoord=e.getY();

                if (drawing.xCoord != null && drawing.yCoord != null) {
                    for (int i = 0; i  <= 10; i++) {
                        for (int j = 0; j <= 10; j++) {
                            if (drawing.xCoord <= 50 * i + 40 && drawing.xCoord>=50*i && drawing.yCoord <= 50 * j + 70 && drawing.yCoord>=50*j+30) {

                                System.out.println(drawing.xCoord+"   "+drawing.yCoord);

                                draw.repaint(50*i,50*j,40,40);


                            }
                        }

                    }

                }



            }
        });


    }

    public static void main(String[] args) {

        new GUIMatrix();

    }
}
     class drawing extends JComponent {

    String y;

         public static Integer xCoord, yCoord;

         public void paint(Graphics g) {

             Graphics2D g2 = (Graphics2D) g;

             for (int i = 0; i <= 10; i++) {
                 for (int j = 0; j <= 10; j++) {
                     int x = (int) (Math.random() * 20);
                      y = Integer.toString(x);

                     if (x % 2 == 0) {

                         g2.setPaint(Color.blue);

                     } else {

                         g2.setPaint(Color.yellow);

                     }


                     Rectangle2D rect = new Rectangle2D.Double(50 * i, 50 * j, 40, 40);
                     g2.draw(rect);
                     g2.fill(rect);
                     g2.setPaint(Color.red);
                     g2.drawString(y, 20 + i * 50, 20 + j * 50);


                 }


             }

             if (xCoord != null && yCoord != null) {
                 for (int i = 0; i  <= 10; i++) {
                     for (int j = 0; j <= 10; j++) {
                         if (xCoord <= 50 * i + 40 && xCoord>=50*i && yCoord <= 50 * j + 70 && yCoord>=50*j+30) {
                             g2.setPaint(Color.green);
                             g2.fillRect(50 * i, 50 * j, 40, 40);


                         }
                     }

                 }

             }

         }

     }


