package team.star.blog.pojo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mystic
 * @date 2019-12-15 19:44
 */
@Data
@Table(name = "t_content")
@Entity
public class Content {
    @Id
    private int id;
    private String title;
    private String slug;
    private String text;
    private String template;
    private String type;
    private String status;
    private String password;
    private int orderNum;
    private int commentsNum;
    private boolean isAllowedComment;
    private boolean isAllowedPing;
    private boolean isAllowedFeed;
    @CreatedDate
    private Instant created;
    @LastModifiedDate
    private Instant modified;
    @ManyToOne
    private User author;
    @JoinTable(name = "t_relationship", joinColumns = @JoinColumn(name = "content_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "metadata_id", referencedColumnName = "id"))
    @ManyToMany
    private Set<Meta> metaSet = new HashSet<>(16);
}
