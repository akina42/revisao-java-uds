import java.util.Scanner;

public class DiasSemana {
    public void inicializarDiasSemana(){
        System.out.println("Digite um valor:");
        Scanner scannerSemana = new Scanner(System.in);
        Integer diaDaSemana = scannerSemana.nextInt();
        System.out.print("Dia da semana é: ");

        switch(diaDaSemana){
            case 0:
                System.out.printf("Domingo");
                break;
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("O valor não corresponde a nenhum dia da semana");
                break;
        }
    }

}
