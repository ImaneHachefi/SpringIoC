package main;

import main.config.AppConfiguration;
import main.config.DynamicDaoConfiguration;
import main.metier.IntMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getEnvironment().setActiveProfiles("prod");

        IntMetier metier = context.getBean(IntMetier.class);

        double resultat = metier.calcul();
        System.out.println("Résultat final : " + resultat);

        context.close();
    }
}
