package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(10);
        var filmeDoAlex = new Filme("Dogville", 2003);
        filmeDoAlex.avalia(9);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoAlex);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //Filme f1 = meuFilme;
        //f1.setNome("eae");
        //System.out.println(f1.getNome());
        //System.out.println(meuFilme.getNome());

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Vidinha");
        buscaPorArtista.add("Flor");

        System.out.println("Busca por artista: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Busca por artista: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);


        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));




    }
}
