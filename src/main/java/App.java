package main.java;
// Scanner pra pegar as informações do usuario.
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando o objeto Corpo Humano.
        CorpoHumano c1 = new CorpoHumano(12,12,12,1.75);

        //Mensagem pra começar a pegar infomação do usuario.
        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO === ");

        // exibindo mensagem e pegado a Massa do usuario.
        System.out.println("Digite a massa inicial (kg): ");
        double massa = sc.nextDouble();
        c1.setMassa(massa);

        // exibindo mensagem e pegado o Volume do usuario.
        System.out.println("Digite o volume inicial (m³): ");
        double volume = sc.nextDouble();
        c1.setVolume(volume);

        // exibindo mensagem e pegado a Densidade do usuario.
        System.out.println("Digite a densidade inicial (kg/m³: ");
        double densidade = sc.nextDouble();
        c1.setDensidade(densidade);

        // exibindo mensagem e pegado a Altura do usuario.
        System.out.println("Digite a altura inicial (m): ");
        double altura = sc.nextDouble();
        c1.setAltura(altura);


        //Mensagem pra mostrar os valores que estão no objeto.
        System.out.printf(" === VALORES INICIAIS === \n Massa: "+ c1.getMassa() + " KG" +
                "\n Volume: " + c1.getVolume() + " m³ " +
                "\n Densidade: " + c1.getDensidade() + " kg/m³" +
                "\n Altura: " + c1.getAltura() + " m" +
                "\n IMC: " + c1.calcularIMC() + "\n" );

        //exibindo mensagem e pegando uma nova Massa do usuario.
        System.out.println("Digite uma nova massa (kg): ");
        massa = sc.nextDouble();
        c1.setMassa(massa);

        //exibindo mensagem e pegando uma nova Altura do usuario.
        System.out.println("Digite uma nova altura (m): ");
        altura = sc.nextDouble();
        c1.setAltura(altura);

        //Exibindo novos valores.
        System.out.printf(" === Novos valores === \n Massa: "+ c1.getMassa() + " KG" +
                "\n Altura: " + c1.getAltura() + " m" +
                "\n IMC: " + c1.calcularIMC() );
    }
}

