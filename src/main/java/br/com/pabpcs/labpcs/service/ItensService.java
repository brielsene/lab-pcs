package br.com.pabpcs.labpcs.service;

import br.com.pabpcs.labpcs.itens.Itens;
import br.com.pabpcs.labpcs.itens.ItensRequestDto;
import br.com.pabpcs.labpcs.itens.ItensResponseDto;
import br.com.pabpcs.labpcs.lab.Lab;
import br.com.pabpcs.labpcs.lab.LabRequestItemDto;
import br.com.pabpcs.labpcs.repository.ItensRepository;
import br.com.pabpcs.labpcs.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItensService {

    @Autowired
    private ItensRepository itensRepository;

    @Autowired
    private LabRepository labRepository;
    public void cadastrarItem(ItensRequestDto data){
        Optional<Lab> byId = labRepository.findById(data.id());
        if(byId.isPresent()){
            Itens item = new Itens(data);
            item.setLab(byId.get());
            itensRepository.save(item);
        }

    }

    public List<ItensResponseDto>getAllItens(){
        List<Itens> all = itensRepository.findAll();
       return all.stream().map(ItensResponseDto::new).toList();
    }
}
