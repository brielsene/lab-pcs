package br.com.pabpcs.labpcs.repository;

import br.com.pabpcs.labpcs.lab.Lab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LabRepository extends JpaRepository<Lab, Long> {
}
