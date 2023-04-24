package br.com.pabpcs.labpcs.controller;

import br.com.pabpcs.labpcs.lab.LabRequestDto;
import br.com.pabpcs.labpcs.lab.LabResponseDTO;
import br.com.pabpcs.labpcs.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lab")
public class LabController {
    @Autowired
    private LabService labService;

    @GetMapping
    public List<LabResponseDTO>getAllLabs(){
        return labService.getAllLabs();
    }

    @PostMapping
    public void cadastrar(@RequestBody LabRequestDto data){
        labService.cadastrar(data);
    }

}
