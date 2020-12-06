class A
{
  public double a=5;
}
class B extends A
{
  public double b=10;
}
class C extends B
{
  public double c=15;
}
class D extends C
{
  public double d=20;
  void average()
  {
	double avg=(a+b+c+d)/4;
    System.out.println("Average is : "+avg);
  }
}
class dexoder
{
  public static void main (String args[])
  {
	D a1=new D();
    a1.average();
  }
}
