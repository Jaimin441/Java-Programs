class shape
  {
	public double a,b;
	public void getdata(double l , double w)
	{
      a=l;
      b=w;
	}
  }


class rectangle extends shape
  {
      void display_area()
      {
        double area=a*b;
        System.out.println("Area of Rectangle : "+area);
      }
  }


class triangle extends shape
  {
      void display_area()
      {
        double area=0.5*a*b;
        System.out.println("Area of Triangle : "+area);
      }
  }


class decoder
  {
	public static void main(String args[])
      {
        rectangle r = new rectangle();
        triangle t = new triangle();
        t.getdata(5,10);
        t.display_area();
        r.getdata(5,10);
        r.display_area();
      }
  }
