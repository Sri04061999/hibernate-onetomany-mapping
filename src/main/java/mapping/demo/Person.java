package mapping.demo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import lombok.Data;
@Data
@Entity
public class Person {
	@Id
	private String personName;
	private int age;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Bank> bank;
}

