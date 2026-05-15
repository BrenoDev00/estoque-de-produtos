# Estoque de Produtos
## Descrição
- Aplicação de estoque de produtos em memória feito em Java.
# Funcionalidades
- Cadastrar produto no estoque;
- Listar Produto cadastrado;
- Remover quantidade de produto;
- Adicionar quantidade de produto.
# Estrutura e organização
- Utilizei Docker para conteinerizar a aplicação com todas as suas dependências necessárias;
- Organizei o código de forma modular;
- Utilizei a pasta entities para guardar as classes;
- Utilizei duas classes: Product e Stock, além da Main, e separei cada uma delas com suas devidas responsabilidades;
- Também utilizei nomes descritivos e funções com responsabilidades bem definidas, seguindo boas práticas como Clean Code e Clean Architecture.
# Como rodar a aplicação
- É necessário possuir a tecnologia Docker localmente;
- Executar o script chamado initalize.sh (no terminal ./initialize.sh) e, em seguida, a aplicação será executada via terminal.