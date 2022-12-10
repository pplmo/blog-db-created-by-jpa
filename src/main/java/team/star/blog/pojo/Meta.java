package team.star.blog.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * @author mystic
 * @date 2019-12-15 19:45
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "t_meta")
@Entity
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
    private String type;
    private String description;
    private int count;
    private int orderNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Meta meta = (Meta) o;
        return id != null && Objects.equals(id, meta.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
