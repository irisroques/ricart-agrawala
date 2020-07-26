import java.io.IOException;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorAcessoCritico {
    public static void main(String args[]) throws IOException {
        System.out.println("Inicializando Servidor que Permite acesso a Região Crítica");
        ServerSocket ss = new ServerSocket(5000);
        Socket socket = ss.accept();

        
    }
}