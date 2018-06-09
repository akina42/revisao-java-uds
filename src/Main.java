class Main {
    public static void main(String[] args) {

/*
        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.inicializarEntradaDados();
        dadosPessoais.inicializarEntradaDadosSegundaVersao();

        DiasSemana diasSemana = new DiasSemana();
        diasSemana.inicializarDiasSemana();
*/

        ConversaoAlgarismoRomano conversaoAlgarismoRomano = new ConversaoAlgarismoRomano();

/*        for (int i = 0; i < 10; i++){
            System.out.println("Iteração por for número: " + i);
            conversaoAlgarismoRomano.inicializarConversao();
        }

        System.out.println("---------------------------------------");

        int j = 0;
        while (j < 10){
            System.out.println("Iteração por while número: " + j);
            conversaoAlgarismoRomano.inicializarConversao();
            j++;
        }
        */

        for (int i = 10; i > 0; i--){
            System.out.println("Iteração por for número: " + i);
            conversaoAlgarismoRomano.inicializarConversao();
        }

        System.out.println("---------------------------------------");

        int j = 10;
        while (j > 0){
            System.out.println("Iteração por while número: " + j);
            conversaoAlgarismoRomano.inicializarConversao();
            j--;
        }




    }

}
