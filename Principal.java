// Atividade 2 - Polimorfismo e Herança
// Discente: Jhony Wictor do Nascimento Santos

import java.util.Scanner;

class Colaborador {
    protected String nome;
    protected double salario;
    public Colaborador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calculaSalario() {
        return salario;
    }
}

class Tecnico extends Colaborador {
    public Tecnico(String nome, double salario) {
        super(nome, salario);
    }

    public double calculaSalario() {
        return salario * 0.89;
    }
}

class Vendedor extends Colaborador {
    private double comissao;
    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double calculaSalario() {
        return (salario + comissao) * 0.89; 
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do colaborador (ex.: 1412,00): ");
        double salario = scanner.nextDouble();
        Colaborador colaborador;

        System.out.print("Digite o tipo de colaborador (vendedor/tecnico): ");
        String tipo = scanner.next();

        if (tipo.equalsIgnoreCase("tecnico")) {
            colaborador = new Tecnico(nome, salario);
        } else if (tipo.equalsIgnoreCase("vendedor")) {
            System.out.print("Digite a comissão do vendedor (ex.: 150,50): ");
            double comissao = scanner.nextDouble();
            colaborador = new Vendedor(nome, salario, comissao);
        } else {
            System.out.println("Tipo de colaborador inválido.");
            scanner.close();
            return;
        }

        double salarioCalculado = colaborador.calculaSalario();
        System.out.println("O salário calculado do colaborador " + nome + ", menos o imposto de 11% é: " + "R$" + salarioCalculado);

        scanner.close();
    }
}
