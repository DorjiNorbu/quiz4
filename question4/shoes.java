package quiz4.question4;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public enum shoes {
    NIKE(30), ADIDAS(32), PUMA(37);
    int size;
    String type;

    shoes(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

enum nationality {
    AMERICAN, BHUTANESE, INDIAN;
}
