package madvirus.spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService {

    private ArticleDao articleDao;

    public WriteArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Override
    public void write(Article article) {
        System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
        articleDao.insert(article);
    }

}
