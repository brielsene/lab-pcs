package br.com.pabpcs.labpcs.service;

import br.com.pabpcs.labpcs.lab.Lab;
import br.com.pabpcs.labpcs.lab.LabRequestDto;
import br.com.pabpcs.labpcs.lab.LabResponseDTO;
import br.com.pabpcs.labpcs.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabService {

    @Autowired
    private LabRepository labRepository;

    public void cadastrar(LabRequestDto data){
        Lab lab = new Lab(data);
        labRepository.save(lab);
    }

    public List<LabResponseDTO>getAllLabs(){
        List<Lab> all = labRepository.findAll();
        return all.stream().map(LabResponseDTO::new).toList();
    }
}
