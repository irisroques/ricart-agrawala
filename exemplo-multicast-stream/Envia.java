import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Classe que implementa o envio de uma mensagem em multicast
 */
class Envia {
    public static void main(String args[]) throws IOException {
        int porta = 6868;
        InetAddress ipGrupo = null;
        MulticastSocket s = null;
        Processo p = new Processo();
        String msg = p.getEstado().toString();
        // junta-se a um grupo de Multicast
        try {
            ipGrupo = InetAddress.getByName("224.225.226.227");
            s = new MulticastSocket(porta);
            s.joinGroup(ipGrupo);
        } catch (SocketException e) {
        }

        // envia mensagem
        DatagramPacket dtgrm = new DatagramPacket(msg.getBytes(), msg.length(), ipGrupo, porta);
        try {
            s.send(dtgrm);
        } catch (IOException e) {
        }
        // sai do grupo e fecha o socket
        try {
            s.leaveGroup(ipGrupo);
            if (s != null)
                s.close();
        } catch (IOException e) {
        }
    }
}