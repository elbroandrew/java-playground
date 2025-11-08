package Pattern.Behavioral.Observer.PULL;

public class PullObserverDemo {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Observer chan1 = new NewsChannel("Первый канал");
        Observer chan2 = new NewsChannel("Новости 24");
        Observer mobileApp = new MobileApp("App News");

        //регистрация всех наблюдателей
        newsAgency.registerObserver(chan1);
        newsAgency.registerObserver(chan2);
        newsAgency.registerObserver(mobileApp);

        System.out.println("=== Публикация разных новостей ===");
        newsAgency.publishNews("Открытие нового парка в центре города", 3, "general");
        newsAgency.publishNews("Землетрясение", 1, "emergency");
        newsAgency.publishNews("Наша сборная выиграла чемпионат", 4, "general");

    }
}
