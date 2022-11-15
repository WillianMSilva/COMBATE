import java.util.Random;

public class luta {
    //atributos
    private lutador desafiante;
    private lutador desafiado;
    private int round;
    private boolean aprovada;

    //métodos públicos
    public void marcarluta(lutador l1, lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("------------------------------------");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("------------------------------------");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                System.out.println("-------------RESULTADO DA LUTA-----------");
                System.out.println("EMPATOU!!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

                case 1:
                System.out.println("-------------RESULTADO DA LUTA-----------");
                System.out.println("  VENCEUUUU!!!" + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

                case 2:
                System.out.println("-------------RESULTADO DA LUTA-----------");
                System.out.println(" VENCEUUU!!!" + this.desafiante.getNome()
                );
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
            }


        }else{
            System.out.println("A luta não pode acontecer!");
        }

    }
    
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public lutador getDesafiado() {
        return desafiado;
    }public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }public void setRound(int round) {
        this.round = round;
    }

    

    
}
