package EVC_PLUS;

import java.util.Scanner;

public class Uwareeji_evc {
    static  void show (){
        Scanner in = new Scanner(System.in);
        System.out.println("Fadlan Gali Numberka:");
        long number = in.nextLong();
        String phone = String.valueOf(number);
        if(number>=610000000 || number <= 619999999 && phone.length()==9){
            System.out.print("fadlan Gali Lacagta:");
            double lacagta = in.nextDouble();
            System.out.println("Mahubtaa inaad $"+ lacagta +" ugu shubtid "+number+
                    "?\n1. Haa\n2. Maya");
            System.out.print(":");
            int option = in.nextInt();
            checkOption(option,lacagta,number);

        }else {
            System.out.println("Ma'ahan mid saxan numberka");
        }

    }
    static void checkOption(int option,double lacagta,long number){
        if(option==1){
            System.out.println("Waxaad $"+ lacagta + " ugu shubtay "+ number);
        }else {
            System.out.println("Mahadsanid.");
        }
    }
}
