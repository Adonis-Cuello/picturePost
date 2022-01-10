package cuello.adonis.pictureshare.domain.users.repos;

import cuello.adonis.pictureshare.domain.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
