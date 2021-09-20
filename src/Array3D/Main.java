package Array3D;

import java.util.Scanner;

class RoomInfo{
    public int buildings, floors, room;
    public int total_Human, total_avail;

    public int getTotal(int [][][] rm, int t){
        int count =0;
        for (int i = 0; i < buildings; i++) {
            for (int j = 0; j < floors; j++) {
                for (int k = 0; k < room; k++) {
                    switch (t) {
                        case 0: if(rm[i][j][k] == 0) count++; break;
                        case 1: if(rm[i][j][k] != 0) count = count+rm[i][j][k]; break;
                    }
                }
            }
        }
        return count;
    }

    public int[][][] inData(){
        int [][][] rm;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total Buildings: ");
        buildings = scan.nextInt();
        System.out.println("Enter total floors: ");
        floors = scan.nextInt();
        System.out.println("Enter total room: ");
        room = scan.nextInt();

        rm = new int[buildings][floors][room];
        for (int i = 0; i < buildings; i++) {
            for (int j = 0; j < floors; j++) {
                for (int k = 0; k < room; k++) {
                    System.out.println("Enter total people in building " + (i+1) +
                            " floor " + (j+1) + " room " + (k+1) + " : ");
                    int g = scan.nextInt();
                    rm[i][j][k] = new Integer(g);
                }
            }
        }
        return rm;

    }

    public void checkData(int [][][] rm){
        total_Human = getTotal(rm, 1);
        total_avail = getTotal(rm, 0);
    }

    public void showData(){
        System.out.printf("Total people = %d people\n", total_Human);
        System.out.printf("Total available room = %d room\n", total_avail);
    }
}


public class Main {
    public static void main(String[] args) {
        int [][][] rooms;

        RoomInfo roomData = new RoomInfo();
        rooms = roomData.inData();
        roomData.checkData(rooms);
        roomData.showData();
    }
}
