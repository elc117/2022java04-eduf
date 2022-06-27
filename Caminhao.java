public class Caminhao extends Veiculo {
    int capacidade;
    int antt;
    int quantidade_eixos;
  
    public Caminhao(int codigo, String modelo) {
        super(codigo, modelo);
        this.capacidade = -1;
        this.antt = -1;
        this.quantidade_eixos = -1;
    }
    
    public void setCap(int cap) {
        this.capacidade = cap;
    }
    public int getCap() {
        return this.capacidade;
    }

    public void setAntt(int cod) {
        this.antt = cod;
    }
    public int getAntt() {
        return this.antt;
    }

    public void setNeixos(int numero) {
        this.quantidade_eixos = numero;
    }
    public int getNeixos() {
        return this.quantidade_eixos;
    }
    
}
