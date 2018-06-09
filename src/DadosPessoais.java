import java.util.Scanner;

public class DadosPessoais {
    public void inicializarEntradaDados(){
        System.out.println("Primeira Versão");
        String nome = "Akina Kurita";
        Integer idade = 25;
        Boolean sexoFeminino = true;
        Double peso = 50.00;
        System.out.println("Olá meu nome é " + nome + " tenho " + idade + " anos de idade e tenho " + peso + " quilos.");

        if(idade.equals(18) && (idade > 18)){
            System.out.println("Novinho");
        }
        else if ((idade.equals(30) || (idade < 30))){
            System.out.println("Tiozinho");
        }
        else{
            System.out.println("Tiozão");
        }
    }

    public void inicializarEntradaDadosSegundaVersao(){
        System.out.println("Segunda Versão.");
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Qual seu nome?");
            String nomeLido = scanner.next();;
            System.out.println("Qual sua idade?");
            Integer idadeLido = scanner.nextInt();
            System.out.println("Você é do sexo feminino? Digite 1 para sim e 0 para não:");
            Integer auxiliarFeminino = scanner.nextInt();
            if (auxiliarFeminino == 1){
                Boolean sexoFemininoLido = true;
            }

        }
        catch(Exception e){
            System.out.println("Valores inválidos.");
        }
    }
}


