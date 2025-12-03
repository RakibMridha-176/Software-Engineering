interface Button { void paint(); }
interface TextBox { void render(); }

class WinButton implements Button {
    public void paint() { System.out.println("Windows Button"); }
}
class MacButton implements Button {
    public void paint() { System.out.println("Mac Button"); }
}

interface UIFactory {
    Button createButton();
    TextBox createTextBox();
}

class WinFactory implements UIFactory {
    public Button createButton() { return new WinButton(); }
    public TextBox createTextBox() { return () -> System.out.println("Windows TextBox"); }
}

class MacFactory implements UIFactory {
    public Button createButton() { return new MacButton(); }
    public TextBox createTextBox() { return () -> System.out.println("Mac TextBox"); }
}

public class Demo {
    public static void main(String[] args) {
        UIFactory factory = new MacFactory();
        Button btn = factory.createButton();
        btn.paint();
    }
}
