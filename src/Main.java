import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ecpreso ec =new Ecpreso();
        KavazKardamol kavk=new KavazKardamol();
        IrlanCava ird =new IrlanCava();
        IrlandCavazCyker irds=new IrlandCavazCyker();
        Scanner cavomash =new Scanner(System.in);
        System.out.println("1.Експресо");
        System.out.println("2.Капучіно");
        System.out.println("3.Кава з кардамолом");
        System.out.println("4.Ірландський віскі(без цукру)");
        System.out.println("5.Ірландський віскі(з цукром)");
        System.out.println("Ведіть напій:");
        if (cavomash.hasNextInt()){
            int num=cavomash.nextInt();
            if (num==1){
                ec.ecp();
            } else if (num==2) {
                ec.test();
            } else if (num==3) {
                kavk.cavzc();
            } else if (num==4) {
                ird.irv();
            } else if(num==5){
                irds.irlds();
            } else{
                System.out.println("Не правильно ведено");
            }
        } else {
            System.out.println("Не правильно ведено");
        }
    }
}