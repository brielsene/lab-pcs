package br.com.pabpcs.labpcs.endereco;

public record EnderecoResponseDto(String estado, String cidade, String bairro, String logradouro) {
    public EnderecoResponseDto(Endereco endereco){
        this(endereco.getEstado(), endereco.getCidade(), endereco.getBairro(), endereco.getLogradouro());
    }
}
