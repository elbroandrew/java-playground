package Pattern.Behavioral.Observer.PULL;

public class NewsChannel implements Observer{
    private String name;
    private String lastReceivedNews;

    public NewsChannel(String name){
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        NewsAgency newsAgency = (NewsAgency) subject;
        this.lastReceivedNews = newsAgency.getNews();  //вытягиваю только нужные данные
        display();

    }

    public void display(){
        System.out.println("[" + name + "] Новость: "+lastReceivedNews);
    }
}
