package EVC_PLUS;

import java.util.Scanner;

public class Kaarka_hadalka {
    static void show(){
        System.out.println("Kaarka hadalka");
        System.out.println();
        System.out.println("1. Ku shubo Airtime" +
                "\n2. Ugu Shub Airtime" +
                "\n3. MIFI Package" +
                "\n4. Ku Shubo Internet" +
                "\n5. Ugu Shub Qof kale(MMT)");
        Scanner in = new Scanner(System.in);
        System.out.print("Input:");
        int input = in.nextInt();
        if(input==1){
            kuShubo();
        }else if (input==2){
            uguShub();
        }else if(input==3){
            mifiPage();
        }else if(input==4){
            kuShuboInternet();
        }else if(input==5){
            uguShubInternet();
        }else {
            System.out.println("Fadlan Dooro Number sax ah.");
        }
    }
    static void kuShubo(){
        Scanner in = new Scanner(System.in);
        System.out.print("fadlan Gali Lacagta:");
        double lacagta = in.nextDouble();

        System.out.println("Mahubtaa inaad $"+ lacagta +" ugu shubtid Undefined" +
                "\n1. Haa\n2. Maya");
        System.out.print(":");
        int option = in.nextInt();

        checkOption(option,lacagta);
    }
    static void checkOption(int option,double lacagta){
        if(option==1){
            System.out.println("Waxaad $"+ lacagta + " ugu shubtay Undefined.");
        }else {
            System.out.println("Mahadsanid.");
        }
    }
    public static void checkOption(int option,double lacagta,long number){
        if(option==1){
            System.out.println("Waxaad $"+ lacagta + " ugu shubtay "+ number);
        }else {
            System.out.println("Mahadsanid.");
        }
    }
    static void uguShub(){
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
    static void mifiPage(){
        Scanner in = new Scanner(System.in);
        System.out.println("Evc-Plus" +
                "\n1. Ku shubo data-da MiFi");
        int opt = in.nextInt();
        if(opt==1){
            System.out.println("--Internet Bundle Recharge --" +
                    "\n1. Isbuucle (Weekly)" +
                    "\n2. Bille (MiFi)" +
                    "\n3. Maalinle(Daily)");
        }
    }
    static void kuShuboInternet(){
        System.out.println("Fadlan Dooro Nubmer-ka ku shubeyso" +
                "\n1. Isbuucle(Weekly)" +
                "\n2. Bille (MiFi)" +
                "\n3. Maalinle(Daily)" +
                "\n4. TIME BASED PACKAGES" +
                "\n5. DATA");
    }
    static void uguShubInternet(){
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

}
