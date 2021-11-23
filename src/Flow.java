public class Flow extends Essence implements rollUp, knock{
    private Description description;
    public Flow(String name) {
        super(name);
    }
    public Flow(String name, Description description) {
        super(name);
        this.description = description;
    }
    @Override
    public void rollingUp(Description description, String who) {
        System.out.println(description + " " + getName() + " подкатывает к " + who);
    }
    public class StringIsEmptyExeption extends Exception{
        public StringIsEmptyExeption(String message){
            super(message);
        }
    }
    @Override
    public void rollingUp(Description[] descriptions, String who) {
        for(Description des : descriptions) {
            System.out.print(des + " ");
        }
    }
    @Override
    public void knockable(String what) throws StringIsEmptyExeption {
        if(what.isEmpty() || what == " "){
            throw new StringIsEmptyExeption("Строка пустая!");
        }
        else {
            System.out.println(this.name + " сучиться " + description + " " + what);
        }
    }
}
