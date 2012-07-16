package madvirus.spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForAop {

	public static void main(String[] args) {
		String[] configLocations = new String[] { "chap01.xml",
				"chap01CommonConcern.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocations);
		WriteArticleService articleService = (WriteArticleService) context
				.getBean("writeArticleService");
		articleService.write(new Article());
	}
}
