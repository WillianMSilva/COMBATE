public class lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
//metodos públicos
    public void apresentar(){
        System.out.println("---------------------------------------------------");
        System.out.println("Nome dele é " + this.getNome());
        System.out.println("Seu país de nascimento é " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e sua altura " + this.getAltura());
        System.out.println("Pensando seus " + this.getPeso() + "KG");
        System.out.println(this.getVitoria() + " Vitórias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpate() + " Empates");
      //  System.out.println("---------------------------------------------------");

    }

    public void status(){
        System.out.println("---------------------------------------------------");
        System.out.println(this.getNome() + " PESO " + this.getPeso() + " CATEGORIA " + this.getCategoria());
        System.out.println(this.getVitoria() + " Vitórias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpate() + " Empates");
       // System.out.println("-------------------------------------------------");


    }

    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+1);
    }

    public void perderLuta(){
        this.setDerrota(this.getDerrota()+1);
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate()+1);
    }

    //métodos construtor clicar no atributo e na lâmpada para gerar automatico.
    public lutador(String no, String na, int id, double al, double pe, int vi, int de,
    int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
}
//metodos getters e setters
    public double getAltura() {
        return altura;
    }public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }public void setCategoria(String categoria) {
       if (this.peso < 52.2){
        this.categoria = "Inválido";
       }else if (this.peso <= 70.4){
        this.categoria = "LEVE";
       }else if (this.peso <= 83.9){
        this.categoria = "MÉDIO";
       }else if (this.peso <= 120.2){
        this.categoria = "PESADO";
       }else{ this.categoria = "INVÁLIDO";
    }
    }

    public int getDerrota() {
        return derrota;
    }public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getVitoria() {
        return vitoria;
    }
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getPeso() {
        return peso;
    }public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }
}
