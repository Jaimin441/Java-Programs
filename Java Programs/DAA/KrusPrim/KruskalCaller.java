import java.util.Scanner;


class kruskals{
    public char src[], des[];
    public int w[], edges;
    private Scanner inp = new Scanner(System.in);
    kruskals(int d_edges){
    	edges = d_edges;
	}


    void getData(){
        System.out.println("Where you want to enter data? \n1)Source \n2)Destination \n3)Weights\n");
        int i;
    	src = new char[edges];
    	des = new char[edges];
    	w = new int[edges];


        for(i = 0; i< edges; i++){


            System.out.println("Enter " +(i+1)+" Source Destination and weights");
        	src[i] = inp.next().charAt(0);
        	des[i] = inp.next().charAt(0);
        	w[i] = inp.nextInt();
    	}
	}


    public void sortData(){
        int i, j, min_indx;
        for(i = 0; i < edges-1; i++){
        	min_indx = i;


            for(j = i+1; j < edges; j++){
                if(w[min_indx] > w[j]) min_indx = j;
        	}


            int temp_int = w[i];
        	w[i] = w[min_indx];
        	w[min_indx] = temp_int;


            char temp_char = src[i];
        	src[i] = src[min_indx];
        	src[min_indx] = temp_char;


        	temp_char = des[i];
        	des[i] = des[min_indx];
        	des[min_indx] = temp_char;
    	}
	}


    private boolean isCycle(char source[], char dest[], char new_Src, char new_Des, int size){
        int i, j;
        boolean check_src = false, check_dest = false;
        for(i = 0; i < size; i++){


            if(new_Src == source[i] || new_Src == dest[i]) check_src = true;


            if(new_Des == source[i] || new_Des == dest[i]) check_dest = true;
    	}


        if(check_src && check_dest){ return true;}
        else return false;
	}


    public kruskals makePath(){
        int i, elem_cnt = 0;
        char[] new_src = new char[edges];
        char[] new_dest = new char[edges];
        int[] new_w = new int[edges];


        this.sortData();


        for(i = 0; i < edges; i++){

            if(i > 0){


                if(!isCycle(new_src, new_dest, src[i], des[i], elem_cnt)){
                	new_src[elem_cnt] = src[i];
                	new_dest[elem_cnt] = des[i];
                	new_w[elem_cnt] = w[i];
                	elem_cnt += 1;
            	}
        	}
            else{
            	new_src[elem_cnt] = src[i];
            	new_dest[elem_cnt] = des[i];
            	new_w[elem_cnt] = w[i];
            	elem_cnt += 1;
        	}
    	}


    	kruskals new_obj = new kruskals(new_src.length);


        new_obj.src = new_src;
        new_obj.des = new_dest;
        new_obj.w = new_w;
        new_obj.edges = elem_cnt;


        return new_obj;
	}


    void display(){
        System.out.println("Displaying Edges");
        int i;
        System.out.println("Source\tDestination\tWeights");
        for(i = 0; i < edges; i++){
            System.out.println(src[i]+"\t "+des[i]+"\t\t"+w[i]);
    	}
	}
}

class KruskalCaller{
    public static void main(String arg[]){
    	kruskals obj = new kruskals(5);
        obj.getData();


        System.out.println("Initially ");
        obj.display();


    	obj = obj.makePath();


        obj.display();
	}
}
