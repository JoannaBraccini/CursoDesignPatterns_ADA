# Curso de Design Patterns - Ada / Artemísia

![Java](https://img.shields.io/badge/java-11-orange.svg)
![Status](https://img.shields.io/badge/status-WIP-yellow)


Este repositório reúne exemplos didáticos de Design Patterns ensinados pelo Prof. Anderson Piotto (https://www.linkedin.com/in/anderson-piotto-9aa9113a/), como parte do projeto Elas+ Tech da Ada/Artemísia. Aqui você encontrará implementações simples e comentadas para entender quando e por que usar cada padrão.

---

Sumário
- Visão geral
- Como compilar / executar
- Design Patterns incluídos
  - Builder
  - Factory Method
  - Singleton
  - Prototype
- Próximos padrões (em breve)
- Contato

---

Visão geral

Este módulo tem finalidade educacional: mostrar a ideia central de alguns Design Patterns em Java com código claro e exemplos de uso. Os exemplos são intencionais e minimalistas para facilitar o aprendizado — você pode usá-los como ponto de partida e adaptá-los aos seus projetos.

Como compilar / executar

O projeto usa Maven. Para compilar e rodar os testes/exemplos, use:

```powershell
mvn -q clean compile
```

(O comando silencia parte do output com `-q`; remova se quiser ver logs completos.)

Design Patterns incluídos

Builder
- Onde usar: quando você precisa construir objetos complexos passo a passo, especialmente se o objeto tem muitos parâmetros opcionais ou combinações de configuração que tornam construtores longos e confusos.
- Por que usar: separa a construção da representação, melhora a legibilidade do código e evita construtores com muitos parâmetros (o chamado telescoping constructor problem). Também facilita criar variações do objeto sem explodir o número de construtores.
- Exemplo neste repositório: veja `src/main/java/com/ada/designpattern/builder/Pessoa.java` e `src/main/java/com/ada/designpattern/builder/solucao/PessoaBuilder.java` — há testes de exemplo em `src/main/java/com/ada/designpattern/builder/problema/TestePessoa.java` e `src/main/java/com/ada/designpattern/builder/solucao/TestePessoaComBuilder.java`.

Factory Method
- Onde usar: quando uma classe não pode antecipar a classe exata dos objetos que precisa criar, ou quando você quer delegar a responsabilidade de criação para subclasses ou fábricas separadas.
- Por que usar: centraliza a lógica de criação, melhora a extensibilidade (você pode adicionar novos tipos sem mudar consumidores) e suporta variações de criação dependendo do contexto.
- Exemplo neste repositório: veja `src/main/java/com/ada/designpattern/factorymethods/Produto.java`, as implementações `ProdutoDigital` e `ProdutoFisico`, e a fábrica em `src/main/java/com/ada/designpattern/factorymethods/solucao/ProdutoFactory.java`. Há um teste de exemplo em `src/main/java/com/ada/designpattern/factorymethods/problema/TesteProduto.java` e uma versão usando a factory em `src/main/java/com/ada/designpattern/factorymethods/solucao/TesteProdutoComFactoryMethod.java`.

Singleton
- Onde usar: quando você precisa garantir que uma classe tenha apenas uma única instância em toda a aplicação e fornecer um ponto global de acesso a ela (ex: configurações, conexões de banco, logger, cache).
- Por que usar: controla o acesso a recursos compartilhados, economiza memória ao evitar múltiplas instâncias e garante consistência de estado. Útil para objetos que devem ser únicos por design.
- Exemplo neste repositório: veja `src/main/java/com/ada/designpattern/singleton/solucao/AgendaSingletonEAGER.java` (inicialização eager), `src/main/java/com/ada/designpattern/singleton/solucao/AgendaSingletonLAZY.java` (inicialização lazy) e `src/main/java/com/ada/designpattern/singleton/solucao/AgendaSingletonEnum.java` (usando enum, a forma mais segura). Há testes de exemplo em `src/main/java/com/ada/designpattern/singleton/problema/TesteAgenda.java` e `src/main/java/com/ada/designpattern/singleton/solucao/TesteAgendaComSingleton.java`.

Prototype
- Onde usar: quando você precisa criar novos objetos clonando instâncias existentes ao invés de instanciá-los do zero, especialmente quando a criação é custosa ou complexa.
- Por que usar: reduz o custo de criação de objetos semelhantes, evita subclasses desnecessárias apenas para criar variações e permite criar objetos em tempo de execução sem conhecer suas classes concretas. Ideal para objetos com configurações pré-definidas.
- Exemplo neste repositório: veja `src/main/java/com/ada/designpattern/prototype/Botao.java` com o método `clone()`, o registro de protótipos em `src/main/java/com/ada/designpattern/prototype/solucao/BotaoRegistry.java` e a fábrica em `src/main/java/com/ada/designpattern/prototype/solucao/BotaoFactory.java`. Compare a abordagem com subclasses em `src/main/java/com/ada/designpattern/prototype/problema/` com a solução usando protótipos em `src/main/java/com/ada/designpattern/prototype/solucao/TesteBotaoPrototype.java`.

Próximos padrões
- Adapter, Proxy e outros ✨

Boas práticas e dicas rápidas
- Prefira nomes claros para builders/fábricas (`PessoaBuilder`, `ProdutoFactory`).
- Mantenha a lógica de criação fora das classes consumidoras para reduzir acoplamento.
- Escreva testes pequenos que mostrem o comportamento esperado de cada padrão.

Créditos

Projeto  
![Elas+ Tech](https://img.shields.io/badge/Elas%2BTech-Ada%20%2F%20Artem%C3%ADsia-pink)

Professor  
![Professor](https://img.shields.io/badge/Mentor-Anderson%20Piotto-blue)

Contatos LinkedIn:
- [Anderson Piotto](https://www.linkedin.com/in/anderson-piotto-9aa9113a/)

- [Joanna Braccini](https://www.linkedin.com/in/joannabraccini)

---