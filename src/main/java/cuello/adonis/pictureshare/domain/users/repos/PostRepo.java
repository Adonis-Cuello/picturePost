package cuello.adonis.pictureshare.domain.users.repos;

import cuello.adonis.pictureshare.domain.users.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
