import java.util.Scanner;

public class VeiculoAluguel extends Veiculo {
    private double valorDiaria;
    private int quantidadeDias;

    public static Scanner scanner = new Scanner(System.in);

    public VeiculoAluguel (String modelo, double valorDiaria, int quantidadeDias) {
        super(modelo);
        this.valorDiaria = valorDiaria;
        this.quantidadeDias = quantidadeDias;
    }

    /*
    Nota ao professor: Os métodos que não possuem public/private nas suas declarações são devidos a classe Test.
    Se não fossem os testes unitários, eles estariam declarados como private.
     */

    double calcularValorTotal() {
        double retornoValorDiaria = getValorDiaria();
        int retornoQuantidadeDias = getQuantidadeDias();
        double retornoValorCalculoBruto = calcularValorBruto(retornoValorDiaria, retornoQuantidadeDias);
        boolean descontoDisponivel = descontoDisponivel(retornoQuantidadeDias);
        double retornoPorcentagemDescontoDisponivel = calcularPercentualDesconto(retornoQuantidadeDias);
        double retornoValorTotalComDescontoAplicado =
                calcularValorTotalComDescontoAplicado(
                        retornoValorCalculoBruto,
                        retornoPorcentagemDescontoDisponivel);
        if (descontoDisponivel) {
            return retornoValorTotalComDescontoAplicado;
        } else {
            return retornoValorCalculoBruto;
        }
    }

    private double getValorDiaria() {
        return this.valorDiaria;
    }

    private int getQuantidadeDias() {
        return this.quantidadeDias;
    }

    double calcularValorBruto(double valorDiaria, int quantidadeDias) {
        return valorDiaria * quantidadeDias;
    }

    boolean descontoDisponivel (int dias) {
        return dias >= 7;
    }

    double calcularPercentualDesconto(int dias) {
        if (dias < 14) {
            return 0.10;
        } else if (dias > 14 && dias < 30){
            return 0.15;
        } else {
            return 0.20;
        }
    }

    double calcularValorTotalComDescontoAplicado(double totalValorAluguel, double porcentagemDesconto) {
        double totalDesconto = totalValorAluguel * porcentagemDesconto;
        return totalValorAluguel - totalDesconto;
    }

    public static String receberModelo() {
        System.out.print("Por favor, digite o modelo do veículo: ");
        return scanner.next();
    }

    public static double receberValorDiaria() {
        System.out.print("Por favor, digite o valor da diária do aluguel: ");
        return scanner.nextDouble();
    }

    public static int receberQuantidadeDias() {
        System.out.print("Por favor, digite a quantidade de dias que deseja alugar o veículo: ");
        return scanner.nextInt();
    }

}
