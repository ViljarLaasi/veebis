package viljar;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface Haldur extends CrudRepositor<Alleel, String> {
  
}
