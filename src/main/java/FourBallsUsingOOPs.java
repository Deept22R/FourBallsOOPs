import processing.core.PApplet;
public class FourBallsUsingOOPs extends PApplet{

    public static final int diameter = 10;
    public static final int center = 10;
    public static final int height = 600;
    public static final int width = 700;
    int height1 = height /5;
    int height2 = (2* height)/5;
    int height3 = (3* height)/5;
    int height4 = (4* height)/5;
    class Processing{
        int speed, width, start, diameter, center;
        public Processing(int speed, int width, int diameter, int center){
            start = 0;
            this.speed = speed;
            this.width = width;
            this.diameter = diameter;
            this.center = center;
        }

        public void moveBall() {
            ellipse(start,width,diameter,center);
            start+=speed;
        }
    }
    Processing ball1 = new Processing(1, height1, diameter, center);
    Processing ball2 = new Processing(2, height2, diameter, center);
    Processing ball3 = new Processing(3, height3, diameter, center);
    Processing ball4 = new Processing(4, height4, diameter, center);
    public static void main(String[] args) {
        PApplet.main("FourBallsUsingOOPs", args);
    }
    @Override
    public void settings() {
        size(width, height);
    }
    @Override
    public void draw() {
        ball1.moveBall();
        ball2.moveBall();
        ball3.moveBall();
        ball4.moveBall();
    }
}
