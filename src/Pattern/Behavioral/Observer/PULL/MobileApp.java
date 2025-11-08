package Pattern.Behavioral.Observer.PULL;

public class MobileApp implements Observer{
    private String name;

    public MobileApp(String appName){
        this.name = appName;
    }

    @Override
    public void update(Subject subject) {
        NewsAgency agency = (NewsAgency) subject;

        //вытяивает только нужные данные
        int priority = agency.getPriority();
        String news = agency.getNews();

        //например, фильтруем новости
        if(priority >= 3){
            System.out.println("[!] " + name + " Срочно: " + news);

        } else if (priority >= 2) {
            System.out.println("[*] " + name + " Важно: " + news);
        }
    }
}
