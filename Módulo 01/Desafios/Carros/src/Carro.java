
public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private Boolean ligado;
    private Integer velocidade;

    public Carro(){
        this.ligado = true;
        this.velocidade = 0;
    }

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = true;
        this.velocidade = 0;
    }

    // Getters

    public String getCor(){
        return this.cor;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public Boolean isLigado(){
        return this.ligado;
    }

    public Integer getVelocidade(){
        return velocidade;
    }

    // Setters

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void desligar() {
        if (this.ligado && this.velocidade == 0) {
            this.ligado = false;
            System.out.println("Voce desligou o carro!");
            return;
        }
        System.out.println("Não foi possível desligar, freie totalmente.");
    }

    public void ligar(){
        if(!this.ligado){
            this.ligado = true;
        }
    }

    public void acelerar() {

        if(this.ligado) {
            if (this.velocidade + 10 > 100) {
                this.velocidade = 100;
                System.out.println("Não é possível acelerar mais.");
                return;
            }
            this.velocidade += 10;
            System.out.println("Voce acelerou e a velocidade atual é: " + this.velocidade);
        }

    }

    public void frear() {

        if(this.ligado) {
            if (this.velocidade - 10 < 0) {
                this.velocidade = 0;
                System.out.println("Não é possível frear mais.");
                return;
            }
            this.velocidade -= 10;
            System.out.println("Voce freou e a velocidade atual é: " + this.velocidade);
        }

    }

    public void mostrarEstadoAtual() {
        System.out.println("O estado atual do carro é:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidade);
    }
}
