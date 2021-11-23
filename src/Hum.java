public class Hum extends Essence implements rangOut{

    public Hum(String name, Description description) {
        super(name);
    }


    @Override
    public void rang(Description description) {
        System.out.println(" раздался " + description + " " + getName());
    }

    @Override
    public void rang(Description description, String S) {
        System.out.println(" раздался " + description + " " + getName());
    }
}
