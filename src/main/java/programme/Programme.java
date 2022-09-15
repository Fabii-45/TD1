package programme;

import facade.FacadeMare;
import mare.Mare;
import mare.Poisson;

import static java.lang.Thread.sleep;


public class Programme {

    public static void main(String[] args) throws InterruptedException {


        FacadeMare facadeMare = new FacadeMare();
        facadeMare.creerMare(40,50,3);
        facadeMare.animerMare();
        sleep(1500);
        facadeMare.gelerMare();
        System.out.println("La mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));
        facadeMare.animerMare();
        sleep(1500);

        System.out.println("La mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));

        System.out.println("TEST\n---------------------");
        facadeMare.launchGrenade(14, 16, 5);
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));

        System.out.println("La mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));
    }
}
