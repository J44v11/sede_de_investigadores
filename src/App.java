import java.util.InputMismatchException;
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

        int opcionInvestigador = -1;

        do {
            try {

                System.out.println("--- SEDE DE INVESTIGADORES ---");
                System.out.println("Selecciona un investigador:");

                for (int i = 0; i < investigadores.length; i++) {
                    System.out.println((i + 1) + "º " + investigadores[i].getNombre());
                }

                System.out.println("0. Salir");
                System.out.println("Elige una opcion: ");
                opcionInvestigador = scanner.nextInt();
                scanner.nextLine();

                switch (opcionInvestigador) {

                    case 1:

                        int opcionMatematico;

                        do {
                            System.out.println("--- MENU MATEMATICO ---");
                            System.out.println("1. Identificacion");
                            System.out.println("2. Hacer calculo basico");
                            System.out.println("3. Ver estado del sueldo");
                            System.out.println("4. Multiplicar matriz por un numero");
                            System.out.println("5. Sumar matriz 3x3");
                            System.out.println("6. Mostrar matriz");
                            System.out.println("0. Volver");
                            System.out.println("Elige una opcion: ");
                            opcionMatematico = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcionMatematico) {

                                case 1:
                                    matematico.identificacion();
                                    break;
                                
                                case 2:
                                    System.out.println("Introduce el primer numero: ");
                                    int numero1 = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("Introduce el segundo numero: ");
                                    int numero2 = scanner.nextInt();
                                    scanner.nextLine();
                                    matematico.hacerCalculoBasico(numero1, numero2);
                                    break;
                                
                                case 3:
                                    System.out.println(matematico.estadoSueldo());
                                    break;
                                
                                case 4:
                                    System.out.println("Introduce el numero por el que quieres multiplicar la matriz: ");
                                    int multiplicador = scanner.nextInt();
                                    scanner.nextLine();
                                    matematico.trabajar(multiplicador);
                                    break;
                                
                                case 5:
                                    int[][] matrizNueva = new int[3][3];

                                    for (int i = 0; i < matrizNueva.length; i++) {
                                        for (int j = 0; j < matrizNueva[i].length; j++) {
                                            System.out.println("Introduce el valor de la posicion [" + i + "][" + j + "]: ");
                                            matrizNueva[i][j] = scanner.nextInt();
                                        }
                                    }

                                    scanner.nextLine();
                                    matematico.trabajar(matrizNueva);
                                    break;
                                
                                case 6:
                                    matematico.mostrarMatriz();
                                    break;
                                
                                case 0:
                                    System.out.println("Volviendo al menu principal.");
                                    break;
                                
                                default:
                                    break;

                            }

                        } while (opcionMatematico != 0);
                        break;
                    
                    case 2:
                        int opcionBiologo;

                        do {
                            System.out.println("--- MENU BIOLOGO ---");
                            System.out.println("1. Identificacion");
                            System.out.println("2. Hacer calculo basico");
                            System.out.println("3. Ver estado del sueldo");
                            System.out.println("4. Anadir especimen");
                            System.out.println("5. Trabajar");
                            System.out.println("6. Trabajo dual");
                            System.out.println("7. Mostrar especimenes");
                            System.out.println("0. Volver");
                            System.out.println("Elige una opcion: ");
                            opcionBiologo = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcionBiologo) {
                                case 1:
                                    biologo.identificacion();
                                    break;

                                case 2:
                                    System.out.println("Introduce el primer numero: ");
                                    int numero1Biologo = scanner.nextInt();
                                    System.out.println("Introduce el segundo numero: ");
                                    int numero2Biologo = scanner.nextInt();
                                    scanner.nextLine();
                                    biologo.hacerCalculoBasico(numero1Biologo, numero2Biologo);
                                    break;

                                case 3:
                                    System.out.println(biologo.estadoSueldo());
                                    break;

                                case 4:
                                    System.out.println("Introduce el especimen: ");
                                    String especimen = scanner.nextLine();
                                    biologo.anadirEspecimen(especimen);
                                    break;

                                case 5:
                                    biologo.trabajar();
                                    break;

                                case 6:
                                    biologo.trabajoDual();
                                    break;

                                case 7:
                                    biologo.mostrarEspecimenes();
                                    break;

                                case 0:
                                    System.out.println("Volviendo al menu principal.");
                                    break;

                                default:
                                    System.out.println("Opcion incorrecta.");
                                    break;
                            }

                            System.out.println();

                        } while (opcionBiologo != 0);
                        break;
                    
                    case 3:
                        int opcionQuimico;

                        do {
                            System.out.println("--- MENU QUIMICO ---");
                            System.out.println("1. Identificacion");
                            System.out.println("2. Hacer calculo basico");
                            System.out.println("3. Ver estado del sueldo");
                            System.out.println("4. Anadir elemento");
                            System.out.println("5. Trabajar");
                            System.out.println("6. Trabajo dual");
                            System.out.println("7. Mostrar elementos");
                            System.out.println("0. Volver");
                            System.out.println("Elige una opcion: ");
                            opcionQuimico = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcionQuimico) {
                                case 1:
                                    quimico.identificacion();
                                    break;

                                case 2:
                                    System.out.println("Introduce el primer numero: ");
                                    int numero1Quimico = scanner.nextInt();
                                    System.out.println("Introduce el segundo numero: ");
                                    int numero2Quimico = scanner.nextInt();
                                    scanner.nextLine();
                                    quimico.hacerCalculoBasico(numero1Quimico, numero2Quimico);
                                    break;

                                case 3:
                                    System.out.println(quimico.estadoSueldo());
                                    break;

                                case 4:
                                    System.out.println("Introduce el elemento: ");
                                    String elemento = scanner.nextLine();
                                    quimico.anadirElemento(elemento);
                                    break;

                                case 5:
                                    quimico.trabajar();
                                    break;

                                case 6:
                                    quimico.trabajoDual();
                                    break;

                                case 7:
                                    quimico.mostrarElementos();
                                    break;

                                case 0:
                                    System.out.println("Volviendo al menu principal.");
                                    break;

                                default:
                                    System.out.println("Opcion incorrecta.");
                                    break;
                            }

                            System.out.println();

                        } while (opcionQuimico != 0);
                        break;

                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        break;
                }

            } catch (InputMismatchException error) {
                System.out.println("Error: debes introducir un numero correcto.");
                scanner.nextLine();

            } finally {
                System.out.println("----------------------------------------");
                System.out.println();
            }
        } while (opcionInvestigador != 0);

        scanner.close();
    }
}
