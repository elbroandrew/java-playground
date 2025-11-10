package Pattern.Behavioral.Observer.HYBRID;

public class DemoClass {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer chan1 = new NewsChannel("channel 1");
        Observer chan2 = new NewsChannel("channel 2");

        newsAgency.registerObserver(chan1);
        newsAgency.registerObserver(chan2);

        //push news
        newsAgency.publishNews("Hello");

        //pull news
        System.out.println("Latest news: " + newsAgency.getNews());
    }
}
