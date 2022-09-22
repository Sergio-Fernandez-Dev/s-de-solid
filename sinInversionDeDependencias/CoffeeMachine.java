
public class CoffeeMachine {

    public void makeCapuccinno() {
        Capuccinno capuccinno = new Capuccinno();
        capuccinno.make();
    }

    public void makeLatte() {
        Latte latte = new Latte();
        latte.make();
    }

    public void makeExpresso() {
        Expresso expresso = new Expresso();
        expresso.make();
    }
}

public class Expresso  {
    public String make() {
        return "Café";
    }
}

public class Capuccinno {
    public String make() {
        return "Leche cremada, Café y Cacao"
    }
}


public class Latte {
    public String make() {
        return "Leche y Café";
    }
}



