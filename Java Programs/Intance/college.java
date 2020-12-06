class ME extends Exception
{
      private String Department;
      private int Age;
      private double CPI;
      ME(String D,int A,double C)
      {
              Department = D;
              Age = A;
              CPI = C;
      }
      public String toString()
      {
          return "Department: " + Department + "Age= " + Age + "CPI= " + CPI;
      }
}
class college
{
            static void compute(String D,int A,double C) throws ME
            {
                        String Student_name;
                        System.out.println("Department= " + D + "Age= " + A + "CPI= " + C);
                        if(D == "IT" && A>=21 && C>=4.5 && C<=6.5)
                        {
                                throw new ME(D,A,C);
                        }
                        System.out.println("Normal Exit");
            }
            public static void main(String[] args) {
              try{
                    compute("IT",22,5.5);
              }
              catch (ME e) {
                        System.out.println("Caught :" + e);
              }
            }
}
