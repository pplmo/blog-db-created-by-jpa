package team.star.blog.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private String name;
    private String password;
    @Column(unique = true, nullable = false)
    private String mail;
    /**
     * user homepage
     */
    @URL
    private String url;
    /**
     * user screen name, i.e. nickname
     */
    private String screenName;
    /**
     * user account created time
     */
    @PastOrPresent
    @CreatedDate
    private Instant created;
    /**
     * last active time
     */
    @PastOrPresent
    private Instant activated;
    /**
     * last login time
     */
    @Past
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
