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
@Table(name = "t_option")
@Entity
public class Option {
    @Id
    private int id;
    private String name;
    private int userId;
    private String value;
}
