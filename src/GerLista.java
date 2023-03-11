import java.util.ArrayList;
import java.util.List;

public class GerLista {
    public List <Lista> bdLista = new ArrayList<Lista>();
    
    public List<Lista> getLista() {
        return bdLista;
    }
    
    public List<Lista> cadLista(Lista lista) {
        bdLista.add(lista);
        return bdLista;
    }
}
