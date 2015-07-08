package autowiredTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DIServiceImp implements DIService {

	@Autowired
	private HogeHoge hogehoge;
	
	public String getter() {
		String newString = "†message†" + hogehoge.getter();
		// TODO 自動生成されたメソッド・スタブ
		return newString;
	}

}
