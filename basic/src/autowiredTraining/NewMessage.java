package autowiredTraining;

import org.springframework.stereotype.Component;

@Component
public class NewMessage implements HogeHoge{
	public String getter () {
		return "õmessageõ = ";
	}
}
