import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        vendingMachine vM = new vendingMachine();

        System.out.println("Test:   5.00 - 0.99 = 4.01");
        vM.getChange(5.00,  0.99);

        System.out.println("\nTest:   5.77 - 3.21 = 2.56");
        vM.getChange(5.77,  3.21);


        Scanner sc = new Scanner(System.in);

        System.out.println("\nIntroduceti banii:");
        double baniBagati = Double.parseDouble(sc.nextLine());

        System.out.println("\nIntroduceti pretul prodosului");
        double pretProdus = Double.parseDouble(sc.nextLine());

        vM.getChange(baniBagati,pretProdus);





    }
}
