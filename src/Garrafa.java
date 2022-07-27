public class Garrafa {
    // Atributos
    private String cor;
    private int quantidade;
    private boolean tampada;

    //Construtor
    Garrafa (){
        this.tampada = true;
        this.quantidade = 0;
    }
    // Métodos
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void beber(){
        if (this.tampada == true) {
            System.out.println("Não consigo beber");
        } else {
            System.out.println("Bebendo");
            this.quantidade = this.getQuantidade() - 25;
        }
    }
    void encher(){
        if (this.tampada) {
            System.out.println("Não posso encher!");
        } else {
            if (this.quantidade == 100) {
                System.out.println("Garrafa Cheia, não dá para encher mais!");
            } else {
                System.out.println("Enchendo garrafa");
                this.quantidade = 100;
            }

        }
    }

    void status(){
        System.out.println(this.getCor());
        System.out.println(this.getQuantidade());
        System.out.println(this.getTampada());
    }

    // Métodos especiais
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    } 
    public int getQuantidade(){
        return this.quantidade;
    }
    public boolean getTampada(){
        return this.tampada;
    }
}
