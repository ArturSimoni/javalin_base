package br.edu.ifpr.pgua.eic.tads.models;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Pessoa(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone=telefone;
        this.email=email;
    }

    public String getNome(){
        return this.nome;
    }

   
}
