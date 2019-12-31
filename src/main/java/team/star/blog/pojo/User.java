package team.star.blog.pojo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

/**
 * @author mystic
 * @date 2019-12-15 19:43
 */
@Data
@Table(name = "t_user")
@Entity
public class User {
    @Id
    private int id;
    @Column(unique = true, nullable = false)
    private String name;
    private String password;
    @Column(unique = true, nullable = false)
    private String mail;
    /**
     * user homepage
     */
    private String url;
    /**
     * user screen name, i.e. nickname
     */
    private String screenName;
    private String groupName;
    private String authCode;
    /**
     * user account created time
     */
    @CreatedDate
    private Instant created;
    /**
     * last active time
     */
    private Instant activated;
    /**
     * last login time
     */
    @LastModifiedDate
    private Instant logged;
}
