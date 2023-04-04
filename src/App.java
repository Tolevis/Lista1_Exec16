import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double metrosQuadrados;

        System.out.println("digite o tamnha da área em metros quadrados ?");
        metrosQuadrados=entrada.nextDouble();
        
        double litrosNecessarios = metrosQuadrados / 3;
        
        int latasNecessarias = (int)Math.ceil(litrosNecessarios / 18);
        
        double preçoTotal = latasNecessarias * 80;

        System.out.printf("voce precisara comprar %d latas de tinta, ao custo de R$%.2f.", latasNecessarias, preçoTotal);

        entrada.close();
    }
}