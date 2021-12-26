public class Guys extends Intelligent{
    public Guys(String nm) { Name = nm;}

    public void Collected(String obj){ System.out.print(" собрали " + obj); }
    public void Buy(String obj){ System.out.print(" купили " + obj); }
    public void Put(String obj) { System.out.print(" сложили "  + obj); }
    public void GoTo(String obj) {System.out.print(" и отправились " + obj); }
    public void SayGoodbye(String obj) { System.out.print(" Попрощался " + obj); }
    public void Climbed(String obj) { System.out.print(" залез " + obj); }
    public void Find(String obj) { System.out.print(" отыскал " + obj); }
    public void Sit(String obj) { System.out.print(" Уселся поудобнее " + obj); }
    public void LookAround(String obj) { System.out.print(" принялся разглядывать " + obj); }
    public void Listen(String obj) { System.out.print(" прислушиваться к " + obj); }

    public void ButTicket() { System.out.print(" купили Пончику " + Objects.TICKET.GetValue() + " до " + Objects.CITY.GetValue()); }
}
