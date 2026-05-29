import java.util.Scanner;

import net.salesianos.investigadores.Biologo;
import net.salesianos.investigadores.Investigador;
import net.salesianos.investigadores.Matematico;
import net.salesianos.investigadores.Quimico;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[][] matrizInicial = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Matematico matematico = new Matematico("Alan", "Matrices", 1850, matrizInicial);
        Biologo biologo = new Biologo("Rosalind", "Genetica", 1475);
        Quimico quimico = new Quimico("Marie", "Reacciones", 1340);

        biologo.getEspecimenesInvestigacion().add("Rana");
        biologo.getEspecimenesInvestigacion().add("Mariposa");
        biologo.getEspecimenesInvestigacion().add("Bacteria");

        quimico.getElementosReaccion().add("Oxigeno");
        quimico.getElementosReaccion().add("Hidrogeno");
        quimico.getElementosReaccion().add("Carbono");

        Investigador[] investigadores = { matematico, biologo, quimico };
    }
}
