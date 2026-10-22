package main.dao;

import org.springframework.stereotype.Component;

@Component("daoApi")
public class DaoAPI implements Idao {
    @Override
    public double getValue() {
        System.out.println("Appel à l'API REST externe");
        return 220.0;
    }
}
