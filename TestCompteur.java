package TdAbstract;

public class TestCompteur {
    public static void main(String[] args) {
        compteur c1 = new CompteurOrd(); 
        compteur c2 = new CompteurCycl(); 

        System.out.println("Initial values:");
        System.out.println("c1: " + c1.getCourant());
        System.out.println("c2: " + c2.getCourant());

     
        for (int i = 0; i < 6; i++) {
            c1.incrementer();
            c2.incrementer();
            System.out.println("Apres incrementer " + (i + 1) + ":");
            System.out.println("c1: " + c1.getCourant());
            System.out.println("c2: " + c2.getCourant());
        }

      
        c1.raz();
        c2.raz();
        System.out.println("Apres reset:");
        System.out.println("c1: " + c1.getCourant());
        System.out.println("c2: " + c2.getCourant());
    }
}