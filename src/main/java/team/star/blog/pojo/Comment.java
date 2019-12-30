package team.star.blog.pojo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

/**
 * @author mystic
 * @date 2019-12-15 19:45
 */
@Data
@Table(name = "t_comment")
@Entity
public class Comment {
    @Id
    private int id;
    @ManyToOne
    private Content content;
    @CreatedDate
    private Instant created;
    @ManyToOne
    private User commentAuthor;
    private String mail;
    private String url;
    private String ip;
    private String agent;
    private String text;
    private String type;
    private String status;
    @ManyToOne
    private Comment parentComment;
}
