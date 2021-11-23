public class Smurf extends Essence implements wakeUp, stay, gotOver {
    private int cnt = 0;
    public Smurf(String name) {
        super(name);
    }
    public class IndexOutOfRange extends RuntimeException{
        public IndexOutOfRange(String message){
            super(message);
        }
    }
    public void setSound(int snd) throws IndexOutOfRange{
        if(snd < 0){
            cnt = 0;
        }
        else if(snd > Noise.values().length){
            cnt = Noise.values().length;
        }
        else if(snd == -1){
            if (cnt >= 4){
                throw new IndexOutOfRange("Нет такого индекса!");
            }
            else {
                System.out.println(" Становится всё сильнее! ");
                cnt++;
            }
        }
        else{
            cnt = snd;
        }
    }
    public void drag(String thing) {
        System.out.println(name + " тащу " + thing);
    }
    public void drag(String thing, Description how) {
        System.out.println(how + " " + name + " тащу " + thing);
    }
    public void drag(String thing, Description how, String place) {
        System.out.println(how + " " + name + " тащу " + thing + " " + place);
    }
    public void agree(){
        System.out.println(name + " кивает ");
    }
    public void agree(boolean yes){
        if(yes) {
            System.out.println(name + " согласно кивает ");
        }
        else{
            System.out.println(name + " несогласно кивает ");
        }
    }
    public void listen(boolean know){
        if(know){
            System.out.print(" Слышу " + (Noise.values())[cnt]);
        }
        else {
            System.out.print(" Слышу ");
        }
    }

    public void listen(boolean know, String how){
        if(know){
            System.out.print(how + " Слышу " + (Noise.values())[cnt] + " ");
        }
        else {
            System.out.print(how + " Слышу ");
        }
    }

    public void see(String S){
        System.out.println(" Вижу " + S);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Smurf){
            return this.name.equals(((Smurf) obj).name);
        }
        else {
            return false;
        }
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public void woke() {
        System.out.println(" проснулся " + getName());
    }

    @Override
    public void woke(String how) {
        System.out.println(how + " проснулся " + getName());
    }

    @Override
    public void staying() {
        System.out.println(this.getName() + " стою ");
    }

    @Override
    public void staying(String place) {
        System.out.println(this.getName() + " стою " + place);
    }

    @Override
    public void staying(String place, String wall) {
        System.out.println(this.getName() + " стою " + place + " облокотившись на " + wall);
    }

    @Override
    public void gettingOver(String where) {
        System.out.println(this.name + " перебираюсь " + where);
    }
    @Override
    public void gettingOver(String where, boolean sit) {
        if(sit){
            System.out.println(this.name + " перебираюсь " + where + " и уселась там");
        }
        else {
            System.out.println(this.name + " перебираюсь " + where);
        }
    }

    @Override
    public void wait(String g) {
        System.out.println("выжидая" + g);
    }
}
