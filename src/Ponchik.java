public class Ponchik extends Intelligent{
    public Ponchik(String nm) { Name = nm;}

    public void Collected(String obj) { System.out.print("собрали" + obj); }
    public void Buy(String obj){ System.out.print("купили" + obj); }
    public void Put(String obj) { System.out.print("сложили" + obj); }
    public void GoTo(String obj) {System.out.print("отправились" + obj); }
    public void SayGoodbye(String obj) { System.out.print(" попрощался " + obj); }
    public void Climbed(String obj) { System.out.print(" залез" + obj); }
    public void Find(String obj) { System.out.print(" Отыскал " + obj); }
    public void Sit(String obj) { System.out.print("yселся поудобнее " + obj); }
    public void LookAround(String obj) { System.out.print(", принялся разглядывать " + obj); }
    public void Listen(String obj) { System.out.print(" и прислушиваться к " + obj); }
}
