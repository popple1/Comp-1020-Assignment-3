
/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 4
 *QUESTION:		Phase 3
 *PURPOSE:		This program will create a linked list
 */
import java.awt.*;

public class RecursiveSquares {
    private static final int WIDTH = 5;  //maximum width

    private static final int MIN_WIDTH = 1;     //minimum width

    // plot a square, centered on (x, y) of the given side length
    // with a light gray background and black border
    public static void drawCornerSquares (double width, double x, double y) {
        StdDraw.square(x, y, width/2);
    }

    // plot an order n recursive squares pattern
    // centered on (x, y) of the given side length
    private static void drawCornerSquares(double width, double x, double y, Color c)
    {
        if (WIDTH == MIN_WIDTH) return;

        drawCornerSquares(width, x, y);

        // 2.2 ratio looks good
        double ratio = 2.2;

        // recursively draw 4
        drawCornerSquares(width/ratio, x - width/2, y - width/2);    // lower left
        drawCornerSquares(width/ratio, x - width/2, y + width/2);    // upper left
        drawCornerSquares(width/ratio, x + width/2, y - width/2);    // lower right
        drawCornerSquares(width/ratio, x + width/2, y + width/2);    // upper right

    }

}