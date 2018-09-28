package com.techsix.techsix_android.model;

/**
 * Created by android on 27/09/2018.
 */

public class Paciente {
    private String id, nome, senha, endereco;
    private int email, nascimento,telefone;
    private boolean sexo, estado_civil;



    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(boolean estado_civil) {
        this.estado_civil = estado_civil;
    }



//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public int getIdade() {
//        return RG;
//    }
//
//    public void setIdade(int idade) {
//        this.RG = idade;
//    }

    @Override
    public String toString() {
        return nome + "\n" + email + "\n" + senha + "\n" + endereco + "\n" + nascimento + "\n" + telefone + "\n" + sexo + "\n" + estado_civil;

    }
}
