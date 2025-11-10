package Pattern.Behavioral.Observer.HYBRID;


public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
