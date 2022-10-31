
package Estagio.DAO;

import Estagio.model.Endereco;
import java.util.HashSet;


public class EnderecoDAOList implements EnderecoDAO {
    
    private static final HashSet<Endereco> EnderecoList = new  HashSet<>();

    @Override
    public void salvar(Endereco endereco) {
        if (endereco.getID() == 0){
            //TODO atualizar
        }else{
            
        }
      
    }

    @Override
    public Endereco getEndereco(long ID) {
        return null;
    }

    @Override
    public void remove(Endereco endereco) {
        
    }
    
    
    
}
