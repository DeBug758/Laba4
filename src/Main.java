public class Main {
    public static void main(String[] args) throws Flow.StringIsEmptyExeption {
        House house = new House("Дом", Description.STRONG);
        House.Porch porch = house.new Porch("Веранда");
        House.LivingRoom livingRoom = house.new LivingRoom("Гостиная");
        Creature creature = new Creature("Что-то");
        Crest crest = new Crest("Гребень");
        Smurf they = new Smurf("Они");
        Smurf all = new Smurf("Все");
        Smurf smurf = new Smurf("Муми-тролль");
        Smurf mum = new Smurf("Мюмла");
        Smurf mmdl = new Smurf("Муми-дол");
        Smurf family = new Smurf("вся семья");
        Pan pans = new Pan("Кастрюли");
        Hum hum = new Hum("Гул", Description.NOT_LOUD);
        Flow flow = new Flow("Поток");
        Flow waves = new Flow("Волны", Description.STRONG);
        Darkness darkness = new Darkness("тьма");
        nightCondition dark = new nightCondition(){
            @Override
            public void anxiety(Description description){
                System.out.println("Ночь была " + description);
            }
        };

        System.out.print(Description.SUDDENLY);
        hum.rang(Description.NOT_LOUD, "под ногами");
        System.out.print(they.getName());
        they.listen(false);
        pans.fall("в кухне");
        mum.woke("Теперь");
        all.staying(porch.getName());
        porch.press("перила");
        all.see("темноту");
        smurf.agree(true);
        smurf.setSound(1);
        smurf.listen(true);
        smurf.see(" звук со стороны моря");
        smurf.setSound(2);
        smurf.listen(true, "сначала");
        smurf.setSound(-1);
        smurf.listen(true, "наконец");
        smurf.see(" белую ночь");
        creature.jumpUp("над верхушками деревьев", Description.LARGE);
        creature.up(true);
        crest.pretty(new Description[]{Description.WHITE, Description.HISSING});
        they.drag("хвосты", Description.BARELY, "за порог");
        flow.rollingUp(new Description[]{Description.WATER, Description.HISSING}, mmdl.getName());
        darkness.sinking(mmdl.getName(), new Description[]{Description.SOLID, Description.PITCH_BACK});
        livingRoom.flood("мебель");
        family.gettingOver("самый верхний этаж");
        family.wait("пока не стихнет буря");
        dark.anxiety(Description.ANXIOUS);
        creature.rumblable("за стенами");
        waves.knockable("в окно");
    }
}
