package br.com.letscode.persistence;

import br.com.letscode.model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivroDao {

    private List<Livro> livraria = new ArrayList<>();

    public Livro saveLivro(Livro livro) throws Exception {
        if (livro.getId() != null) {
            throw new Exception("Livro já cadastrado");
        }
        livraria.add(livro);
        return livro;
    }

    public List<Livro> findAll() {
        return livraria;
    }

    public Optional<Livro> findById(int id){
        return livraria.stream()
                .filter(i -> id == i.getId())
                .findFirst();
    }

    public Optional<Livro> findByName(String name){
        return livraria.stream()
                .filter(s -> name == s.getName())
                .findFirst();
    }

    public Optional<Livro> findByAutor(String autor){
        return livraria.stream()
                .filter(s -> autor == s.getAutor())
                .findFirst();
    }
}