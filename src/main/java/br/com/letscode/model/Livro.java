package br.com.letscode.model;

import lombok.Data;

@Data
public class Livro {

    private int counter = 0;

    private Integer id;
    private String name;
    private String autor;
        public Livro(int id, String name, String autor) {
        this.id = ++counter;
        this.name = name;
        this.autor = autor;
    }
}



