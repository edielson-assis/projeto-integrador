package com.proz.projetointegrador.entidades;

import java.io.Serializable;

import com.proz.projetointegrador.entidades.enums.StatusAdocao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Animais implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false)
    private String especie;
    private String pelagem;

    @Column(nullable = false)
    private Double peso;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_adocao")
    private StatusAdocao status;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}