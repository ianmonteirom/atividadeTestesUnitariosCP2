import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            VeiculoAluguel novoAluguel = retornaNovoAluguel();
            System.out.println("Custo total do aluguel do veículo: R$" + novoAluguel.calcularValorTotal());
        } catch (Exception ex) {
            System.out.println("Não foi possível criar um novo aluguel no sistema: " + ex);
        }
        try {
            fecharScanner();
        } catch (Exception ex) {
            System.out.println("Erro ao fechar o Scanner.");
        }
    }

    private static VeiculoAluguel retornaNovoAluguel() {
        String retornoModeloVeiculo = VeiculoAluguel.receberModelo();
        double retornoValorDiariaAluguel = VeiculoAluguel.receberValorDiaria();
        int retornoQuantidadeDiasAluguel = VeiculoAluguel.receberQuantidadeDias();
        return new VeiculoAluguel(
                retornoModeloVeiculo,
                retornoValorDiariaAluguel,
                retornoQuantidadeDiasAluguel);
    }

    private static void fecharScanner() {
        scanner.close();
    }

}