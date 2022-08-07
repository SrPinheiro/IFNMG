package questao04;

public class Zoombie extends Entidade{

    Zoombie() {
        super("Zoombie", 30, 10, 5);
    }

    @Override
    public void setVida(int vida){
        //a vida do zombie nunca sera regenerada
        if(vida <= this.getVida()){
            super.setVida(vida);
        }
    }
}
