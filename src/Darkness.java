public class Darkness extends Essence implements sink {

    public Darkness(String name) {
        super(name);
    }

    @Override
    public void sinking(String what) {
        System.out.println(what + " потонуло в " + this.name);
    }
    @Override
    public void sinking(String what, Description description) {
        System.out.println(what + " потонуло в " + description + " " + this.name);
    }
    @Override
    public void sinking(String what, Description[] descriptions) {
        System.out.print(what + " потонуло в ");
        for(Description des: descriptions){
            System.out.print(des + " ");
        }
        System.out.println(this.name);
    }
}
