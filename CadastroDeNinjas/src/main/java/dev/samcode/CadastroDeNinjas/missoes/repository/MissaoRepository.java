package dev.samcode.CadastroDeNinjas.missoes.repository;

import dev.samcode.CadastroDeNinjas.missoes.model.Missao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<Missao, Long> {
}
