package _12_12_2024;

public class Room extends Object {
    int id;
    int width;

    public static void main(String[] args) {
        System.out.println(new Room());
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", width=" + width +
                '}';
    }
}