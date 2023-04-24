package br.com.pabpcs.labpcs.itens;

import br.com.pabpcs.labpcs.endereco.Endereco;
import br.com.pabpcs.labpcs.lab.LabDadosVisualizarItem;

import java.math.BigDecimal;

public record ItensResponseDto (Long id, String nome, String descricao, BigDecimal price, String nomeLab, Endereco endereco) {
    public ItensResponseDto(Itens item){
        this(item.getId(), item.getNome(), item.getDescricao(), item.getPrice(), item.getLab().getNome(),item.getLab().getEndereco());
    }
}
