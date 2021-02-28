package lesson23_2;

import java.util.Arrays;

public class CinemaService {
    private String[][] area = new String[10][10];

    public CinemaService() {
        for (String[] strings : area) {
            Arrays.fill(strings, Areaplace.FREE.getStr());
        }
    }

    public void print () {
        for (int i = 0; i < area.length; i++) {
            System.out.println(Arrays.toString(area[i]));
        }

//        for (int i = 0; i < area.length; i++) {
//            for (int j = 0; j < area.length; j++) {
//                System.out.print(area[i][j]);
//            }
//            System.out.println();
//        }
    }

    public void takePlace (int row, int place) {
        try {
            if (area[row][place].equals(Areaplace.OCCUPIED.getStr())) {
                throw new TickedAlreadyReservedException("Место занято");
            }
            if (row < 0 || place < 0) {
                throw new NoExistReserveException("неверно введен ряд или место");
            }
            area[row][place] = Areaplace.OCCUPIED.getStr();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void freePlace (int row, int place) throws NoExistReserveException{
        if (row < 0 || place < 0) {
            throw new NoExistReserveException("неверно введен ряд или место");
        }
        if (!area[row][place].equals(Areaplace.OCCUPIED.getStr())) {
            throw new NoExistReserveException("Место не занято");
        }
        else {
            area[row][place] = Areaplace.FREE.getStr();
        }
    }
}
