package main.config;

import main.dao.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
// @Import({AppConfiguration.class})
public class DynamicDaoConfiguration {

    @Value("${dao.target}")
    private String daoTarget;

    @Bean
    @Primary
    public Idao dynamicDao() {
        switch (daoTarget) {
            case "dao": return new DaoImpl();
            case "dao2": return new DaoImpl2();
            case "daoFile": return new DaoFichier();
            case "daoApi": return new DaoAPI();
            default: throw new IllegalArgumentException("Cible DAO inconnue: " + daoTarget);
        }
    }
}
