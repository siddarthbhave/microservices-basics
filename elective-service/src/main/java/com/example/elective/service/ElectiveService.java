package com.example.elective.service;

import com.example.elective.entity.Elective;
import com.example.elective.repository.ElectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ElectiveService {

    @Autowired
    private ElectiveRepository electiveRepository;

    public Elective saveElective(Elective elective) {
        return electiveRepository.save(elective);
    }

    public Elective findElectiveById(Long electiveId) {
        return electiveRepository.findByElectiveId(electiveId);
    }

    public List<Elective> getAllElectives() {
        return electiveRepository.findAll();
    }

    public String deleteElectiveById(Long electiveId) {
        electiveRepository.deleteById(electiveId);
        return "Elective with Id: " + electiveId + " deleted";
    }

    public String deleteAllElectives() {
        electiveRepository.deleteAll();
        return "All Electives deleted";
    }
}