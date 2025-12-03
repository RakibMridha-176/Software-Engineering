class Database {
    private static Database instance;

    private Database() {}

    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }
}

public class Test {
    public static void main(String[] args) {
        Database db = Database.getInstance();
    }
}
