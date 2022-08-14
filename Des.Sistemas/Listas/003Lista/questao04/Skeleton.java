package questao04;

public class Skeleton extends Entidade{

    Skeleton() {
        super("Skeleton", 10, 5, 0);
    }

    @Override
    public void setVida(int vida){
        //a vida do Skeleto nunca sera regenerada
        if(vida <= this.getVida()){
            super.setVida(vida);
        }
    }
}
