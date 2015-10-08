/**
 * Created by jacobliu on 15/10/3.
 */
public class Solution08 {
    //assume the coordinate is from top-left to bottom-right
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y){
        int size = screen.length;
        int height = size*8/width;
        for(byte b : screen) b = (byte)0;
        //get the index of point A and B
        int indexA = y*width/8 + x1/8;
        int indexB = y*width/8 + x2/8;

        //set first x1%8 pixels int point A to zeros and the rest to ones
        screen[indexA] = (byte)((1<<(8-x1%8))-1);
        screen[indexB] = (byte)(~((1<<(7-x2%8))-1));

        //set byte between A and B to ones
        for(int i=indexA + 1; i<indexB; i++)
            screen[i] = (byte)(~0);
    }

    public static String printBinaryString(byte s){
        String str = String.format("%8s", Integer.toBinaryString(s & 0xFF)).replace(' ', '0');
        return str;
    }

    public static void main(String[] args) {
        // write your code here
        int width = 16, height = 6;
        int size = width/8 * height;
        byte[] screen = new byte[size];
        drawLine(screen, width, 2,9,5);
        for(int i =0; i<size; i++) {
            if ((i * 8) % width == 0)   System.out.println();
            System.out.print(printBinaryString(screen[i]));
        }
    }
}
