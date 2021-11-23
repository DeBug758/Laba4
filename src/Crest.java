public class Crest extends Essence implements hiss{
    public Crest(String name) {
        super(name);
    }

    @Override
    public void shipp() {
        System.out.println(this.name + " шипит!");
    }
    public void pretty(){
        System.out.println("красуется" + this.name);
    }
    public void pretty(Description description){
        System.out.println("красуется" + description + this.name);
    }
    public void pretty(Description description[]){
        System.out.print("красуется ");
        for(Description des : description){
            System.out.print(des + " ");
        }
        System.out.println(this.name);
    }
}
