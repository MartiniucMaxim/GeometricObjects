package OOP_Part_1.GeometricObjects;

public class MainApp {
    public static void main(String[]args){
        Line short_horizontal_line = new Line(100,200,0,0);
        System.out.println(short_horizontal_line.printCords(short_horizontal_line.startX,  short_horizontal_line.endX, short_horizontal_line.startY, short_horizontal_line.endY));
        short_horizontal_line.length();
        System.out.println(short_horizontal_line.length());
        Line short_horizontal_line_2 = new Line(100,500,100,500);
        System.out.println(short_horizontal_line_2.printCords(short_horizontal_line_2.startX,  short_horizontal_line_2.endX, short_horizontal_line_2.startY, short_horizontal_line_2.endY));
        short_horizontal_line_2.length();
        System.out.println(short_horizontal_line_2.length());

    }
}
