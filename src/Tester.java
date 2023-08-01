import java.util.Arrays;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        Scanner getHouseInfo = new Scanner(System.in);
        House house = new House();
        System.out.print("Enter the number of floors: ");
        int floorsNumber = getHouseInfo.nextInt();
        house.setFloorsNumber(floorsNumber);
        getHouseInfo.nextLine();

        System.out.print("Enter the address: ");
        String address = getHouseInfo.nextLine();
        house.setAddress(address);

        System.out.print("Enter resident names separated by comma (es alex,giorgio): ");
        String namesInput = getHouseInfo.nextLine();
        String[] namesList = namesInput.split(",");
        house.setResidentsNames(namesList);
        getHouseInfo.close();
        String printFormat = String.format
                ("House Details:%nFloors:%d %nAddress: %s%nResidents: %s",
                        house.getFloorsNumber(), house.getAddress(), Arrays.toString(house.getResidentsNames()));

        System.out.println(printFormat);
    }
}
