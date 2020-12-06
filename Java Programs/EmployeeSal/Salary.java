class Employee{
      double salary;
      double hour;
      void getInfo(double s,double h)
      {
        salary = s;
        hour = h;
      }
      void AddSal()
      {
        if(salary<500)
        {
            salary = salary+10;
            System.out.println("The employee salary is less than 500$,so the salary is: "+salary);
        }
        else
        {
          System.out.println("The employee salary is greater than 500$,so the salary is: "+salary);
        }

      }
      void AddWork()
      {
        if(hour>6)
        {
          salary = salary+5;
          System.out.println("The employee did work greater than 6 hours,so the salary is: "+salary);
        }
        else{
          System.out.println("The employee did work less than 6 hours,so the salary is: "+salary);
        }
      }
}
class Salary{
          public static void main(String arg[]){
                  System.out.println("The Salary is in dollar currency:");
                  Employee e1 = new Employee();
                  Employee e2 = new Employee();
                  e1.getInfo(300,4);
                  e2.getInfo(600,7); 
                  e1.AddSal();
                  e1.AddWork();
                  e2.AddSal();
                  e2.AddWork();
          }
}
