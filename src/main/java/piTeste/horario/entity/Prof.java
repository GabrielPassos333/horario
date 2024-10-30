package piTeste.horario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prof {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProf;

    @Column(nullable = false, length = 255)
    private String nome;

    // Construtor vazio necessário pelo JPA
    public Prof() {}

    public Prof(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public Long getIdProf() {
        return idProf;
    }

    public void setIdProf(Long idProf) {
        this.idProf = idProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

