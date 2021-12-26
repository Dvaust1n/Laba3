public enum Objects implements ObjectActions{
    MONEY("деньги,"),
    PRODUCTS("продукты,"),
    BAG("сумку,"),
    TICKET("билет"),
    CITY("города Фантомаса"),
    TRAINSTATION("на вокзал."),
    TRAIN(" Поезд"),
    WAGON(" в вагон."),
    PLACE("место, "),
    BENCH("на лавке "),
    PASSENGERS("пасажиров"),
    FRIENDS("с друзьями,"),
    TALKS("разговорам.");

    private String val;
    Objects(String val_In){ val = val_In; }
    public String GetValue(){ return val;}

    public void Come(Objects obj) {
        if (obj == Objects.TRAIN){
            System.out.println(TRAIN.GetValue() + " подошел. ");
        }
        else return;
    }
}
