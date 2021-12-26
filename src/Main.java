public class Main {
    public static void main(String[] args){
        Ponchik ponchik = new Ponchik("Пончик");
        Guys guys = new Guys("Пискарик, Лещик, Сомик и Судачок");
        guys.PrintName();
        guys.Collected(Objects.MONEY.GetValue());
        guys.Buy(Objects.PRODUCTS.GetValue());
        guys.Put(Objects.BAG.GetValue());
        guys.ButTicket();
        guys.GoTo(Objects.TRAINSTATION.GetValue());
        Objects.TRAIN.Come(Objects.TRAIN);
        ponchik.PrintName();
        ponchik.SayGoodbye(Objects.FRIENDS.GetValue());
        ponchik.Climbed(Objects.WAGON.GetValue());
        ponchik.Find(Objects.PLACE.GetValue());
        ponchik.Sit(Objects.BENCH.GetValue());
        ponchik.LookAround(Objects.PASSENGERS.GetValue());
        ponchik.Listen(Objects.TALKS.GetValue());
    }
}
