
package DAO;

import model.Endereco;


public interface EnderecoDAO {
    
    void salvar(Endereco endereco);
    Endereco getEndereco(long ID);
    void remove(Endereco endereco);
    void remove(long ID);
    
}
