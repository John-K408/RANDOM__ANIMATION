public class RandomAnimation {
    public static void main(String[]args) {
        StdDraw.setXscale(0.0, 1.0);
        StdDraw.setYscale(0.0, 1.0);
        //Variables for ball have B at the end and variables for car have C at the end.
        double yC =0.1+ Math.random()*0.6;
        double xB =0.11+Math.random()*0.7;
        double yB =0.11+Math.random()*0.6;
        double xC =Math.random()*0.7;
        double IxC = xC;
        double IyC = yC;
        double IyB = yB;
        double IxB = xB;
        double Vxc= 0.01;
        double Vyc=0.01;
        double Vyb = 0.01;
        double Vxb = 0.01;
        int bounceB = 0;
        int bounceC = 0;

        for(int i=1;i>0;) {
            StdDraw.enableDoubleBuffering();
            //write a loop for entire code to repeat once ball and car leaves the canvas
            //This code set all the variables back to initial when the ball and car leaves the canvas
            if((xB>1.2||yB>1.2)&&(xC>1.2||yC>1.2)){
                xC = IxC;
                yC = IyC;
                yB = IyB;
                xB = IxB;
                Vxc= 0.01;
                Vyc=0.01;
                Vyb = 0.01;
                Vxb = 0.01;
                bounceB = 0;
                bounceC = 0;
            }
            //Write a code for the ball to return upon bounce
            if(bounceB<1&&(xB+0.1>=1||yB+0.1>=1)){
                if(xB + 0.1 >= 1) {
                    Vxb = -Vxb;
                    bounceB++;
                }
                else{
                    Vyb = -Vyb;
                    bounceB++;
                }
            }
            //Write a code for the car to return upon bounce
            if(bounceC<1&&(xC+0.15>=1||yC+0.135>=1)){
                if(xC+0.15>=1){
                    Vxc = -Vxc;
                    bounceC++;
                }
                else{
                    Vyc = - Vyc;
                    bounceC++;
                }
            }
            //Code Additions/Movement
            xC = xC + Vxc;
            yC=yC+Vyc;
            yB = yB + Vyb;
            xB = xB + Vxb;
            //Clear the canvas,make the drawing,and show. Don't forget to pause.
            StdDraw.clear();
            StdDraw.setPenColor(45, 60, 75);
            StdDraw.filledSquare(0.5, 0.5, 0.5);
            CarAnime(xC, yC);
            BallAnime(xB, yB);
            StdDraw.show();
            StdDraw.pause(15);
        }



    }
    public static void CarAnime (double x, double y){

        StdDraw.setPenRadius(0.02);
        StdDraw.setPenColor(0,0,0);
        StdDraw.filledCircle(x-0.1125,y-0.1125,0.0375);
        StdDraw.filledCircle(x+0.1125,y-0-0.1125,0.0375);
        StdDraw.setPenColor(0,255,0);
        StdDraw.filledRectangle(x,y,0.15,0.075);
        StdDraw.setPenColor(0,0,255);
        StdDraw.filledRectangle(x-0.05,y+0.125,0.10,0.05);

    }
    public static void BallAnime(double x,double y){
        StdDraw.setPenColor(255,255,255);
        StdDraw.filledCircle(x,y,0.10);
    }
}

































































































