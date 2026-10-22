package main.dao;

import org.springframework.stereotype.Component;

@Component("daoFichier")
public class DaoFichier implements Idao {
    @Override
    public double getValue() {
        System.out.println("Lecture depuis un fichier local");
        return 180.0;
    }
}
