package com.example.msbourse;

import com.example.msbourse.entities.Etudiant;
import com.example.msbourse.entities.Virement;
import com.example.msbourse.repositories.EtudiantRepository;
import com.example.msbourse.repositories.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class MsBourseApplication  implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    VirementRepository virementRepository;
    public static void main(String[] args) {
        SpringApplication.run(MsBourseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etudiant e1= etudiantRepository.save(new Etudiant(1L,146L,40000F,true,null,null));
        Etudiant e2=etudiantRepository.save(new Etudiant(2L,6845L,20000F,true,null,null));
        Etudiant e3=	etudiantRepository.save(new Etudiant(3L,5456L,90000F,true,null,null));
        Etudiant e4=	etudiantRepository.save(new Etudiant(4L,4322L,60000F,true,null,null));

        virementRepository.save(new Virement(null,4000F, Date.valueOf("2019-01-01"),e1));
        virementRepository.save(new Virement(null,4000F, Date.valueOf("2019-04-01"),e1));
        virementRepository.save(new Virement(null,8000F, Date.valueOf("2019-07-01"),e1));

        virementRepository.save(new Virement(null,8000F, Date.valueOf("2019-02-01"),e2));
        virementRepository.save(new Virement(null,12000F, Date.valueOf("2019-05-01"),e2));

        virementRepository.save(new Virement(null,5000F, Date.valueOf("2020-04-01"),e3));
        virementRepository.save(new Virement(null,9000F, Date.valueOf("2020-07-01"),e3));
    }
}
