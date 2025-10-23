package unidad2.actividad1;
public class Main {
    public static void main(String[] args) {

        Package p1 = new Package("PKG001", 5.5);

        Package p2 = p1;

        p2.weight = 10.0;

        System.out.println("After changing weight using p2:");
        p1.showPackage(); 

        changeWeight(p1, 15.0);
        System.out.println("\nAfter calling changeWeight method:");
        p1.showPackage(); 
    }

    public static void changeWeight(Package p, double newWeight) {
        p.weight = newWeight;
    }
}
