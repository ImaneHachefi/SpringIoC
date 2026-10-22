package main.metier;

import main.dao.Idao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IntMetier {
    private final Idao dao;

    public MetierImpl(Idao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double valeur = dao.getValue();
        return valeur * 2.0;
    }
}
