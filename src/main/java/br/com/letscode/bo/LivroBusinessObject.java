package br.com.letscode.bo;

import br.com.letscode.model.Livro;
import br.com.letscode.persistence.LivroDao;

import java.util.List;
import java.util.Objects;

public class LivroBusinessObject {

    private LivroDao livroDao;

    public List<Livro> listarLivros(){
        return livroDao.findAll();
    }


    public Livro save(Livro livro) throws Exception {
        valida(livro);
        return livroDao.saveLivro(livro);
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getName()) || Objects.isNull(livro.getAutor())){
            throw new IllegalArgumentException("Nome precisa ser preenchido / escolhido.");
        }

    }

    /* TRECHO EM DESENVOLVIMENTO - Não funciona

   public List<Livro> buscarLivro(Integer id, String name, String autor){

        if(id != null){
            Optional<Livro> livroOptional = livroDao.findById(id);
            return livroOptional
                    .stream()
                    .findFirst();
        }
        if(name != null) {
            Optional<Livro> livroOptional = livroDao.findByName(name);
        }
        if(autor != null){
            Optional<Livro> livroOptional = livroDao.findByAutor(autor);
        }
        return livroOptional
                .map
    }*/


}
