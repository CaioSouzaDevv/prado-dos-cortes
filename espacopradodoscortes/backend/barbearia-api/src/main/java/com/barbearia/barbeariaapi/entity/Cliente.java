package com.barbearia.barbeariaapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String endereco;

    @Column(name = "telefone_principal")
    private String telefonePrincipal;

    @Column(name = "telefone_secundario")
    private String telefoneSecundario;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String telefonePrincipal, String telefoneSecundario) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefonePrincipal = telefonePrincipal;
        this.telefoneSecundario = telefoneSecundario;
    }

   public Long getId() {
    return id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTelefonePrincipal() {
    return telefonePrincipal;
}

public void setTelefonePrincipal(String telefonePrincipal) {
    this.telefonePrincipal = telefonePrincipal;
}

public String getTelefoneSecundario() {
    return telefoneSecundario;
}

public void setTelefoneSecundario(String telefoneSecundario) {
    this.telefoneSecundario = telefoneSecundario;
}
}