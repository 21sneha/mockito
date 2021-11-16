package jupiter.demo.repository;

import jupiter.demo.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<user, Integer> {

}
