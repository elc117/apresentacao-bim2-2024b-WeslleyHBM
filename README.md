<a name="readme-top"></a>
<div align="center">
 <h1 align="center">📚📖Resolusão de Atividade Para o Complemento de Nota📖📚</h1>
  <h3 align="center">Atividade 18</h3>
  <p align="center">
    A atividade concistia em resolver a seguinte questão:
      -Exemplo de mau uso de herança ("Example of misusing inheritance") em <a href="https://java-programming.mooc.fi/part-9/1-inheritance">java-programming.mooc.fi</a>: criar e executar 2 programas com base na explicação, comparando mau/bom uso de herança.
    <br />
    <a href="#identificação">Identificação</a> ·
    <a href="#conceito">Conceito</a> ·
    <a href="#detalhes">Detalhes</a> ·
    <a href="#comparativos">Comparativos</a> ·
    <a href="#curiosidades">Curiosidades</a> ·
    <a href="#exemplos">Exemplos</a> ·
    <a href="#conclusão">Conclusão</a>.
    <a href="#bibliografia">Bibliografia</a> 
  </p>
</div>

---

## Identificação

  - **Nome:** Weslley Menezes  
  - **Matrícula:** 202320537 
  - **Matéria:** Paradígmas de Programação (PP)
  - **Período:** Terceiro Semestre

<p align="right">(<a href="#readme-top">início</a>)</p>

---


## Conceito

  - **Pesquisa:** Para começar, iniciei lendo o material de apoio e realizando a tradução do mesmo. A partir dele, consegui aprimorar alguns conceitos básicos do paradigma orientado a objetos. Com isso, trabalhei em conceitos mais intermediários, como hierarquia, superclasses e subclasses, construção de classes e a multiplicidade de classes públicas.  
  
  - **Desenvolvimento:** Com a ajuda do material de apoio das aulas, do site mencionado e da ferramenta de inteligência artificial (ChatGPT), elaborei exemplos e pesquisei conceitos que ainda não dominava completamente, mesmo já tendo visto alguns deles em aula.  
  
  - **Princípio:** O objetivo desta atividade foi compreender como hierarquias funcionam e como suas estruturas devem ser usadas de forma mais eficaz e segura, proporcionando um código mais limpo e com um fluxo mais direcionado.  
  
  - **Hierarquia:** É um conceito essencial no paradigma de orientação a objetos, envolvendo superclasses (classes "mães") e subclasses (classes "filhas"). Superclasses transferem atributos para subclasses, que podem simplesmente herdá-los ou reescrevê-los para adicionar novas funcionalidades. Esse modelo gera o conceito de uma "família" de classes.  
  
  - **Is-a:** O conceito de "is-a" ou "é um" é fundamental para determinar um bom ou mau uso de hierarquia. Ele garante uma leitura clara do código e ajuda a evitar que o código se quebre facilmente.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Detalhes

### Desenvolvimento

#### **codigo com bom uso de hierarquia**
  ```java

  // Classe mãe que sera a classe geratriz ou superClass
  class Animal {
      private String nome;
  
      public Animal(String nome) {
          this.nome = nome;
      }
  
      public String getNome() {
          return nome;
      }
  
      public void fazerSom() {
          System.out.println("Animal fazendo som!");
      }
  }
  
  // Classe filho que é gerada "derivando" a classe mãe, tambem conhecido como subclasse
  class Leao extends Animal {
      public Leao(String nome) {
          super(nome);
      }
  
      @Override
      public void fazerSom() {
          System.out.println("Roar!");
      }
  }
  
  // Outra classe filho que tambem é gerada "derivando" a classe mãe assim como a anterior morem com funcionalidade levemente diferente
  class Pinguim extends Animal {
      public Pinguim(String nome) {
          super(nome);
      }
  
      @Override
      public void fazerSom() {
          System.out.println("Squawk!");
      }
  }
  
  ```
  - ``motivo:`` Esse é um bom exemplo de herança, pois ``Leao`` e ``Pinguim`` são tipos específicos de ``Animal``, demonstrando claramente o conceito de "é um".
  
#### **codigo com mau uso de hierarquia**
  
  ```
  
  // Classe que sera utilizada como classe Mãe ou superClass
  class CarroEsportivo {
      private String cor;
      private int velocidadeMaxima;
  
      public CarroEsportivo(String cor, int velocidadeMaxima) {
          this.cor = cor;
          this.velocidadeMaxima = velocidadeMaxima;
      }
  
      public String getCor() {
          return cor;
      }
  
      public int getVelocidadeMaxima() {
          return velocidadeMaxima;
      }
  
      public void acelerar() {
          System.out.println("Carro esportivo acelerando rapidamente!");
      }
  }
  
  // Classe derivada CarroComercial que seria a classe filho ou subclass
  class CarroComercial extends CarroEsportivo {
      private int capacidadeDeCarga;
  
      public CarroComercial(String cor, int velocidadeMaxima, int capacidadeDeCarga) {
          super(cor, velocidadeMaxima);
          this.capacidadeDeCarga = capacidadeDeCarga;
      }
  
      public int getCapacidadeDeCarga() {
          return capacidadeDeCarga;
      }
  }
  
  ```
  
  - ``motivo:`` Esse é um mau exemplo de herança, pois ``CarroComercial`` não é um ``CarroEsportivo``. Aqui, o relacionamento "é um" é inadequado.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Comparativos

#### Tabela de Dados  

