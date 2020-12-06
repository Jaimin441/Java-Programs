interface MET {
               void calculate();
}
class Pallindrome implements MET{
              public void calculate()
              {
                    int num=123,rev=0,rem;
                    int temp;
                    temp=num;
                    while(temp != 0)
                    {
                            rem = temp % 10;
                            rev = rev*10 + rem;
                            temp = temp/10;
                    }
                    if(num == rev)
                    {
                            System.out.println("This is a Pallindrome number");
                    }
                    else{
                            System.out.println("This is not a Pallindrome number");
                    }
              }
}
class Unknown implements MET{
              public void calculate()
              {
                        int num=6;
                        int sum = 0;
                        for(int i=1;i<num;i++)
                        {
                            if(num%i==0)
                            {
                                  sum = sum+i;
                            }
                        }
                        if(num == sum)
                        {
                              System.out.println("This is a Perfect number");
                        }
                        else
                        {
                              System.out.println("This is not a Perfect number");
                        }
              }
}
class Cal{
                public static void main(String args[])
                {
                                Pallindrome m = new Pallindrome();
                                Unknown n = new Unknown();
                                m.calculate();
                                n.calculate();
                }
}
