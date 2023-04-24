package br.com.pabpcs.labpcs.lab;

import br.com.pabpcs.labpcs.endereco.EnderecoRequestDto;

public record LabRequestDto(String nome, EnderecoRequestDto enderecoRequestDto) {
}
