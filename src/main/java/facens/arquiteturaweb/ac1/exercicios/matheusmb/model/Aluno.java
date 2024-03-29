package facens.arquiteturaweb.ac1.exercicios.matheusmb.model;

import java.time.LocalDate;

public class Aluno {
    private Long id;
    private String nome;
    private int idade;
    private String ra;
    private LocalDate dataMatricula;
    private String curso;

    // getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRa() {
        return ra;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public String getCurso() {
        return curso;
    }

    // setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
