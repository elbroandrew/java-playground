package patterns.observer;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        EventSender eventSender = new EventSender();
        EventObserver1 observer1 = new EventObserver1();
        EventObserver2 observer2 = new EventObserver2();
        eventSender.addObserver(observer1);
        eventSender.addObserver(observer2);
        eventSender.sendEvent();
    }

    interface Observer{
        public void onEvent();
    }

    static class EventObserver1 implements Observer{

        @Override
        public void onEvent() {
            System.out.println("EventObserver1 - received event.");
        }
    }

    static class EventObserver2 implements Observer{

        @Override
        public void onEvent() {
            System.out.println("EventObserver2 - received event.");
        }
    }

    static class EventSender{
        private final List<Observer> observers = new ArrayList<>();

        void addObserver(Observer observer){
            observers.add(observer);
        }

        void removeObserver(Observer observer){
            observers.remove(observer);
        }

        void sendEvent(){
            observers.forEach( observer -> observer.onEvent());
        }
    }

}

