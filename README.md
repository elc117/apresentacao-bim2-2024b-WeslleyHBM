<a name="readme-top"></a>
<div align="center">
  <h1 align="center">Resolusão de Atividade Para o Complemento de Nota</h1>
  <h3 align="center">Atividade 18</h3>
  <p align="center">
    A atividade concistia em resolver a seguinte questão:
      -Exemplo de mau uso de herança ("Example of misusing inheritance") em <a href="https://java-programming.mooc.fi/part-9/1-inheritance">java-programming.mooc.fi</a>: criar e executar 2 programas com base na explicação, comparando mau/bom uso de herança.-
    <br />
    <a href="#identificação">Identificação</a> ·
    <a href="#conceito">Conceito</a> ·
    <a href="#detalhes">Detalhes</a> ·
    <a href="#conclusão">Conclusão</a>
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

  - **Pesquisa:** Para começar iniciei lendo o material de apoio, após realizar a tradução do mesmo, a partir dele consegui aprimorar alguns conceitos basico do paradigma orientado a pairtir disto consegui trabalhar conceitos de mais intermediarios em relação a hierarquia, como super-classes e sub-classes, construção de classes e multiplicidade de classes publicas.
  
  - **desenvolvimento:** com ajuda do material de apoio das aulas, do material do site e da ferramenta de inteligencia artificial (chat GPT), consegui elaborar ideias de exemplos e pesquisar conceitos, os quais ainda não dominava, mesmo tendo-os visto em aula.
  
  - **Principio:** O principio desta atividade foi entender como hierarquias funcionam e como suas estruturas devem ser usadas de forma mais eficaz e segura, assim proporcionando um codigo mais limpo e com um fluxo mais direcional.

  - **Hierarquia:** é um conceito muito importante no paradiguima de orientação a objetos, tendo como base super-classes e sub-classes, as super-classes tambem conhecidas como classes mães são as classes que vão passar a diante atributos de si propria e as sub-classes ou classes filhas são aquelas que recebem esses atributos e os utilizam podendo apenas mantelos para passarem adiante futuramente ou reescrevelos para assim passar uma nova funcionalidade (gene) para suas filhas, assim criando o conceito de uma família.

  - **Is-a:** ou ``é um`` como tambem é conhesido acaba por ser um dos conceitos que regem as diretrise de hierarquia e passa a ser um dos principais fatores se não o pricipal fator para indentificar um ``bom`` ou um ``mau`` uso de hierarquia.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

## Detalhes

### Desenvolvimento

  -**codigo com bom uso de hierarquia**
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
  -``motivo:`` o motivo pelo qual isto ocorre e por causa da forma em que as sub-classes utilizam a super-classe animal de forma fluida pois leão é um animal assim como o pinguim.
  
  -**codigo com mau uso de hierarquia**
  
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
  
  -``motivo:`` Este é um mal exemplo pelo fato de que a classe carroComercial está herdando a classe carroEsportibo porem ela não ``é um`` carro esportivo.

<p align="right">(<a href="#readme-top">início</a>)</p>

---

### Subtítulo 3

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

  - **Super:** A utilização de super no trexo ``super(cor, velocidadeMaxima);`` ao invés de ``this`` da-se pelo fato de que quando utilizamos o super() em java refere-se à chamada do construtor da classe base (superclasse) a partir da classe derivada (subclasse). Ele é usado para inicializar atributos ou executar lógica definida no construtor da superclasse antes de personalizar a lógica na subclasse.
      . **Ponto 1:** Mantém a lógica centralizada na superclasse.
      . **Ponto 2:** Reduz duplicação de código.
      . **Ponto 3:** Permite fácil modificação na lógica da superclasse sem quebrar subclasses.

  - **Public:** Pode parecer simplis e bobo porem com esse trabalho acabei por descobrir que só pode haver uma classe publica pricipal em seu código e se outras necessitar de que outras classes sejam publicas você precisará estruturalas em códigos diferentes.

  -  **Curiosidades:** Uma curiosidade é que o proprio topico de curiosidades só fou criado para que eu pudesse colocar coisas que descobri e achei facinante no decorrer deste trabalho.

<p align="right">(<a href="#readme-top">início</a>)</p>

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

Resumo ou encerramento do documento, como reflexões ou objetivos alcançados.  

<p align="right">(<a href="#readme-top">início</a>)</p>
