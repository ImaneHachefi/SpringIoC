package main.config;

import main.dao.DaoAPI;
import main.dao.DaoFichier;
import main.dao.Idao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DaoAliasConfiguration {

    @Bean

    public Idao daoAlias() {

        return new DaoFichier();
    }
}