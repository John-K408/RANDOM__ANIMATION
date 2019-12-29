public class RandomDrawing {
    public static void main (String[]args){
        //x and y is where you want the upper middle corner of the book to be
        double xB = Math.random();
        double yB = Math.random()*0.7;
        //xH and yH determines the position of the head of the human.
        double xH = Math.random();
        double yH = Math.random()*0.5;
        //xC and yC determines the position of the  centre of the car body;
        double xC = Math.random();
        double yC = Math.random()*0.4;
        //xS and yS specifies the centre of the sun.
        double xS =Math.random();
        double yS =1-(Math.random()*0.4);

        double det = Math.random();

        if (det>0 && det<0.4){
            book(xB,yB);
            human(xH,yH);
        }

        if (det>0.4 && det<0.7){
            car(xC,yC);
            sun(xS,yS);
        }

        if(det>0.7){
            car(xC,yC);
            human(xH,yH);
        }










    }
    public static void book (double x, double y){
        StdDraw.setPenColor(218,112,214);
        StdDraw.filledSquare(.5,0.5,0.5);
        StdDraw.setPenColor(0,0,0);
        StdDraw.setPenRadius(0.02);
        StdDraw.line(x-0.2,y-0.3,x,y-0.25);
        StdDraw.line(x,y-0.25,x+0.2,y-0.3);
        StdDraw.line(x-0.2,y-0.3,x-0.2,y-0.05);
        StdDraw.line(x,y-0.25,x,y);
        StdDraw.line(x+0.2,y-0.3,x+0.2,y-0.05);
        StdDraw.line(x-0.2,y-0.05,x,y);
        StdDraw.line(x,y,x+0.2,y-0.05);
    }
    public static void sun (double x, double y){
        StdDraw.line(x+0.12,y,x+0.15,y);
        StdDraw.line(x-0.12,y,x-0.15,y);
        StdDraw.line(x,y-0.12,x,y-0.15);
        StdDraw.line(x,y+0.12,x,y+0.15);
        int R = (int)Math.random()*255;
        int G = (int)Math.random()*255;
        int B = (int)Math.random()*255;
        StdDraw.setPenColor(R,G,B);
        StdDraw.filledCircle(x,y,0.1);

    }
    public static void car (double x, double y){
        StdDraw.setPenColor(45,60,75);
        StdDraw.filledSquare(0.5,0.5,0.5);
        StdDraw.setPenRadius(0.02);
        StdDraw.setPenColor(0,0,0);
        StdDraw.filledCircle(x-0.1125,y-0.1125,0.0375);
        StdDraw.filledCircle(x+0.1125,y-0-0.1125,0.0375);
        StdDraw.setPenColor(0,255,0);
        StdDraw.filledRectangle(x,y,0.15,0.075);
        StdDraw.setPenColor(0,0,255);
        StdDraw.filledRectangle(x-0.05,y+0.125,0.10,0.05);

    }
    public static void human (double x, double y){
        StdDraw.setPenRadius(0.02);
        StdDraw.circle(x,y,0.06);
        StdDraw.line(x,y-0.06,x,y-0.36);
        StdDraw.line(x,y-0.09,x-0.10,y-0.21);
        StdDraw.line(x,y-0.09,x+0.10,y-0.21);
        StdDraw.line(x,y-0.36,x-0.10,y-0.46);
        StdDraw.line(x,y-0.36,x+0.10,y-0.46);


    }
}
