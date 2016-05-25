# efeira
Descrição
O projeto da disciplina consiste em implementar uma aplicação em Java utilizando os conceitos de
Orientação a Objeto vistos em sala. A aplicação deve simular o atendimento eletrônico ao cliente de um
suposto estabelecimento comercial.
É proposto que o estabelecimento criado venda produtos comumente encontrados num supermercado
(itens de uma feira doméstica), mas caso o grupo decida oferecer itens de outros departamentos, não há
problemas desde que o funcionamento do programa de um modo geral não seja afetado.
Algumas observações
 O projeto pode ser feito por grupos de até 3 pessoas
 A entrega final pode ser feita até o dia 25/05
 Não deixem para última hora!
 Quaisquer dúvidas, estou à disposição
Funcionamento do Software
Ao ser inicializado, o software deve exibir as opções gerais para usuários comuns (clientes) e para o
administrador. São elas:
1 Ver produtos à venda
2. Administrar o estoque
Caso o usuário escolha a opção de ver produtos à venda, deverão ser oferecidos:
1.1 Os produtos à venda
1.2 Seus respectivos preços
1.3 Opção de comprar um produto
1.4 Opção de finalizar a compra
O usuário poderá escolher um dos produtos que deseja comprar e escolher a opção comprar. Em seguida,
informar a quantidade e confirmar a compra.
Após efetuar a compra de um produto, a lista de produtos à venda é mostrada novamente para que o
usuário escolha algo mais para comprar.
Caso escolha finalizar a compra, deve ser exibido na tela:
1.4.1 Lista de produtos comprados com quantidades, valores unitários e subtotais
1.4.2 Total da compra
1.4.3 Confirmação de finalização da compra (apenas um botão ou opção "OK")
Se o usuário for administrador e escolher a opção "administrar o estoque", deverão ser solicitados o seu
login e senha. Após o fornecimento das credenciais, o software deve oferecer as opções:
2.1 Organizar o estoque
2.2 Ver rendimento atual do estabelecimento
2.3 Voltar à tela inicial
Opções para a organização do estoque:
2.1.2 Adicionar produtos ao estoque
2.1.3 Remover produtos do estoque
2.1.4 Editar produtos no estoque (modificar a quantidade de produtos já existentes)
As opções não precisam ser listadas exatamente como mostrado aqui. Caso seja utilizada uma interface
gráfica, pode ser oferecida a possibilidade de compra de mais de um produto ao mesmo tempo, por
exemplo.
Requisitos Funcionais (Cliente)
O sistema deve oferecer ao seu usuário cliente:
 [RFC01] a opção de exibir produtos à venda ao iniciar a aplicação e ao finalizar a compra (para
reiniciar o procedimento)
 [RFC02] a opção de comprar um dos produtos à venda
 [RFC03] a opção de escolher a quantidade de unidades que serão compradas de um determinado
produto que será comprado
 [RFC04] a opção de confirmação da compra de um produto
 [RFC05] a finalização da compra
 [RFC06] a exibição do resumo da compra feita, após sua finalização, listando os produtos comprados,
suas quantidades, seus valores unitários, seus subtotais, e o total da compra
Requisitos Funcionais (Admin)
 [RFA01] O sistema deve oferecer ao seu usuário administrador a opção de organizar o estoque
 [RFA02] O sistema deve oferecer ao seu usuário administrador a opção de ver o rendimento atual do
seu estabelecimento comercial, listando:
o O valor (em Reais) gasto pelo estabelecimento na compra de todos os produtos em estoque
(tanto dos produtos não vendidos quanto dos já vendidos)
o O valor (em Reais) recebido pelas vendas já efetuadas aos clientes
o O lucro (em Reais), calculado por: valor das vendas efetuadas - valor de compra de todos os
produtos
o O lucro (em %), calculado por: lucro (em Reais) / valor da compra de todos os produtos
 [RFA03] O usuário administrador poderá organizar o estoque se informar um login e senha de acesso
 [RFA04] O usuário administrador, após o login, poderá adicionar e remover produtos, e alterar a
quantidade de produtos do estoque
Requisitos Funcionais (Estoque)
 [RFE01] o estoque só pode ser alterado pelo usuário administrador ou por uma venda feita a um
cliente
 [RFE02] após a confirmação da venda de um produto, o estoque deve ser atualizado e a quantidade
de itens vendidos será removida do mesmo
 [RFE03] após a confirmação da venda de um produto, o estoque adicionará ao histórico de vendas
um registro de venda contendo: o nome do produto vendido, a quantidade vendida, o valor de
compra do produto (pelo estabelecimento), o valor de venda do produto (ao cliente)
