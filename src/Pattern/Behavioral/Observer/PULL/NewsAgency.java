package Pattern.Behavioral.Observer.PULL;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    List<Observer> observers;
    private String latestNews;
    private int priority;
    private String category;

    public NewsAgency(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this); // передат себя
        }
    }

    @Override
    public String getNews() {
        return latestNews;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void publishNews(String message, int priority, String category){
        this.latestNews = message;
        this.priority = priority;
        this.category = category;
        notifyObservers();
    }
}
