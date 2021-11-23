public class Pan extends Essence implements fallDown{

    public Pan(String name) {
        super(name);
    }
    @Override
    public void fall(String place) {
        System.out.println(" попадали " + place + " " + getName());
    }
}
