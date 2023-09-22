
import br.com.alura.screenmatch.models.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();

        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println(String.format("Média de avaliações do filme: %.2f", meuFilme.pegaMedia()));
    }
}