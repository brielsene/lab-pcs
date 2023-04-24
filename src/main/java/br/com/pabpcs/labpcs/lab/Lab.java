package br.com.pabpcs.labpcs.lab;

import br.com.pabpcs.labpcs.endereco.Endereco;
import br.com.pabpcs.labpcs.itens.Itens;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table(name = "lab")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lab {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @Embedded
    private Endereco endereco;
    @OneToMany(mappedBy = "lab", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    @JsonManagedReference
    private List<Itens>itens;

    public Lab(LabRequestDto data){
        this.nome = data.nome();
        this.endereco = new Endereco(data.enderecoRequestDto());

    }

    public Lab(Long id){
        this.id = id;
    }
}
