public class House extends Essence implements sway{
    private Description description;
    public House(String name, Description description) {
        super(name);
        this.description = description;
    }

    @Override
    public void swaying() {
        System.out.print(name + " закачался ");
        if(description == Description.STRONG){
            System.out.println(", но устоял потому что " + Description.STRONG + " " + name);
        }
    }

    public class Porch{
        private String name;
        public Porch(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void press(String name){
            System.out.print("облокотился на " + name);
        }
    }

    public class LivingRoom{
        private String name;
        public LivingRoom(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void flood(final String things){
            System.out.print(name + " заливает водой ");
            class Furniture{
                private String furnit;
                public Furniture(){
                    this.furnit = things;
                }
                public void swim(){
                    System.out.println(furnit + " поплыло!");
                }
            }
            Furniture furniture = new Furniture();
            furniture.swim();
        }
    }
}