| **Critério**            | **Mau Uso de Herança (CarroEsportivo & CarroComercial)**                         | **Bom Uso de Herança (Animal, Leão & Pinguim)**                      |
|-------------------------|----------------------------------------------------------------------------------|----------------------------------------------------------------------|
| **Relacionamento**      | `CarroComercial` é um `CarroEsportivo` (is-a), mas isso não faz sentido no domínio. | `Leão` e `Pinguim` são tipos específicos de `Animal` (is-a), o que é adequado. |
| **Flexibilidade**       | Baixa: métodos genéricos de `CarroEsportivo` não representam bem `CarroComercial`. | Alta: cada subclasse (`Leão` e `Pinguim`) pode sobrescrever comportamento. |
| **Reutilização**        | Fraca: a classe base possui métodos que não se aplicam ao contexto da subclasse. | Boa: comportamento genérico (como `getNome`) é compartilhado pelas subclasses. |
| **Clareza**             | Confuso: a herança dá a impressão errada de que carros comerciais devem acelerar rapidamente. | Claro: os métodos e propriedades refletem a relação biológica entre as classes. |
| **Encapsulamento**      | Quebrado: atributos e métodos específicos não são bem segregados entre as classes. | Mantido: cada subclasse implementa apenas comportamentos relevantes ao seu contexto. |


<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Curiosidades

  - **Uso de ``Super``:** A utilização de ``super`` no trecho ``super(cor, velocidadeMaxima);``, em vez de ``this``, ocorre porque o ``super()`` faz referência ao construtor da superclasse (classe base) a partir de uma subclasse. Ele é usado para inicializar atributos ou executar lógica definida na superclasse antes de customizar a lógica na subclasse.
    
      - **Ponto 1:** Mantém a lógica centralizada na superclasse.
      - **Ponto 2:** Reduz duplicação de código.
      - **Ponto 3:** Permite fácil modificação na lógica da superclasse sem quebrar subclasses.

  - **Public:** Pode parecer simples e bobo porem com esse trabalho acabei por descobrir que apenas uma classe pública principal pode existir em um único arquivo de código em Java. Caso haja a necessidade de múltiplas classes públicas, elas devem ser organizadas em arquivos separados. Essa limitação visa manter a organização e a estruturação do código.

  - **Código limpo (``clean code``):** O princípio de usar o conceito ``is-a`` não é apenas uma convenção, mas uma prática de "código limpo". Esse conceito consiste em nomear classes, funções e variáveis de forma clara e objetiva, permitindo que o propósito seja compreendido rapidamente. Ele reduz a necessidade de comentários extensos e simplifica a documentação.

  - **Objetivo deste tópico:** Curiosamente, o próprio tópico de "Curiosidades" foi criado para registrar descobertas interessantes feitas ao longo deste trabalho ou do curso de graduação, desde que se relacionassem com o contexto do projeto.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Exemplos 

  - ``Exemplos de bom uso:``
    
      **1)** Animal e subclasses específicas: Animal como classe base, com subclasses como Cachorro, Gato e Pássaro. Todos são animais, mas cada um tem comportamentos e características próprias.
        
      **2)** Veículo e especializações: Veículo como classe base, com subclasses como Carro, Moto e Caminhão. Todos são veículos, mas possuem funcionalidades específicas.
        
      **3)** Forma geométrica: Forma como classe base, com Circulo e Retangulo como subclasses. Ambos compartilham características como área e perímetro.
        
      **4)** Funcionário com hierarquia de cargos: Funcionário como classe base, com subclasses como Gerente, Analista e Estagiário. Cada um pode ter políticas de pagamento ou responsabilidades diferentes.
        
      **5)** Instrumento musical: Instrumento como classe base, com subclasses como Guitarra, Piano e Violino. Todos compartilham métodos como tocar(), mas cada um tem implementações próprias.

  - ``Exemplos de mau uso:``
    
    **1)** Motor herdando de Carro: Um motor não é um carro; ele faz parte de um carro. A relação é de composição, não herança.

    **2)** Casa herdando de Pessoa: Uma casa não é uma pessoa. A relação é de posse (composição), não de especialização.

    **3)** Lista de compras herdando de Produto: Uma lista de compras não é um produto, mas contém vários produtos. Novamente, a relação é de composição.

    **4)** Janela herdando de Botão: Uma janela pode conter botões, mas não é um botão. Isso viola o relacionamento "é-um".

    **5)** Empresa herdando de Funcionário: Uma empresa não é um funcionário; ela os emprega. Usar herança aqui distorce a lógica.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Conclusão

  - Ao realizar este trabalho, ficou evidente a importância de compreender os conceitos fundamentais da hierarquia em programação orientada a objetos, como "is-a" e "has-a". Esses princípios não apenas orientam o uso correto de herança, mas também ajudam a construir códigos mais claros, reutilizáveis e robustos.

    O exercício demonstrou que um bom uso de herança facilita a leitura, manutenção e expansão do código, enquanto um mau uso pode criar confusão e problemas estruturais. Além disso,          reforçou a prática de clean code, onde nomes, estrutura e documentação tornam o código autossuficiente e compreensível, reduzindo a necessidade de comentários excessivos.
  
    Por fim, a atividade contribuiu significativamente para o entendimento de como aplicar herança de forma prática e eficiente, destacando os erros comuns que devem ser evitados e as         boas práticas que ajudam a criar sistemas bem projetados e escaláveis.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Bibliografia
  - Slides de [POD](https://github.com/AndreaInfUFSM/elc117-2024b).
  - material de apoio da questão [java-programming.mooc.fi](https://java-programming.mooc.fi/part-9/1-inheritance).
  - ferramenta de inteligencia artificial [Chat GPT](https://chatgpt.com/).

<p align="right">(<a href="#readme-top">início</a>)</p>
