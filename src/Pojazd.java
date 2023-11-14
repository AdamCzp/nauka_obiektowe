public class Pojazd {
    public Pojazd() {}

    //metoda wypisujaca tekst
    public void Pojazd(){ //
        System.out.printf("Pojazd jedzie");
    }
}

class Samochod extends Pojazd{
    // przesłonieta metoda
    @Override
    public void Pojazd(){
        super.Pojazd();
        System.out.printf("Dodatkowe Informacje");
    }
}
