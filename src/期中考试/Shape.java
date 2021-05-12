package 期中考试;
import static net.mindview.util.Print.*;
public abstract class Shape {

        double Area=10;
        abstract double getArea();
    }
    class Circle extends Shape{

        @Override
       public double getArea() {
            print("圆形的面积为"+this.Area);
            return this.Area;
        }
    }
    class Square extends Shape{

        @Override
        public double getArea() {
            print("正方形的面积为"+this.Area);
            return this.Area;
        }
    }
    class Rectangle extends Shape{


        @Override
        public double getArea() {
           print("长方形的面积为"+this.Area);
            return this.Area;
        }
    }
    class last {
        public static void main(String args[]){
            Circle r=new Circle();
            r.getArea();
            Square b=new Square();
            b.getArea();
            Rectangle c=new Rectangle();
            c.getArea();
        }
    }

