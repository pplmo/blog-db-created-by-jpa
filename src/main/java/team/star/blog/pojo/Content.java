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
    /**
     * content title
     */
    private String title;
    /**
     * content slug
     */
    private String slug;
    @CreatedDate
    private Instant created;
    @LastModifiedDate
    private Instant modified;
    private String text;
    private int orderNum;
    @ManyToOne
    private User author;
    private String template;
    private String type;
    private String status;
    private String password;
    private int commentsNum;
    private boolean isAllowedComment;
    private boolean isAllowedPing;
    private boolean isAllowedFeed;
    @JoinTable(name = "t_relationship", joinColumns = @JoinColumn(name = "content_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "metadata_id", referencedColumnName = "id"))
    @ManyToMany
    private Set<Metadata> metadataSet = new HashSet<>(16);
}
