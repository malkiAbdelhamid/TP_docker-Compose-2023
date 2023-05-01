package com.example.msformationmysql.proxy;

import com.example.msformationmysql.model.Etudiant;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ms-scolarite")
@LoadBalancerClient(name="ms-scolarite")

public interface EtudiantProxy {

    @GetMapping("/etudiants/search/findEtudiantByIdFormation")
    CollectionModel<Etudiant> getLesEtudiants(@RequestParam("idf") Long idf,
                                              @RequestParam("projection") String projection);
}


