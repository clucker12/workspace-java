package lombok_test_;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestDTO2 {
	private String name,addr,tel;
}
