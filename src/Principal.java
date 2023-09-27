
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltrodeRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme = " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println(String.format("Média de avaliações do filme: %.2f", meuFilme.pegaMedia()));

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        lost.setIncluidoNoPlano(true);
        lost.setAtiva(false);
        System.out.println("Duração para maratonar esta serie = " + lost.getDuracaoEmMinutos() + " min!");

        Movie outroFilme = new Movie();
        outroFilme.setNome("Jurassic Par");
        outroFilme.setAnoDeLancamento(1994);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total para maratonar todos os titulos adicionados na lista = " + calculadora.getTempoTotal() + " minutos!");

        FiltrodeRecomendacao filtro = new FiltrodeRecomendacao();
        //filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);




    }
}