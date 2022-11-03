
package DAO;

import model.Endereco;

import java.util.HashSet;


public class EnderecoDAOList implements EnderecoDAO {

    private static final HashSet<Endereco> EnderecoList = new HashSet<>();

    @Override
    public void salvar(Endereco endereco) {
        if (endereco.getID() == 0) {
            //TODO atualizar
        } else {

        }

    }


    @Override
    public Endereco getEndereco(long ID) {
        return EnderecoList.stream().filter(end -> end.getID() == ID).findFirst().orElse(null);

    }

    @Override
    public void remove(Endereco endereco) {
        try {
            EnderecoList.remove(endereco);
        } catch (NullPointerException e) {
            //
        }
    }


    @Override
    public void remove(long ID) {
        this.remove(getEndereco(ID));
    }
}
