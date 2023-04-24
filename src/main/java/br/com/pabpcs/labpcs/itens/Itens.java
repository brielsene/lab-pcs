package br.com.pabpcs.labpcs.itens;

import br.com.pabpcs.labpcs.lab.Lab;
import br.com.pabpcs.labpcs.lab.LabRequestItemDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "itens")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Itens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_lab")
    @JsonBackReference
    private Lab lab;

    public Itens(ItensRequestDto data){
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.price = data.price();
        this.lab = Lab.builder().id(data.id()).build();
    }


}
