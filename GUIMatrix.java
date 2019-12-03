import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GUIMatrix extends JFrame{


    public GUIMatrix(){

        this.setSize(300,400);

        this.setTitle("drawing shapes");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.add(new drawing());

        this.setVisible(true);

    }

    public static void main(String[] args){

        new GUIMatrix();

    }

    private class drawing extends JComponent{

        public void paint(Graphics g){

            Graphics2D g2 = (Graphics2D) g;

            Rectangle2D rect = new Rectangle2D.Double(10,10,40,40);
            g2.setPaint(Color.black);
            g2.draw(rect);
            g2.fill(rect);


            for(int i=0;i*40<=300;i++){
                for(int j=0;j*40<=400;j++){
                    int x= (int) (Math.random()*20);
                   String y= Integer.toString(x);
                   g2.setPaint(Color.blue);
                   g2.drawString(y,10+20+i*50,10+20+j*50);
                    g2.copyArea(10,10,40,40,i*50,j*50);


                }


            }




        }

    }

}


