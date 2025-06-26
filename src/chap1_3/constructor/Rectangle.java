package chap1_3.constructor;

public class Rectangle {
    int width;
    int height;

    Rectangle(int wi, int he){
        width = wi;
        height = he;
    }

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle  = new Rectangle(20, 30);
        System.out.println("넓이: " + rectangle.calculateArea());
        System.out.println("둘레: " + rectangle.calculatePerimeter());
    }

}
