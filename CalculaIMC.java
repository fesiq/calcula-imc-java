import java.util.Scanner; 

public class CalculaIMC {
    public static void main(String[] args) {
        double altura = 0;
        double peso = 0;
        Scanner entrada = new Scanner(System.in);

        double imc = 0;

        
        System.out.println("Vamos descobrir seu IMC! \n\nNão se esqueça de usar vírgula ao inserir um decimal.\n");
        System.out.println("Insira o seu peso:");
        peso = entrada.nextDouble();

        System.out.println("Insira a sua altura, separando a parte decimal com vírgula: ");
        altura = entrada.nextDouble();

        imc = peso / Math.pow(altura, 2.0);

        System.out.println("O seu IMC é de " + imc);
        

    }
}
