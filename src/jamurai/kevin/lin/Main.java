package jamurai.kevin.lin;

import java.io.IOException;

public class Main {
    public static void main(String[] argv) throws IOException {
        GameInfo curInfo = new GameInfo();
        GameInfo preInfo;
        Player p = new RandomPlayer();

        curInfo.readTurnInfo();
        preInfo = new GameInfo(curInfo, true);

        while (true) {
            System.out.println("# Turn " + curInfo.turn);
            if (curInfo.curePeriod != 0) {
                System.out.println("0");
            } else {
                p.play(curInfo, preInfo);
                System.out.println("0");
            }
            preInfo = new GameInfo(curInfo, true);
            curInfo.readTurnInfo();
        }
    }
}
