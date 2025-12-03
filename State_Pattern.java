interface State {
    void insertCoin();
    void dispense();
}

class NoCoin implements State {
    public void insertCoin() { System.out.println("Coin inserted"); }
    public void dispense() { System.out.println("Insert coin first"); }
}

class HasCoin implements State {
    public void insertCoin() { System.out.println("Already inserted"); }
    public void dispense() { System.out.println("Product dispensed"); }
}

class VendingMachine {
    State noCoin = new NoCoin();
    State hasCoin = new HasCoin();
    State state = noCoin;

    void insertCoin() { 
        state.insertCoin(); 
        state = hasCoin;
    }
    void dispense() { 
        state.dispense(); 
        state = noCoin;
    }
}
