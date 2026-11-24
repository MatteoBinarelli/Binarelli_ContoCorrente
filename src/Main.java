public class Main {
    public static void main(String[] args) {
        ContoCorrente primoConto = new ContoCorrente(101, 50);
        ContoCorrente secondoConto = new ContoCorrente(102, 60);

        Correntista[] correntisti = {
                new Correntista("Anna", primoConto),
                new Correntista("Luca", primoConto),
                new Correntista("Sara", secondoConto),
                new Correntista("Andrea", secondoConto),
        };
    }
}