import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Value;

@Data
@Component
public class Greeting {
	@Value("${greeting.message")
	private String message;
}
