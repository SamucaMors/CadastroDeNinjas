package dev.samcode.CadastroDeNinjas.missoes.repository;

import dev.samcode.CadastroDeNinjas.missoes.model.Missao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<Missao, Long> {
}
