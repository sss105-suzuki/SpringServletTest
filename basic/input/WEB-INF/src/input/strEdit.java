package input;

public class strEdit {
	private String template;
	strEdit (String tmp) {
		template = tmp;
	}
	public String makePrintStr(String msg) {
		String newmsg = template + msg;
		return newmsg;
	}

}
