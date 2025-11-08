package Pattern.Behavioral.Observer.PULL;


public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    //методы для PULL
    String getNews();
    int getPriority();
    String getCategory();
}
