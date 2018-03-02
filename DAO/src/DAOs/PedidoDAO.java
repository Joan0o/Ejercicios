package DAOs;

public class PedidoDAO {
    
    private int id;
    private float fecha;
    private float valor;
    private ClienteDAO cliente;
    private String descripcion;

    
    public boolean create(){
        return true;
    }
    public boolean update(){
        return true;
    }
    public Object read(){
        return true;
    }
    public boolean delete(){
        return true;
    }

}
