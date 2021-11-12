package com.imperatori.marcos.cidadesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Long id;

    @Column
    private String nome;

    @Column(name = "nome_pt")
    private String portuguesename;

    @Column(name = "sigla")
    private String code;

    @Column
    private Integer bacen;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPortuguesename() {
        return portuguesename;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
