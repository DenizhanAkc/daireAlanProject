import java.util.Scanner;
public class daireAlanCevre {
    public static void main (String[] args) {

        int r;
        Scanner input = new Scanner(System.in);
        System.out.print("Yaricap : " );
        r = input.nextInt();

        int x;
        Scanner aci = new Scanner(System.in);
        System.out.print("Belirledigimiz yayin acisi : " );
        x = aci.nextInt();

        double alan = (3.14 * (r * r) * x )/360 ;
        System.out.print("Dairenin x acili yayinin alani : " +alan);






    }
}


