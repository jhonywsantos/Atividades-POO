package dadosCadastrais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;
    private String tipoSanguineo;
    private Endereco endereco;
    private String telefone;

    public Pessoa(String nome, String cpf, String sexo, String tipoSanguineo, Endereco endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Digite o tipo sanguíneo: ");
            String tipoSanguineo = scanner.nextLine();

            System.out.print("Digite a rua: ");
            String rua = scanner.nextLine();

            System.out.print("Digite o número: ");
            String numero = scanner.nextLine();

            System.out.print("Digite o bairro: ");
            String bairro = scanner.nextLine();

            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();

            System.out.print("Digite o estado: ");
            String estado = scanner.nextLine();

            System.out.print("Digite o país: ");
            String pais = scanner.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, cpf, sexo, tipoSanguineo,
                    new Endereco(rua, numero, bairro, cidade, estado, pais), telefone);

            pessoas.add(pessoa);

            System.out.print("Adicionar outro usuário? (s/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("s"));

        System.out.println("\nDados cadastrados:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Sexo: " + pessoa.getSexo());
            System.out.println("Tipo Sanguíneo: " + pessoa.getTipoSanguineo());
            System.out.println("Endereço: " + pessoa.getEndereco().toString());
            System.out.println("Telefone: " + pessoa.getTelefone());
            System.out.println();
        }

        scanner.close();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}

class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    public String toString() {
        return rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado + ", " + pais;
    }
}



