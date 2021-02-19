package team.star.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.star.blog.pojo.User;

/**
 * @author mystic
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
