package team.star.blog.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mystic
 * @date 2019-12-15 19:45
 */
@Data
@Table(name = "t_meta")
@Entity
public class Meta {
    @Id
    private int id;
    private String name;
    private String slug;
    private String type;
    private String description;
    private int count;
    private int orderNum;
}
