package team.star.blog.pojo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private int contentId;
    @CreatedDate
    private Instant created;
    private String author;
    private int authorId;
    private int ownerId;
    private String mail;
    private String url;
    private String ip;
    private String agent;
    private String text;
    private String type;
    private String status;
    private int parentCommentId;
}
