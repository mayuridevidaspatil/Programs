import java.applet.*;
import java.awt.*;
public class Appletclass extends Applet
{
  public void paint(Graphics g)
  { 
    /*int i;*/
    setBackground(Color.WHITE);
    g.drawString("wellcome to applet programmihng",50,50);
    /*for(i=1;i<100;i=i+3)*/
     {   
       g.drawRect(70,70,100,100);
       g.drawOval(10,10,50,100);
       g.drawArc(270, 50, 90, 90, 0, 360);
  
     }
    g.setColor(Color.RED);
    g.fillArc(270, 50, 90, 90, 0, 360); 
    g.fillRect(70,70,100,100);
    g.fillOval(10,10,50,100);
    
  }
}
/*
<html>
<body>
<applet code="Appletclass.class" height=500 width=1000></applet>
</body>
</html>
*/
