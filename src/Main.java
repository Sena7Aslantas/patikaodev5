import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r,aci,pi;
        pi=3.14;
        System.out.println("Daire\'nin yaricapinı girin:");
        Scanner input=new Scanner(System.in);
        r=input.nextDouble();

        System.out.println("Daire\'nin dilim acisini girin:");
        Scanner inp=new Scanner(System.in);
        aci=inp.nextDouble();

        double alan=pi*r*r;
        double cevre=2*pi*r;
        double dilimalan=(alan*aci)/360;

        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin cevesii:"+cevre);
        System.out.println("Daire diliminin alanı:"+dilimalan);

    }
}