import java.util.concurrent.locks.ReentrantLock;

public class RecursoCritico {
    private ReentrantLock lock = new ReentrantLock();
    public String recurso = "regiao critica";

    public String getRecurso() {
        //pega lock do recurso para thread
        lock.lock();
        try{
            return recurso;
        }finally{
            lock.unlock();
        }
        
    }

    public void setRecurso(String recurso) {
        lock.lock();
        try{
            this.recurso = recurso;
        }finally{
            lock.unlock();
    }
    }

    
}