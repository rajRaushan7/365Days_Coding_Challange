class ParkingRecord {
    String vehicleNumber;
    int entryTime;
    int exitTime;

    public ParkingRecord(String vehicleNumber, int entryTime, int exitTime) {
        this.vehicleNumber = vehicleNumber;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public int getDuration() {
        return exitTime - entryTime;
    }

    public int calculateFee() {
        int duration = getDuration();
        if (duration <= 2) return 20;
        return 20 + (duration - 2) * 10;
    }
}

public class ParkingLotFeeCalculator {
    public static void main(String[] args) {
        ParkingRecord[] records = {
            new ParkingRecord("KA01AB1234", 10, 13),
            new ParkingRecord("DL05CD5678", 9, 11),
            new ParkingRecord("MH12EF4321", 14, 20)
        };

        int totalRevenue = 0;
        for (ParkingRecord record : records) {
            int duration = record.getDuration();
            int fee = record.calculateFee();
            System.out.println(record.vehicleNumber + " parked for " + duration + " hours. Fee: ₹" + fee);
            totalRevenue += fee;
        }

        System.out.println("\nTotal revenue collected: ₹" + totalRevenue);
    }
}