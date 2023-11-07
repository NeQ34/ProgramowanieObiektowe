package zadanie1;

public class Main {
    Worker[] workers = new Worker[2];
    BlueCollarWorker p1 = new BlueCollarWorker("jan","kowalski","8463758",1995,2007,Plec.M,"Mic","AAAA",20,40);
    BlueCollarWorker p2 = new BlueCollarWorker("jan","kowalski","8463758",1995,2007,Plec.M,"Mic","AAAA",20,40);

    PaymentService service = new PaymentService(new Worker[] {p1});
}
