package com.smsk.Hospital.management.controller;

import com.smsk.Hospital.management.entity.patient;
import com.smsk.Hospital.management.service.patientSer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class patientCon {
    private final patientSer Con;

    @GetMapping("/getall")
    public List<patient>getAll(){
        return Con.getAll();

    }
    @GetMapping("/getById/{id}")
    public patient getById(@PathVariable Long id){
         return Con.getById(id);
    }
    @PostMapping("/add")
    public patient add(@RequestBody patient data){
        return Con.add(data);
    }
    @PutMapping("/update")
    public patient update(@RequestBody patient new_data,@PathVariable Long id){
        return Con.update(id,new_data);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        Con.delete(id);
    }


}
