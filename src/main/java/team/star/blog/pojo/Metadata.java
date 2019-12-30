package team.star.blog.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mystic
 * @date 2019-12-15 19:45
 */
@Data
@Table(name = "t_metadata")
@Entity
public class Metadata {
    @Id
    private int id;
    private String name;
    private String slug;
    private String type;
    private String description;
    private int count;
    private int orderNum;
    @ManyToMany(mappedBy = "metadataSet")
    private Set<Content> contentSet = new HashSet<>(16);
}
