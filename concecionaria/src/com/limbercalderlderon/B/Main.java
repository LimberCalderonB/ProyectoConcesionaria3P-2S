package com.limbercalderlderon.B;

import com.limbercalderlderon.B.dao.ClienteDao;
import com.limbercalderlderon.B.dao.CocheDao;
import com.limbercalderlderon.B.dao.RevisionDao;
import com.limbercalderlderon.B.model.Cliente;
import com.limbercalderlderon.B.model.Coche;
import com.limbercalderlderon.B.model.Revision;
import com.limbercalderlderon.B.util.ConectorBD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1450","carlos peres","cochabamba", "cbba", 42454545);
        Coche coche = new Coche("AH291","ferrari", "UOW20", "NEGRO", 20,"1450");
        Revision revision = new Revision("19024","FILTRO","FINO", "FRENOS", "AH291");

        ClienteDao clienteDao = new ClienteDao();
        CocheDao cocheDao = new CocheDao();
        RevisionDao revisionDao = new RevisionDao();

        //CREAR
        //clienteDao.addCliente(cliente);
        //cocheDao.addCoche(coche);
        //revisionDao.addRevision(revision);

        //READ
        /*List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i=0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            System.out.println(cliente);
        }

         */
        /*
        List<Coche> coches = cocheDao.getAllCoches();
        for (int i=0; i < coches.size(); i++){
            Coche coche = coches.get(i);
            System.out.println(coche);
        }
         */
        /*
        List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i = 0; i < revisiones.size(); i++){
            Revision revision1 = revisiones.get(i);
            System.out.println(revision1);
        }
         */


        //UPDATE
        /*
        Cliente cliente = new Cliente ("1450","limbert peres","lapaz", "cb32ba", 1255555);
        clienteDao.updateCliente(cliente);
         */
        /*
        Coche coche =  new Coche("AH291", "wolksvagen", "UUUUU1", "BLANCO", 20, "1450");
        cocheDao.updateCoche(coche);
         */
        /*
        Revision revision1 = new Revision("19024","NOFILTRO", "girasol", "NOFRENOS", "AH291");
        revisionDao.updateRevision(revision1) ;
         */

        //DELETE
        //clienteDao.deleteCliente("1451");
        //cocheDao.deleteCoche("AH291");
        revisionDao.deleteRevision("19024");
    }
}
