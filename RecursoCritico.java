import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class RecursoCritico {
    private ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
    private ReadLock r1 = rw.readLock(); // bloqueia token e permite acesso de todos a fila de requisição de leitura
    private WriteLock w1 = rw.writeLock(); //bloqueia todas as threads de leitura e escrita, pega token p/ thread de leitura
    public String recurso = "regiao critica";

    public String getRecurso() {
        //pega lock do recurso para thread
        r1.lock();
        try{
            return recurso;
        }finally{
            r1.unlock();
        }
        
    }

    public void setRecurso(String recurso) {
        w1.lock();
        try{
            this.recurso = recurso;
        }finally{
         w1.unlock();
    }
    }

    
}