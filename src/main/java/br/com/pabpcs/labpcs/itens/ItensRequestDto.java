package br.com.pabpcs.labpcs.itens;

import br.com.pabpcs.labpcs.lab.Lab;
import br.com.pabpcs.labpcs.lab.LabRequestItemDto;

import java.math.BigDecimal;

public record ItensRequestDto(String nome, String descricao, BigDecimal price, Long id)  {
}
