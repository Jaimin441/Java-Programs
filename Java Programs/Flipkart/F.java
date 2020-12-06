import java.util.*;
class flipkart{
                String product_name;
                int product_price;
                flipkart(String s,int a)
                {
                      product_name = s;
                      product_price = a;
                }
                int cashback()
                {
                          int cashback;
                          if(product_price<5000)
                          {
                              cashback = 50*(product_price/1000);
                          }
                          else
                          {
                              cashback = 100*(product_price/1000);
                          }
                          return cashback;
                }
                void display()
                {
                        int cashback = this.cashback();
                        System.out.println("product_name= " + product_name);
                          System.out.println("cashback= " + cashback);
                        System.out.println("Total= " + (product_price - cashback));
                }
}
class F{
              public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the name of the product");
                        String Name = sc.nextLine();
                        System.out.println("Enter the price of the product");
                        int price = sc.nextInt();
                        flipkart f = new flipkart(Name,price);
                        System.out.println("Information of the product: ");
                        f.cashback();
                        f.display();
              }
}
