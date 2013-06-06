
import java.util.List;

public interface CPersonService {
 
    /**
     * 
     * 
     */
    public List<CPerson>findAll();
    
    /**
     * 
     * 
     */
    public List<CPerson> search(String PersonId);
}
