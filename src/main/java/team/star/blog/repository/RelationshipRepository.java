package team.star.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.star.blog.pojo.Relationship;

/**
 * @author mystic
 */
@Repository
public interface RelationshipRepository extends JpaRepository<Relationship, Integer> {
}
