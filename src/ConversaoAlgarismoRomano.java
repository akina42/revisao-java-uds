import java.util.Scanner;

public class ConversaoAlgarismoRomano {

    public void inicializarConversao(){
        try {
            System.out.println("Digite um número para converter:");
            Scanner scanner = new Scanner(System.in);
            Integer numeroLido = scanner.nextInt();
            String algarismoRomano = converteAlgarismosRomanos(numeroLido);
            if (algarismoRomano != "Número inválido.")
                System.out.println("Você digitou o valor " + numeroLido +
                        " e em algarismos romanos corresponde a: " + algarismoRomano);
            else {
                System.out.println(algarismoRomano);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no programa.");
        }
    }

    public String converteAlgarismosRomanos(Integer numero) {
        String algarismoRomano = "";
        String mensagemErro = "Número inválido.";
        switch (numero) {
            case 1:
                algarismoRomano = "I";
                break;
            case 2:
                algarismoRomano = "II";
                break;
            case 3:
                algarismoRomano = "III";
                break;
            case 4:
                algarismoRomano = "IV";
                break;
            case 5:
                algarismoRomano = "IV";
                break;
            case 6:
                algarismoRomano = "IV";
                break;
            case 7:
                algarismoRomano = "IV";
                break;
            case 8:
                algarismoRomano = "IV";
                break;
            case 9:
                algarismoRomano = "IV";
                break;
            case 10:
                algarismoRomano = "X";
                break;
            default:
                return mensagemErro;
        }
        return algarismoRomano;
    }
}
