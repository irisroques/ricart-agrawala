import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Processo implements Runnable{

    int id;
    int portaOrigem;
    int portaDestino;
    Estado estado;
    DataInputStream fluxoEntrada;
    DataOutputStream fluxoSaida;

    

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

}