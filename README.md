# Biblioteca Virtual

O desafio consiste em criar um app que crie uma blibloteca pessoal de livros virtuais.

O candidato deve dar **fork** neste repositório e após o termino do desenvolvimento, realizar um **pull request** para análise do time.

O código deve ser feito na ferramenta Android Studio. Pode ser em Java ou em Kotlin.

### Introdução

O aplicativo têm três telas. A lista de livros do usuário, a lista de livros à venda e o histórico de transações. 

O aplicativo começa com a lista de livros do usuário. 
Ao iniciar o aplicativo pela primeira vez esssa lista está vazia.

O usuário começa com R$ 100,00. A informação de dinheiro do usuário deve ser exibida em todas as telas.

O usuário pode ir para a lista de livros à venda ao apertar o botão "Comprar Livros".
O usuário pode ir para o histórico de transações ao apertar o botão "Ver Histórico de Compras".

### Meus livros

O aplicativo deve mostrar a lista de livros do usuário.

Um livro tem as seguintes informações:
+ Nome [title]
+ Escritor [writer]
+ Foto do item [thumbnailHd]

### Lista de livros à venda

O aplicativo deve mostrar a lista de livros à venda.
Para obter os livros da loja, sua aplicação deverá realizar uma chamada `GET` na URL https://raw.githubusercontent.com/Felcks/desafio-mobile-lemobs/master/products.json

Um livro à venda tem as seguintes informações:
+ Nome [title]
+ Preço [price]
+ Escritor [writer]
+ Foto do item [thumbnailHd]

Cada item possui uma opção de comprar. O aplicativo só aprova a compra se o usuário tiver dinheiro suficiente.
Se confirmada a compra, o valor deve ser descontado do dinheiro do usuário.
Livros já comprados não aparecem na lista à venda ou aparecem como bloqueados.

### Histórico de transações

O aplicativo deve mostrar o histórico de transações de compras.
As informações que devem ser exibidas são as mesmas salvas no banco de dados. 

### Banco de dados
Todas as compras realizadas devem ser salvas em um banco interno com os seguintes campos:
+ Nome do livro
+ Valor
+ Data e hora

### Resumo do Aplicativo
+ Meus livros
+ Lista de livros à venda
+ Histórico de transações

### Bônus
+ Conseguir dar Zoom nos livros
+ Criatividade na criação das telas do aplicativo
+ Uso de padrões arquiteturais
+ Ter uma opção de favoritar um livro na lista de livros à venda. Livros favoritados aparecem no topo da lista.
+ Ter uma opção de atualizar a lista de livros à venda como na toolbar do aplicativo.
+ Ter a opção de busca pelo nome na lista de livros à venda. 
+ Usar Kotlin.
+ Uso de Mvp ou MVVM.
+ Uso de SharedPreferences para salvar o dinheiro.
+ Testes unitários.
+ Testes de integração.

