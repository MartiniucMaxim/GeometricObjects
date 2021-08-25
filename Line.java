package OOP_Part_1.GeometricObjects;
import java.lang.Math;

public class Line {
      public int startX;
      public int endX;
      public int startY;
      public int endY;

    public Line(){

    }

    public Line(int startX, int endX, int startY, int endY) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
           if(this.startX==this.endX && this.startY==this.endY){
               System.err.println("This is a point, not a line. Type another value, that's not will equal start and end point with each other");
           }
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getEndX() {
        return endX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndY() {
        return endY;
    }
   public String printCords(int startX, int endX, int startY, int endY){
        return "["+startX+":"+startY+"]--------->"+"["+endX+":"+endY+"]";
   }



    public int length() {
        return (int) Math.sqrt(((endX - startX)*(endX - startX))+((endY - startY)*(endY - startY)));
    }
}
