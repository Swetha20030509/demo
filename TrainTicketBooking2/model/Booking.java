package TrainTicketBooking2.model;

public class Booking {
    int id;
    double amount;
    Train train;
    String status;
    int pnr;
    String fromstation;
    String tostation;
    double arrivalTime;
    double depatureTime;



    public Booking(Train train, String fromstation, String tostation, double arrivalTime, double depatureTime, int i) {
        this.train=train;
        this.fromstation=fromstation;
        this.tostation=tostation;
        this.arrivalTime=arrivalTime;
        this.depatureTime=depatureTime;
        this.pnr=i;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public double getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(double depatureTime) {
        this.depatureTime = depatureTime;
    }

    public double getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        ArrivalTime = arrivalTime;
    }


    double ArrivalTime;
}
