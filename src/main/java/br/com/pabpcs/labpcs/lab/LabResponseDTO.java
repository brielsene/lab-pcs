package br.com.pabpcs.labpcs.lab;

import br.com.pabpcs.labpcs.endereco.Endereco;
import br.com.pabpcs.labpcs.endereco.EnderecoRequestDto;
import br.com.pabpcs.labpcs.itens.Itens;

import java.util.List;

public record LabResponseDTO(String nome, Endereco endereco, List<Itens> itens) {
    public LabResponseDTO(Lab lab){
        this(lab.getNome(), lab.getEndereco(), lab.getItens());
    }
}
