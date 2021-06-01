package LeetCode;

public class ParkingSystem {

    int[] cars;

    public ParkingSystem(int big, int medium, int small) {
        cars = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (cars[carType] > 0) {
            cars[carType]--;
            return true;
        }
        return false;
    }
}
