<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Exercício Posto de Gasolina </h1>

<p>Um posto de gasolina recebe periodicamente caminhões que abastecem seus tanques com os respectivos combustíveis:</p>
<ul>
<li>Gasolina Comum</li>
<li>Gasolina Aditivada</li>
<li>Etanol</li>
<li>Diesel</li>
</ul>

<p>Cada um possui um determinado valor de custo. Cada tanque possui uma capacidade máxima de 20.000 litros para cada combustível e não é necessário o esvaziamento da capacidade total para um novo abastecimento.</p>

<p>Com os tanques abastecidos, posto atende seus clientes que optam pelo combustível desejado mediante o pagamento por litro baseado no valor de venda. A cada litro abastecido, o respectivo tanque tem sua capacidade reduzida de acordo com o nível de abastecimento. Cada combustível, portanto, possui um valor de venda e o cliente ao chegar no estabelecimento deve informar o valor em reais (R$) que deseja abastecer e a conversão em litros é feita para a subtração do tanque. A tabela de valores segue de acordo com a lista abaixo:</p>

<table border = "1">
<tr>
  <th>Código</th>
  <th>Combustível</th>
  <th>Custo/Compra</th>
  <th>Venda/Litro</th>
</tr>
<tr>
  <td>1</td>
  <td>Etanol</td>
  <td>1,19</td>
  <td>3,49</td>
</tr>
<tr>
  <td>2</td>
  <td>Gasolina Comum</td>
  <td>2,19</td>
  <td>3,49</td>
</tr>
<tr>
  <td>3</td>
  <td>Gasolina Adtivada</td>
  <td>2,29</td>
  <td>3,69</td>
</tr>
<tr>
  <td>4</td>
  <td>Diesel</td>
  <td>1,39</td>
  <td>2,89</td>
</tr>
</table>


<p>Além do processo de abastecimento de veículos, o posto conta com serviços adicionais que podem ou não ser oferecidos aos clientes independente do abastecimento. Seguem os serviços na tabela a seguir:</p>

<table border = "1">
<tr>
  <th>Código</th>
  <th>Serviço</th>
  <th>Valor</th>
</tr>
<tr>
  <td>1</td>
  <td>Ducha Ecológica</td>
  <td>8,00</td>
</tr>
<tr>
  <td>2</td>
  <td>Troca de Óleo</td>
  <td>50,00</td>
</tr>
<tr>
  <td>3</td>
  <td>Balanceamento</td>
  <td>35,00</td>
</tr>
<tr>
  <td>4</td>
  <td>Café</td>
  <td>2,00</td>
</tr>
  
</table>

<p>Desenvolva uma aplicação em Java que gerencie o fornecimento de combustíveis junto ao controle de capacidade dos tanques; a venda dos combustíveis e prestação dos serviços adicionais e por fim, apresente relatórios referentes aos gastos do posto, às vendas de produtos e dos serviços e ao lucro obtido pelo estabelecimento.</p>

<h2>Funcionamento</h2>
<p>No menu principal, aparecem 3 opções:</p>
<ol>
  <li>Gerenciamento do posto;</li>
  <li>Vendas;</li>
  <li>Sair;</li>
</ol>

<h2>Gerenciamento do posto</h2>
<p>Ao selecionar a opção 1 no menu principal, aparece a tela com as seguintes opções de gerência do posto:</p>
<ol>

  <li>Abastecimento dos Tanques;</li>
  <li>Relatório dos Tanques;</li>
  <li>Relatório de Vendas;</li>
  <li>Relatório de Despesas;</li>
  <li>Relatório de Lucros;</li>
  <li>Voltar</li>
</ol>


<h2>Abastecimento dos tanques</h2>
<p>Ao selecionar a opção de abastecimento dos tanques, é exibida a tela para selecionar qual tanque será abastecido e em seguida o inserir valor em litros. Caso o valor inserido exceda a capacidade do tanque, o sistema exibe a mensagem "O valor excede a capacidade do tanque";</p>

<h2>Relatório dos Tanques</h2>
<p>Exibe a quantidade atual de combustível nos tanques;</p>

<h2>Relatório de vendas</h2>
<p>Exibe a quantidade em litros e o valor arrecadado para cada combustível; Exibe também a quantidade realizada e o valor para cada serviço;</p>

<h2>Relatório de despesas</h2>
<p>Exibe a quantidade em litros e o valor pago pela compra ao fornecedor para cada combustível, e também a soma total de litros comprados e o valor total;</p>

<h2>Relatório de lucros</h2>
<p>Exibe o total de lucros brutos e lucros líquidos obtidos com a venda de combustíveis; Abaixo,exibe o total de lucros brutos obtidos com a venda dos serviços; Por último, exibe o total de lucros brutos e lucros líquidos da soma todas as vendas;</p>

<h2>Voltar</h2>
<p>Volta para a tela anterior</p>

<h1>Vendas</h1>
<p>Ao selecionar a opção 2 no menu principal, aparecem as opções:</p>
<ol>
  <li>Abastecimento;</li>
  <li>Serviços;</li>
  <li>Voltar;</li>
</ol>

<h2>Abastecimento</h2>
<p>Exibe a tela com os combustíveis na bomba e o valor por litro de cada um. Ao selecionar o combustível, exibe uma tela para inserir o valor em R$ a ser abastecido. Caso o tanque do combustível selecionado esteja vazio, exibe a mensagem "Tanque Vazio!!!". Caso o valor convertido de real em litros exceda a quantidade disponível no tanque, exibe a mensagem "Não há combustível o suficiente!!!";</p>

<h2>Serviços</h2>
<p>Exibe a tela com sos serviços e seus respectivos valores. Ao selecionar, exibe uma tela de confirmação do serviço realizado, e o sistema inclui o valor nos lucros;</p>

<h2>Voltar</h2>
<p>Volta para a tela anterior</p>

<h2>Sair</h2>
<p>Encerra o sistema.</p>
</body>
</html>
