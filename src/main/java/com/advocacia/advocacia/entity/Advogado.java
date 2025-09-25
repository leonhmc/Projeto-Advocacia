package com.advocacia.advocacia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Advogado {
    
    //*** Atributos da classe Advogado ***/
    // Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAdvogado;

    // Nome
    @Column (nullable = false, length = 40)
    private String nomeAdvogado;
    
    // Telefone
    @Column (nullable = false, length = 11)
    private Integer telefoneAdvogado;

    // Especialidade
    @Column (nullable = false, length = 40)
    private String especialidadeAdvogado;

    // Número de inscrição da OAB
    @Column (nullable = false, length = 40)
    private String oabAdvogado;

}
