package madvirus.spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("chap01.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		WriteArticleService articleService = (WriteArticleService) beanFactory
				.getBean("writeArticleService");
		articleService.write(new Article());
	}
}
