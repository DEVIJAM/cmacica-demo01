package pe.cmacica.labs.labs01.Services;

import pe.cmacica.labs.labs01.Repository.ClientesRepository;

public class ClientesService {

    private ClientesRepository clientesRepository;

    public  ClientesService(){
        this.clientesRepository = new ClientesRepository();
    }

    public void Guardar(){
        this.clientesRepository.Guardar();
    }

}
