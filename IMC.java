package indiceMassaCorporal;

import java.text.DecimalFormat;

public class IMC {
    public static void main(String[] args) {
        float peso = (float) 60.40;
        float altura = (float) 1.77;
        float imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (imc <= 24.9) {
            System.out.println("Você está com o seu peso ideal.");
        } else if (imc <= 29.9) {
            System.out.println("Você está acima do peso ideal (Sobrepeso).");
        } else if (imc <= 34.9) {
            System.out.println("Você está com obesidade em grau I");
        } else if (imc <= 39.9) {
            System.out.println("Você está com obesidade em grau II");
        } else {
            System.out.println("Você está com obesidade em grau III");
        }

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Seu resultado do IMC é: " + df.format(imc));
    }
}


