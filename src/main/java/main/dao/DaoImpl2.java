package main.dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements Idao {
    @Override
    public double getValue() {
        System.out.println("Lecture depuis la base de données (dev)");
        return 150.0;
    }
}
