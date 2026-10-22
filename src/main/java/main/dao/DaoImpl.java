package main.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("dao")
public class DaoImpl implements Idao {

    @Override
    public double getValue() {
        System.out.println("Lecture depuis la base de données (prod): Primary. ");
        return 100.0;
    }
}
