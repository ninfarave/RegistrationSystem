
import java.util.List;

public interface CPersonService {
 
    /**
     * Hola
     * 
     */
    public List<CPerson>findAll();
    
    /**
     * 
     * 
     */
    public List<CPerson> search(String PersonId);
}
