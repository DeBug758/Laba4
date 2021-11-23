public class Creature extends Essence implements startUp, rumble{

    public Creature(String name) {
        super(name);
    }

    public void up() {
        System.out.println(this.name + " вздымается наверх!");
    }
    public void up(boolean upper) {
        if(upper){
            System.out.println(this.name + " вздымается всё выше и выше");
        }
        else {
            System.out.println(this.name + " опускается всё ниже и ниже");
        }
    }
    public void jumpUp(){
        System.out.println(this.name + " взметнулось");
    }
    public void jumpUp(String where){
        System.out.println(this.name + " взметнулось" + where);
    }
    public void jumpUp(String where, Description description){
        System.out.println(this.name + " " + description + " взметнулось " + where);
    }

    @Override
    public void rumblable(String where) {
        System.out.println(this.name + " грохотало и трещало " + where);
    }
}
