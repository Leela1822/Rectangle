class Main{
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(6,15);
        Rectangle rectangle2 = new Rectangle(8,17);

        System.out.println(rectangle1.calculateArea() );
        System.out.println(rectangle1.calculatePerimeter());;
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
    }
}


class Rectangle{
    double length;
    double breadth;


    public Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea(){
        return length*breadth;
    }

    double calculatePerimeter(){
        return 2 * (length*breadth);
    }
}