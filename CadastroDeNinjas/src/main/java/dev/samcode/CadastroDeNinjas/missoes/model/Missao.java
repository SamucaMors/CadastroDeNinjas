package dev.samcode.CadastroDeNinjas.missoes.model;

import dev.samcode.CadastroDeNinjas.ninjas.model.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<Ninja> ninjas;

}
