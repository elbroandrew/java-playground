package Pattern.Behavioral.Observer.Example01;

public class ObserverDemo {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel newsChannel = new NewsChannel();
        MobileApp mobileApp = new MobileApp();

        newsAgency.registerObserver(newsChannel);
        newsAgency.registerObserver(mobileApp);

        newsAgency.publishNews("Hello");


    }

}
