import java.awt.*;
public class recursion {
    public static int min = 0;
    public static int max = 5;
    public static void drawSquare(double size, double x, double y) {
        StdDraw.square(x, y, size/2);
    }

    // plot an order n recursive squares pattern
    // centered on (x, y) of the given side length
    public static void draw(int max, double x, double y, double size) {
        if (max == 0) return;

        drawSquare(size, x, y);
        StdDraw.setPenColor(Color.RED);
        // 2.2 ratio looks good
        double ratio = 2.2;

        // recursively draw 4 smaller trees of order n-1
        draw(max-1, x - size/2, y - size/2, size/ratio);    // lower left
        draw(max-1, x - size/2, y + size/2, size/ratio);    // upper left
        draw(max-1, x + size/2, y - size/2, size/ratio);    // lower right
        draw(max-1, x + size/2, y + size/2, size/ratio);    // upper right
    }


    // read in an integer command-line argument n and plot an order n recursive
    // squares pattern
    public static void main(String[] args) {
                 // side length of square

    }

}
