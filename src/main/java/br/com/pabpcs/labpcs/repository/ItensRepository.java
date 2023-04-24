package br.com.pabpcs.labpcs.repository;

import br.com.pabpcs.labpcs.itens.Itens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRepository extends JpaRepository<Itens, Long> {
}
