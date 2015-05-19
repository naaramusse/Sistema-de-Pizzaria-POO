# Sistema-de-Pizzaria-POO
Este trabalho tem como objetivo a criação de um sistema que irá automatizar o processo de 

entregas de pizzas.

Atenção aos requisitos e funcionalidades que deverão estar presentes no sistema:

 O sistema deverá cadastrar e manter as informações dos usuários do sistema.

 O sistema possui quatro tipos diferentes de usuários:

o Administrador: o administrador tem acesso total ao sistema e a todas as 

funcionalidades do mesmo e será o único que poderá cadastrar Entregadores, 

Atendentes e Pizzaiolos;

o Atendentes: cadastram cliente e pedidos;

o Pizzaiolo: Recebem os pedidos dos clientes e enviam as pizzas para os 

entregadores;

o Entregadores: Verificam as entregas prontas e realizam as mesmas.

 O sistema deverá cadastrar os dados do cliente e os seus pedidos;

 O sistema deverá cadastrar os produtos que pode vender. Somente o administrador 

poderá realizar este cadastro;

 O sistema deve possuir somente um JFrame;

 O sistema não deve permitir o acesso de partes do sistema que são restritas para os 

outros usuários;

Testes:

Deve-se criar testes unitários para todos os métodos do RN;

Documentação:

Deve-se criar os diagramas de caso de uso e de classes: 

O diagrama de classes só deve ser criado para a camada DTO;

Deve-se criar para todos os métodos e classes os seus respectivos javadocs;

Dados:

Pode-se usar banco de dados para a implementação do sistema. (Esta ação é recomendada, 

mas não é obrigatória);

Fluxo do processo do pedido:

1. Com todos os dados iniciais do sistema cadastrados pelo Administrador, os passos 

seguintes são liberados;

2. O atendente se autentica no sistema e começa a atender os pedidos por telefone;

3. O atendente verifica se o cliente já está cadastrado pelo número do telefone. Se não 

estiver, ele cadastra o cliente;

4. O atendente registra o pedido do cliente e finaliza o atendimento;

5. O sistema mantém uma lista de pedidos para os pizzaiolos visualizarem, por ordem de 

tempo, o pedido mais antigo estará em cima;

6. O pizzaiolo se autentica no sistema e pode visualizar todos os pedidos para o mesmo 

atender, ele deve atender o primeiro da lista;

7. Após o pizzaiolo terminar, ele deve encaminhar o pedido para ser entregue;

8. O sistema mantém uma lista de pedidos para os entregadores visualizarem, por ordem 

de tempo, o pedido finalizado pelo pizzaiolo primeiro estará em cima;

9. O entregador se autentica no sistema e pode visualizar todos os pedidos para serem 

entregues, ele deve entregar o primeiro da lista.

10. Após a entrega do pedido o entregador deve finalizar o pedido.
