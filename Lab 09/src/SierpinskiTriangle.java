import java.awt.*;

public class SierpinskiTriangle {
    public static void main (String[]args){
        if(args.length!=1){
            System.err.print("Program takes in only one input. Please try again. ");
            System.exit(1);
        }
        else {
            int order = Integer.parseInt(args[0]);
            StdDraw.setXscale(-0.005, 1.005);
            StdDraw.setYscale(-0.005, 1.005);
            drawTriangle(0, 0, 1, 0, 0.5, 1, order);
        }
    }

    public static void drawTriangle(double x1,double y1,double x2,double y2,double x3,double y3, int n){
        if(n ==0){
            double [] xTriangle ={x1,x2,x3} ;
            double [] yTriangle ={y1,y2,y3};
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.filledPolygon(xTriangle,yTriangle);

        }
        else {
            double mid1x = (x1 + x2) / 2;
            double mid1y = (y1 + y2) / 2;
            double mid2x = (x1 + x3) / 2;
            double mid2y = (y1 + y3) / 2;
            double mid3x = (x2 + x3) / 2;
            double mid3y = (y2 + y3) / 2;
            drawTriangle(x1, y1, mid1x, mid1y, mid2x, mid2y, n - 1);
            drawTriangle(mid1x, mid1y, x2, y2, mid3x, mid3y, n - 1);
            drawTriangle(mid2x, mid2y, mid3x, mid3y, x3, y3, n - 1);
        }
    }

}




