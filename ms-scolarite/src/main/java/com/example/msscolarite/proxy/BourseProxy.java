package com.example.msscolarite.proxy;


import com.example.msscolarite.model.Virement;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-bourse")
@LoadBalancerClient(name = "ms-bourse")
public interface BourseProxy {

    @GetMapping("/virements/search/findVirementByEtudiant_IdEtudiant")
    public CollectionModel<Virement> getVirements(@RequestParam("ide") Long ide,
                                                  @RequestParam("projection") String projection);

}
