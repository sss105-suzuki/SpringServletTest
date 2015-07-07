package input;

public class strEdit {
	private String template = "‰Šú‰»¸”s";
//	strEdit (String tmp) {
//		template = tmp;
//	}
	public void setTemplate (String newOne) {
		template = newOne;
	}
	public String makePrintStr(String msg) {
//		String template = "message = ";
		String newmsg = template + msg;
		return newmsg;
	}
}
