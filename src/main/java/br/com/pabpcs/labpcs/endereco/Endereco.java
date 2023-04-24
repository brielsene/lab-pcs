package br.com.pabpcs.labpcs.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;

    public Endereco(EnderecoRequestDto data){
        this.estado = data.estado();
        this.cidade = data.cidade();
        this.bairro = data.bairro();
        this.logradouro = data.logradouro();
    }
}
