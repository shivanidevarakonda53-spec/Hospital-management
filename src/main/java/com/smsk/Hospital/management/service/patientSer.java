package com.smsk.Hospital.management.service;

import com.smsk.Hospital.management.entity.patient;
import com.smsk.Hospital.management.repository.patientRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class patientSer {
    private final patientRep Ser;
    public patient getById(Long id){
       return  Ser.findById(id).orElseThrow(()-> new RuntimeException("id not found"));

    }
    public List<patient> getAll(){
        return Ser.findAll();
    }
    public patient add(patient data){
        return Ser.save(data);
    }
    public patient update(Long id,patient new_data){
        patient old_id=Ser.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
        old_id.setFirstName(new_data.getFirstName());
        old_id.setLastName(new_data.getLastName());
        old_id.setAadhaar(new_data.getAadhaar());
        old_id.setAge(new_data.getAge());
        old_id.setEmail(new_data.getEmail());
        old_id.setBloodGroup(new_data.getBloodGroup());
        old_id.setGender(new_data.getGender());
        old_id.setNumber(new_data.getNumber());
        old_id.setPatientCode(new_data.getPatientCode());
        return Ser.save(old_id);


    }
    public void delete(Long id){
          Ser.deleteById(id);
          System.out.println("id has been deteted"+id);
    }
}
