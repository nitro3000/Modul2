package Task1.GenericsZoo.Entities;

public abstract class Animal {
    private String name;
    private boolean isCarnivora;

    public Animal(String name, boolean isCarnivora) {
        this.name = name;
        this.isCarnivora = isCarnivora;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isCarnivora() {
        return isCarnivora;
    }
    public void setCarnivora(boolean carnivora) {
        isCarnivora = carnivora;
    }

}
