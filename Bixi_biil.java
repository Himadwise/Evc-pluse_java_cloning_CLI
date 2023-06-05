package EVC_PLUS;

import java.util.Scanner;


public class Bixi_biil {
    static void show(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Bixi Biil" +
                "\n1. post Paid" +
                "\n2. Ku iibso");
        System.out.print(":");
        int opt = in.nextInt();
        if(opt==1){
            System.out.println("Post Paid" +
                    "\n1. Ogow Biilka" +
                    "\n2. Bixi Biil" +
                    "\n3. Ka Bixi Biil");
        }else{
            System.out.println("fadlan Gali Aqoonsigaaga Ganacsiga");
            String aqoonsi = in.next();
        }
    }
}
