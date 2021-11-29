package com.example.elective.controller;

import com.example.elective.entity.Elective;
import com.example.elective.service.ElectiveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/electives")
public class ElectiveController {

    @Autowired
    private ElectiveService electiveService;

    @PostMapping("/create")
    public Elective saveElective(@RequestBody Elective elective) {
        return electiveService.saveElective(elective);
    }

    @GetMapping("/get/{id}")
    public Elective findElectiveById(@PathVariable("id") Long electiveId) {
        return electiveService.findElectiveById(electiveId);
    }

    @GetMapping("/getall")
    public List<Elective> getAllElectives() {
        return electiveService.getAllElectives();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteElectiveById(@PathVariable("id") Long electiveId) {
        return electiveService.deleteElectiveById(electiveId);
    }

    @DeleteMapping("/delete/all")
    public String deleteAllElectives() {
        return electiveService.deleteAllElectives();
    }

}