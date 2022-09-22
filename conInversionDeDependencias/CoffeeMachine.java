
public class CoffeeMachine {

    public void makeCoffee(Capsule capsule) {
        capsule.make();
    }
}

public interface Capsule {
    public void make();
}

public class Expresso implements Capsule {
    public String make() {
        return "Café";
    }
}

public class Capuccinno implements Capsule {
    public String make() {
        return "Leche cremada, Café y Cacao"
    }
}


public class Latte implements Capsule {
    public String make() {
        return "Leche y Café";
    }
}