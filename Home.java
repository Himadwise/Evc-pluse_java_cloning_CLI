package EVC_PLUS;
import java.util.Scanner;
public class Home {
    public final  double HARAA = 34;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String PASS ="1515";
        System.out.print(":");
        String screen = input.next();
        boolean check=false;
        if(screen.equals("*770#")){
            System.out.print("Enter you PIN:");
            String pin = input.next();

            if(pin.toUpperCase().equals(PASS)){
                showData();
            }else {
                System.out.println("your password is incorrect.");
            }
        }else if (screen.equals("*712#")){
            System.out.print("Enter you PIN:");
            String pin = input.next();

            if(pin.toUpperCase().equals(PASS)){
                showRemaining();
            }else {
                System.out.println("your password is incorrect.");
            }

        }
        else {
            System.out.println("your Code is incorrect.");
        }
    }
    static void showData(){
        Scanner in = new Scanner(System.in);
        System.out.println("\tEVC-PLUS");
        System.out.println("...............");
        System.out.println("1. Itus Haraagaaga" +
                "\n2. Kaarka Hadalka" +
                "\n3. Bixi Biil" +
                "\n4. U wareeji EVC-plus" +
                "\n5. Warbixin Kooban" +
                "\n6. Salaam Bank" +
                "\n7. Maareynta" +
                "\n8. Taaj" +
                "\n9. Bill Payment");
        System.out.print("Input:");
        int number=in.nextInt();
        if(number==1){
            showRemaining();
        }
        else  if(number==2){
            Kaarka_hadalka.show();
        }
        else  if(number==3){
            Bixi_biil.show();
        }
        else  if(number==4){
            Uwareeji_evc.show();
        }
        else  if(number==5){
            Warbixin_kooban.show();
        }
        else  if(number==6){
            Salaam_bank.show();
        }
        else  if(number==7){
            Maareenta.show();
        }
        else  if(number==8){
            Taaj.show();
        }
        else  if(number==9){
            Bill_payment.show();
        }
    }
    static  void showRemaining(){
        System.out.println("haraagaagu waa+ $"+50);
    }
}
