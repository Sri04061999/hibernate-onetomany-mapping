package mapping.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Bank {
	@Id
	private String bankName;
	private int bankNumber;
}
