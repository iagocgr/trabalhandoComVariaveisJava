public class App {
    public static void main(String[] args) throws Exception {
        //DECLARAÇÃO DE VARIAVEIS 
        int numeroInteiro = 10; 
        boolean variavelLogica = false;
        byte numeroByte = 101;
        int soma = numeroInteiro + numeroByte;
        char caracter = 'V';        
        
        System.out.println(numeroInteiro);
        System.out.println("\n" + variavelLogica);
        System.out.println("\n"+ numeroByte);
        System.out.println("\n"+ soma);
        System.out.println("\n"+ caracter);

        for (int i=0; i<=10; i++) {
            System.out.println(i); 
        } 
        /*int i;
        String vet[];

        boolean achou = false;
        while( i < vet.length && !achou ){
            achou = ( vet[i] == "param" );
            i++;
        } */

        if (variavelLogica) {
            System.out.println("\n Teste de Variavel logica  ->: " + caracter);
        }
        else {
            System.out.println("O Valor é Falso: " + variavelLogica +  "\n");
        }
        variavelLogica = (soma < numeroInteiro) ? caracter == 'V' : !variavelLogica ;
        System.out.println("\n O Valor é: " + variavelLogica +  "\n");


        /* switch () {
            case <valor 1>:
                <lista de commandos>
                [break;]
            case <valor 2>:
                <lista de commandos>
                [break;]
            default: 
                <lista de comandos>
        }  */   

    
    }    



}

