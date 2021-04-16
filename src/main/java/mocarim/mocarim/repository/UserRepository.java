package mocarim.mocarim.repository;

import mocarim.mocarim.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
