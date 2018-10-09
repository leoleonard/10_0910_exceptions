package two;

public class Product {
    private String name;
    private String cena;
    private String producent;

    public Product(String name, String cena, String producent) {
        this.name = name;
        this.cena = cena;
        this.producent = producent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }
}


// klasa product: nazwa, cena producent