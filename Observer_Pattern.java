interface Observer {
    void update(float price);
}

class User implements Observer {
    public void update(float price) {
        System.out.println("Updated Price: " + price);
    }
}

interface Subject {
    void add(Observer o);
    void remove(Observer o);
    void notifyObservers();
}

class Stock implements Subject {
    ArrayList<Observer> list = new ArrayList<>();
    float price;

    public void setPrice(float p) {
        price = p; notifyObservers();
    }
    public void add(Observer o) { list.add(o); }
    public void remove(Observer o) { list.remove(o); }
    public void notifyObservers() {
        for (Observer o : list) o.update(price);
    }
}
