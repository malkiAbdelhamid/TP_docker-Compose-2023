package com.example.msformationmysql;

import com.example.msformationmysql.entities.Formation;
import com.example.msformationmysql.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class MsFormationMysqlApplication implements CommandLineRunner {

    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    FormationRepository formationRepository;
    public static void main(String[] args) {
        SpringApplication.run(MsFormationMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Formation.class);

        Formation f1=  formationRepository.save(new Formation(null, "Java",30,null));
        Formation f2=formationRepository.save(new Formation(null, "Angular",40,null));

    }
}
