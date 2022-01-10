package cuello.adonis.pictureshare.domain.users.repos;

import cuello.adonis.pictureshare.domain.users.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepo extends JpaRepository<Media, Long> {
}
