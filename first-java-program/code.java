import java.text.NumberFormat;
import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        //principal
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal:");
        int pri = sc.nextInt();

        //annual interest rate
        System.out.print("Annual Interest Rate:");
        float air = sc.nextFloat();

        //period
        System.out.print("Period (Years):");
        byte py = sc.nextByte();


        //annual interest rate formated properly and then made monthly
        air = air / 100;
        float mir = air / 12;


        //figuring mortgage
        double total = pri * ((mir * Math.pow(1 + mir, py * 12)) / (Math.pow(1 + mir, py * 12) - 1));

        //convert to dollars
        NumberFormat mtotal = NumberFormat.getCurrencyInstance();
        String result = mtotal.format(total);

        System.out.println("Your monthly payment will be:" + result);
    }
}