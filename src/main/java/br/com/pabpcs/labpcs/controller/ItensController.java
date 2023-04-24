package br.com.pabpcs.labpcs.controller;

import br.com.pabpcs.labpcs.itens.ItensRequestDto;
import br.com.pabpcs.labpcs.itens.ItensResponseDto;
import br.com.pabpcs.labpcs.lab.LabRequestItemDto;
import br.com.pabpcs.labpcs.service.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItensController {
    @Autowired
    private ItensService itensService;

    @PostMapping
    public void cadastrar(@RequestBody ItensRequestDto data){
        itensService.cadastrarItem(data);
    }

    @GetMapping
    public List<ItensResponseDto>getAllItens(){
       return itensService.getAllItens();
    }
}
