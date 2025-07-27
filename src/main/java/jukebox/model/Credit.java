package jukebox.model;

public class  Credit {

    private static int credit = 0;

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public static void addCredit() {
        credit += 1;
        //System.out.println("Creditos: " + credit);
    }

    public static void useCredit() {
        credit -= 1;
    }
}
