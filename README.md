# Padrao de Projeto Command GOF
## Programa que auxilia na administração de um estoque adicionando e removendo itens utilizando padrão de projeto Command - GOF :package:

### Linguagem Java

### Atividade proposta pelo Prof. Adilson Vahldick - Universidade do Estado de Santa Catarina - UDESC

Intenção: 
Encapsular uma solicitação como um objeto, desta forma permitindo parametrizar clientes com diferentes solicitações, enfileirar ou fazer o registro (log) de solicitações e suportar operações que podem ser desfeitas.


Aplicabilidade:
- Parametrizar objetos por uma ação a ser executada, da forma como os objetos. Você pode expressar tal parametrização numa linguagem procedural através de uma função callback. Os Comands são uma substituição orientada o objetos para callbacks
- Especificar, enfileirar e executar solicitações em tepos diferentes. Um objeto Command pode ter um tempo de vida independente da solicitação original. Se o receptor de uma solicitação pode representado de uma maneira independente do espaço de endereçamento, então você pode transferir um objeto command para a solicitação para um processo diferente e lá atender a solicitação.
- Suportar desfazer operações. A operação Execute, de Command, pode armazenar estados para reverter seus efeitos no próprio comando. A interface de Command deve ter acrescentada uma operação Unexecute, que reverte os efeitos de uma chamada anterior de Execute. Os comandos executados  são armazenados em uma lista histórica. O nível ilimitado de desazer e refazer operações é obitido percorrendo esta lista para trás e para frente, chamando operações Unexecute e Execute, respectivamente.
- Suportar o registro (logging) de mudanças de maneira que possam ser replicadas no caso de uma queda de sistema. Ao aumentar a interface de Command com as operações carregar e armazenar, você pode manter um registro (log) persistente das mudanças. A recuperação de uma queda de sistema envolve a recarga dos comandos registrados a partir do disco e sua reexecução com a operação Execute.
- Estruturar um sistema em torno de operações de alto nível construídas sobre operações primitivas. Tal estrutura é comum em sistema de informação que suportam transações. Uma transação encapsula um conjunto de mudanças nos dados. O padrão Command fornece uma maneira de modelar transações. Os Commands têm uma interface comum, permitindo invocar todas transações da mesma maneira. O padrão também torna mais fácil estender o sistema com novas transações.

#### Estrutura
![Estrutura Command](https://github.com/camimassaneiro/Padrao-de-Projeto-Command-GOF/blob/master/Estrutura%20Command.PNG)

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
