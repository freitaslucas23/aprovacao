import java.util.Scanner;

public class hello {

    public static void main (String [] args) {

        System.out.print ("hello \n ");
        String primeiroNome = "lucas";
        String segundoNome = "freitas \n";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        Scanner Scanner = new Scanner(System.in);

        int ano = 2024;
        int anoFab = 2001;
        int age = ano - anoFab;
        int mediaFinal = 6;


        System.out.print ("\n nota de " + nomeCompleto + age + " yo\n");
        System.out.print("media: ");
        int nota = Integer.parseInt(Scanner.nextLine());
            if(nota > mediaFinal)
                System.out.print("aprovado");
            else if(nota < mediaFinal)
                System.out.print("reprovado ");
            else
            System.out.print("prova final");



}

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return  primeiroNome.concat(" ").concat(segundoNome);

    }
}