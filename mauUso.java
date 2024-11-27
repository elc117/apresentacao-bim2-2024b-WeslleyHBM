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

// Classe Main para execução
public class Main {
    public static void main(String[] args) {
        // Criando um objeto de CarroEsportivo
        CarroEsportivo ferrari = new CarroEsportivo("Vermelho", 350);
        System.out.println("Carro esportivo:");
        System.out.println("Cor: " + ferrari.getCor());
        System.out.println("Velocidade máxima: " + ferrari.getVelocidadeMaxima() + " km/h");
        ferrari.acelerar();

        System.out.println();

        // Criando um objeto de CarroComercial
        CarroComercial caminhonete = new CarroComercial("Branco", 120, 1000);
        System.out.println("Carro comercial:");
        System.out.println("Cor: " + caminhonete.getCor());
        System.out.println("Velocidade máxima: " + caminhonete.getVelocidadeMaxima() + " km/h");
        System.out.println("Capacidade de carga: " + caminhonete.getCapacidadeDeCarga() + " kg");
    }
}
