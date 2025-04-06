# Atividade Testes Unitários
Desenvolvido por: Ian Monteiro Moreira
<br>Turma: 2ESPX

## Classe: Veiculo
A classe abstrata "Veiculo" possui um atributo "modelo", que é responsável pelo nome do modelo do veículo do aluguel.
Ela também possui um construtor para o atributo "modelo".

## Classe: VeiculoAluguel
A classe "VeiculoAluguel" herda os atributos da classe "Veiculo", que seria o modelo do veículo. 
Ela possui os atributos double "valorDiaria" e o int "quantidadeDias". Começamos o código instanciando um scanner e
escrevendo o método construtor da classe. A classe possui os métodos getters para realizar as operações com os valores
dentro dos métodos, possui os métodos para calcular se há ou não desconto disponível, e se houver, quanto de desconto 
proporcional a quantidade de dias. Abaixo de 7 dias não há desconto, acima de 7 dias são 10% de desconto, acima de 14
dias são 15% de desconto e acima de 30 dias são 20% de desconto. Há o método para realizar o cálculo do valor total,
sendo o valor da diária x a quantidade de dias (se houver desconto é aplicado ao valor total).

## Classe: Main
A classe "Main" é responsável pela execução do programa. Ela que chama os métodos e realiza os cálculos necessários para
receber o valor total a pagar do aluguel. 

## Classes: VeiculoAluguelTest e MainTest
As classes "VeículoAluguelTest" e "MainTest" são responsáveis pela realização dos testes unitários dos métodos das
classes Veiculo e Main, garantindo que o retorno dos métodos sejam os esperados. Eles facilitam muito na manutenção do
código pois com os testes unitários é muito mais fácil de encontrar bugs e fenômenos inesperados na execução dos métodos.
