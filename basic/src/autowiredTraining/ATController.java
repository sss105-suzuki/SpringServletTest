package autowiredTraining;

import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class ATController {

	@Autowired
	private DIService controlledDIS;
	
	private static final Log logger = LogFactory.getLog(ATController.class);
	
	@RequestMapping(value = "/src", method = RequestMethod.GET)
	public String get (Locale locale, Model model) {
		logger.debug("API start");
		
		model.addAttribute("getter", controlledDIS.getter() );
		return "test";
	}
}
