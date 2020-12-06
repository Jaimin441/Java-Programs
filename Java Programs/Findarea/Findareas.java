class Figure {
   double dim1;
   double dim2;
   Figure(double a , double b) {
      dim1 = a;
      dim2 = b;
   }
   Double area() {
      System.out.println("Inside area for figure.");
      return(dim1*dim2);
   }
}
class Rectangle extends Figure {
   Rectangle(double a, double b) {
      super(a ,b);
   }
   Double area() {
      System.out.println("Inside area for rectangle.");
      return(dim1*dim2);
   }
}
class Triangle extends Figure
{
Triangle(double a,double b)
{
super(a,b);
}
Double area()
{
System.out.println("Inside area for triangle.");
      return(0.5*dim1*dim2);
}
}
public class Findareas {
   public static void main (String []agrs) {
      Figure f = new Figure(10 , 10);
      Rectangle r = new Rectangle(9 , 5);
      Triangle t =new Triangle(5,7);
      Figure figref;
      figref = f;

      figref = r;
      System.out.println("Area is :"+figref.area());
       figref = t;
      System.out.println("Area is :"+figref.area());
   }
}
