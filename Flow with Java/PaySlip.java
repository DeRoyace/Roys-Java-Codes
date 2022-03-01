/**
 * Write a program is JAVA to generate a pay slip, the program should take the basic amount ( in Rupees) as an input and would calculate different components like DA, HRA , PF, NET & GROSS Salary. DA is 3% of Basic, HRA is 15% of Basic, PF is 12% of Basic pay. Gross Salary = Basic + DA +HRA +PF and NET Salary= Gross Salary - PF
 */
import java.math.BigDecimal;
import java.util.Scanner;
public class PaySlip {
    BigDecimal basicPay, DA, HRA, PF, NET, GROSS;
    PaySlip(BigDecimal basicPay)
    {
        this.basicPay = basicPay;
    }

    void calcComponents()
    {
        BigDecimal per3 = new BigDecimal("0.03");
        BigDecimal per15 = new BigDecimal("0.15");
        BigDecimal per12 = new BigDecimal("0.12");
        DA = basicPay.multiply(per3);
        HRA = basicPay.multiply(per15);
        PF = basicPay.multiply(per12);
        GROSS = basicPay.add(DA).add(HRA).add(PF);
        NET = GROSS.subtract(PF);
    }

    void display()
    {
        System.out.println("DA Salary    : Rs. " + DA);
        System.out.println("HRA Salary   : Rs. " + HRA);
        System.out.println("PF Salary    : Rs. " + PF);
        System.out.println("NET Salary   : Rs. " + NET);
        System.out.println("GROSS Salary : Rs. " + GROSS);
    }

    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Basic amount: Rs. ");
        BigDecimal basic = sc.nextBigDecimal();
        PaySlip ps = new PaySlip(basic);
        ps.calcComponents();
        ps.display();
        sc.close();
    }
}
