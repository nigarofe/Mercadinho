Instituto Federal de Minas Gerais – Campus Ouro Branco
Curso: Técnico Integrado em Informática
Disciplina: Tópicos em Desenvolvimento de Software
Professor: Saulo Henrique Cabral Silva (saulo.cabral@ifmg.edu.br)
Aluno: Nicholas Gabriel Rocha Ferreira (nigarofe@gmail.com)

Trabalho Prático 2
Módulo de Vendas (Interface Gráfica)

Introdução
Com o objetivo de rever conceitos básicos de programação, com foco na manipulação de Tabelas, bem como a prática de programação utilizando a API Swing, o professor Saulo Henrique Cabral Silva propôs na disciplina Tópicos em Desenvolvimento de Software a tarefa de programar um software com interface gráfica para gerenciar a venda dos produtos ofertados por uma mercearia.

Descrição do minimundo
1. Do armazenamento de dados
O programa requisitará ao usuário o local da tabela de produtos, sendo que tal tabela, um arquivo csv, possui a seguinte formatação:

codigo;produto;preco;quantidade
78564219;amendoim;2.3;23

2. Da interface de vendas
Em seguida, deve ser apresentado uma interface gráfica para a realização da venda de produtos, composta pelos campos:
    • Código
    • Nome
    • Quantidade a ser comprada
    • Quantidade em estoque
    • Preço parcial
    • Preço unitário
Deve existir uma tabela que contenha todos os produtos da compra em andamento, contendo as colunas:
    • Código
    • Nome
    • Valor unitário
    • Quantidade
    • Valor parcial
Obs.: Próximo a tabela deve ser exibido o valor total da compra em andamento.

Existem ainda quatro botões:
    • Adicionar produto: insere um novo produto no carrinho.
    • Remover produto selecionado: elimina algum produto adicionado do carrinho.
    • Finalizar compra: encerra a compra e atualiza a quantidade de produtos no estoque.
    • Estoque: abre a interface gráfica que gerencia o estoque.

3. Da interface de gestão de estoque
Na interface gráfica destinada à gestão de estoque, deve existir uma tabela que contenha todos os produtos ofertados, contendo as colunas:
    • Código
    • Nome
    • Valor unitário
    • Quantidade
Obs.: Apenas os valores das colunas “Valor unitário” e “Quantidade” podem ser modificadas pelo operador.

Existem ainda três botões:
    • Adicionar produto: insere um novo produto no estoque.
    • Remover produto selecionado: elimina algum produto do estoque.
    • Voltar: retorna à interface de vendas


Diagrama de casos de uso








Protótipo das Interfaces

Código Fonte

Problemas encontrados

Conclusão
	Em relação à programação:
A atividade foi útil para relembrar a utilização da biblioteca Java Swing, além dos novos conhecimentos em relação ao uso de tabelas (AbstractTableModel) e leitura e escrita de arquivos.

	Em relação ao desenvolvimento desta documentação:
Ao fazê-la é possível notar algumas falhas no programa, além de deixá-lo muito mais organizado, coerente e visualmente agradável para apresentação.

Referências bibliográficas
DIAS, Adrielly Clara Enriques; DUTRA, Luis Antonio Chinait Hess Costa. Documentação do Trabalho Prático 1: Jogo da Forca. 2020. 7 f. Curso de Técnico Integrado em Informática, Instituto Federal de Minas Gerais - Campus Ouro Branco, Ouro Branco, 2020.

JÚNIOR, José Roberto Martins Costa; FERREIRA, Nicholas Gabriel Rocha. Documentação do Trabalho Prático 1: Jogo da Forca. 2020. 7 f. Curso de Técnico Integrado em Informática, Instituto Federal de Minas Gerais - Campus Ouro Branco, Ouro Branco, 2020.

SILVA, Saulo Henrique Cabral. Trabalho Prático 2 - Módulo de Vendas. Disponível em: https://drive.google.com/file/d/1oCOoOhzzYGYAKCA3bPUKkAiqU6ZFvtJa/view. Acesso em: 27 set. 2020.
