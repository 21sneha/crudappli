package demo.group.controller;


import demo.group.model.assigment;
import demo.group.repository.assigmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class apicontroller {


    @Autowired
    private assigmentrepo assigmentrepo;
    private Object updatedassigment;


    @GetMapping(value = "/assigment")
    public List<assigment> getassigment() {
        return assigmentrepo.findAll();
    }


    @PostMapping(value = "/save")
    public String saveassigment(@RequestBody assigment assigment) {
        assigmentrepo.save(assigment);
        return "saved...";
    }

    @PutMapping(value = "/update/{commodity}")
    public String updateassigment(@PathVariable long commodity, @RequestBody assigment assigment) {
        assigment updateassigment = assigmentrepo.findById(commodity).get();
        assigment.setLicno((assigment.getLicno()));
        assigment.setOilname((assigment.getOilname()));
        assigment.setOilqty((assigment.getOilqty()));
        assigment.setOilprice((assigment.getOilprice()));
        assigmentrepo.save(updateassigment);
        return "updated...";

    }

    @DeleteMapping(value="/delete/{commodity}")
    public String deleteassigment(@PathVariable long commodity) {
        assigment deleteassigment=assigmentrepo.findById(commodity).get();
        assigmentrepo.delete(deleteassigment);
        return "Deleted assigment with the commodity : " +commodity;

    }

}













