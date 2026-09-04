package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {


    private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        System.out.println("Adicionado a duração em minutos de: " + t);
        tempoTotal += t.getDuracaoEmMinutos();
    }

//    public void inclui (Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }


}
