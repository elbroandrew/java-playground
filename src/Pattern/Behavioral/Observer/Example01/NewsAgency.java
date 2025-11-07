package Pattern.Behavioral.Observer.Example01;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    private ArrayList<Observer> observers;
    private String latestNews;

    public NewsAgency(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(latestNews);
        }
    }

    public void publishNews(String news){
        this.latestNews = news;
        notifyObservers();
    }
}
