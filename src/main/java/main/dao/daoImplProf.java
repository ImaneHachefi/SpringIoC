package main.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoProd")
@Profile("prod")
public class daoImplProf implements Idao {
    @Override
    public double getValue() {
        return 100.0;
    }
}