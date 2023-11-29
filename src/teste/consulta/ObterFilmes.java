package teste.consulta;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {

        DAO< Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 7.5);

        for(Filme filme: filmes) {
            System.out.println(filme.getNome() + " => " + filme.getNota());

            for(Ator ator: filme.getAtores()) {
                System.out.println(ator.getNome());
            }
        }
    }
}
