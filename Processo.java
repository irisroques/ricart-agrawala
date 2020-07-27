import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Processo implements Runnable{

    int id;
    int portaOrigem;
    int portaDestino;
    Estado estado;
    DataInputStream fluxoEntrada;
    DataOutputStream fluxoSaida;


    public boolean entrar(){
        return false;
    }

    public void acessarRecurso(){

    }

    public void liberarRecurso(Processo p){

    }

    
    

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPortaOrigem() {
        return portaOrigem;
    }

    public void setPortaOrigem(int portaOrigem) {
        this.portaOrigem = portaOrigem;
    }

    public int getPortaDestino() {
        return portaDestino;
    }

    public void setPortaDestino(int portaDestino) {
        this.portaDestino = portaDestino;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public DataInputStream getFluxoEntrada() {
        return fluxoEntrada;
    }

    public void setFluxoEntrada(DataInputStream fluxoEntrada) {
        this.fluxoEntrada = fluxoEntrada;
    }

    public DataOutputStream getFluxoSaida() {
        return fluxoSaida;
    }

    public void setFluxoSaida(DataOutputStream fluxoSaida) {
        this.fluxoSaida = fluxoSaida;
    }

    public Processo(int id, int portaOrigem, int portaDestino, Estado estado) {
        this.id = id;
        this.portaOrigem = portaOrigem;
        this.portaDestino = portaDestino;
        this.estado = estado;
    }

    public Processo(int id, int portaOrigem, int portaDestino, Estado estado, DataInputStream fluxoEntrada,
            DataOutputStream fluxoSaida) {
        this.id = id;
        this.portaOrigem = portaOrigem;
        this.portaDestino = portaDestino;
        this.estado = estado;
        this.fluxoEntrada = fluxoEntrada;
        this.fluxoSaida = fluxoSaida;
    }

    public Processo() {
    }
    
    
    

}