package team.star.blog.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mystic
 * @date 2019-12-15 19:44
 */
@Data
@Table(name = "t_relationship")
@Entity
public class Relationship {
    @Id
    private int id;
    private int contentId;
    private int metadataId;
}
