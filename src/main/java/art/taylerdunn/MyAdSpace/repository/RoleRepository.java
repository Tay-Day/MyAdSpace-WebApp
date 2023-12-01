package art.taylerdunn.MyAdSpace.repository;

import art.taylerdunn.MyAdSpace.models.ERole;
import art.taylerdunn.MyAdSpace.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
