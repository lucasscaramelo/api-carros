package com.carros.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity(name = "carro") // nome tabela
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para auto encremento no id
    private Long id;

    @Column(name = "nome") // para mapear coluna
    private String nome;
}
