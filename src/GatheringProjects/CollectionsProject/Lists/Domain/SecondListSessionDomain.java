package GatheringProjects.CollectionsProject.Lists.Domain;

public class SecondListSessionDomain implements Comparable<SecondListSessionDomain> {
    private String Name;
    private int age;
    private String Color;

    public SecondListSessionDomain(String catName, int catAge, String CatColor) {
        this.Name = catName;
        this.age = catAge;
        this.Color = CatColor;
    }

    @Override
    public String toString() {
        return "\n List Cats: {" +
                "Name = '" + Name + '\'' +
                ", age = " + age +
                ", Color = '" + Color + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override // Cria uma ordem de entrada da lista e, nesse caso, ordem alfabética
    public int compareTo(SecondListSessionDomain cats) {
        return this.getName().compareToIgnoreCase(cats.getName());
    }
}

