package main.config;

import main.dao.DaoAPI;
import main.dao.DaoFichier;
import main.dao.Idao;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"main.dao", "main.metier"})
@PropertySource("classpath:app.properties")
public class AppConfiguration {
    @Bean

    public Idao daoAlias() {

        return new DaoFichier();
    }

}