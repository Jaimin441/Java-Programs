class Area{
 int length;
 int breadth;
   Area(int l,int b)
 {
     length = l;
     breadth = b;
 }
   int returnArea()
 {
       return length*breadth;
 }
}
class Rectangle{
         public static void main(String arg[]){
       Area a1 = new Area(10,20);
       int area;
       area = a1.returnArea();
       System.out.println("Area of Rectangle= "+area);
     }
}
