import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Processo implements Runnable {

    int id;
    int portaOrigem;
    InetAddress ipGrupo;
    Estado estado;
    DataInputStream fluxoEntrada;
    DataOutputStream fluxoSaida;
    List<Processo> listaProcessos; // lista de requisições recebidas
    TimeUnit tempo;

    public void entrar() {
        try {
            ipGrupo = InetAddress.getByName("224.225.226.227");
            s = new MulticastSocket(portaOrigem);
            s.joinGroup(ipGrupo);
        } catch (IOException e) {
        }

        // envia mensagem
        final DatagramPacket dtgrm = new DatagramPacket(msg.getBytes(), msg.length(), ipGrupo, portaOrigem);
        try {
            s.send(dtgrm);
        } catch (final IOException e) {
        }
        // sai do grupo e fecha o socket
        try {
            s.leaveGroup(ipGrupo);
            if (s != null)
                s.close();
        } catch (final IOException e) {
        }
    }

    public void acessarRecurso() {

    }

    public void liberarRecurso(final Processo p) {

    }

    public void observer() {
        // papel da classe observador
    }

    MulticastSocket s = null;
    Processo p = new Processo();
    String msg = p.getEstado().toString();

    @Override
    public void run() {
        /**
         * Dentro do run crio um loop com o observador/monitor/receptor dentro disso um
         * if que faz a parte de envio de mensagem
         */
        // TODO Auto-generated method stub
        p.entrar();
    }



    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getPortaOrigem() {
        return portaOrigem;
    }

    public void setPortaOrigem(final int portaOrigem) {
        this.portaOrigem = portaOrigem;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(final Estado estado) {
        this.estado = estado;
    }

    public DataInputStream getFluxoEntrada() {
        return fluxoEntrada;
    }

    public void setFluxoEntrada(final DataInputStream fluxoEntrada) {
        this.fluxoEntrada = fluxoEntrada;
    }

    public DataOutputStream getFluxoSaida() {
        return fluxoSaida;
    }

    public void setFluxoSaida(final DataOutputStream fluxoSaida) {
        this.fluxoSaida = fluxoSaida;
    }

    public Processo() {
    }

    public List<Processo> getListaProcessos() {
        return listaProcessos;
    }

    public void setListaProcessos(final List<Processo> listaProcessos) {
        this.listaProcessos = listaProcessos;
    }

    public TimeUnit getTempo() {
        return tempo;
    }

    public void setTempo(final TimeUnit tempo) {
        this.tempo = tempo;
    }

    public InetAddress getIpGrupo() {
        return ipGrupo;
    }

    public void setIpGrupo(final InetAddress ipGrupo) {
        this.ipGrupo = ipGrupo;
    }
    
    
    

}