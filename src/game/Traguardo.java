package game;

import java.awt.Color;
import java.awt.*;

public class Traguardo extends Component {
    private int x;
    private int y;
    private int width;
    private int heigth;

    public Traguardo(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 10;
        this.heigth = 10;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
     public void draw(Graphics g){
             g.setColor(Color.green);
             g.fillRect(x, y, width, heigth);
            
         }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, heigth);
    }

}
