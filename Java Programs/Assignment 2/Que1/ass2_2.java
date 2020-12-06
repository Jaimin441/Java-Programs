import java.io.*;
class ass2_2{
    public static void main(String args[]) throws IOException{
        int i=0;int upper=0;int lower=0;int special=0;int number=0;
        BufferedReader te = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fin = new FileInputStream("ass2_2.txt");
        char ch;
        do{
            i = fin.read();
            if(i==-1)break;
            ch=(char)i;
             if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }while(i!=-1);
        System.out.println("No of characters: "+(upper+lower));
        System.out.println("No of digits: " + number);
        System.out.println("No of special chars: "+special);
    }
}
