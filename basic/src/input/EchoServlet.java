package input;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EchoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
//		strEdit maker = new strEdit("message=");
		
		String msg = request.getParameter("message");
		//�C���X�^���X��������
		DefaultListableBeanFactory factory2 = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory2);
		//beans.xml�ǂݍ���(�N���X�p�X���ォ��͓ǂݍ��߂Ȃ��H)
		reader.loadBeanDefinitions((Resource)new ClassPathResource("beans.xml"));
		//�C���X�^���X����
		strEdit maker = factory2.getBean("springtest", strEdit.class);
		
		response.setContentType("text/plain; charset=Windows-31J");
		PrintWriter out = response.getWriter();
		out.println(maker.makePrintStr(msg));
	}

}
