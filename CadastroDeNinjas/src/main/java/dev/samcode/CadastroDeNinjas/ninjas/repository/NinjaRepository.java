package dev.samcode.CadastroDeNinjas.ninjas.repository;

import dev.samcode.CadastroDeNinjas.ninjas.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
