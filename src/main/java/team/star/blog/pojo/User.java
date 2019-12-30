package team.star.blog.pojo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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
    /**
     * user name, uniqueness
     */
    private String name;
    /**
     * user password
     */
    private String password;
    /**
     * user mail, uniqueness
     */
    private String mail;
    /**
     * user homepage
     */
    private String url;
    /**
     * user screen name, i.e. nickname
     */
    private String screenName;
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
    /**
     * user group
     */
    private String groupName;
    /**
     * user authentication code
     */
    private String authCode;
}
