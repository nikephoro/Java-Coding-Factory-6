
package gr.aueb.cf.ch14;

public class QueueManager {

    private static QueueManager QMAN = null;
    private Integer[] intArr;
    private  int i;

    private QueueManager() {
        this.intArr = new Integer[10];
        this.i = 0;

    }

    public static QueueManager getInstance() {
        if (QMAN == null) {
            QMAN = new QueueManager();
        }
        return QMAN;
    }

    public void enqueue(int n) {
        if(isFull(this.intArr)) {
            System.out.println("Ο FIFO πίνακας είναι γεμάτος, θα πρέπει πρώτα να βγάλετε ένα ή περισσότερα στοιχεία");
            return;
        }
        intArr[intArr.length - 1 - i] = n;
        i++;

    }

    public void dequeue() {
        if(isEmpty(this.intArr)) {
            System.out.println("Ο FIFO πίνακας είναι άδειος, θα πρέπει πρώτα να προσθέσετε τουλάχιστον ένα στοιχείο");
            return;
        }
        intArr[intArr.length - 1 -i] = null;
        i--;

    }


    private static boolean isEmpty(Integer[] intArr) {
        int count = 0;

        for ( int i = 0; i < intArr.length; i++) {
            if (intArr[i] == null) {
                count++;
            }
            if (count == 10) return true;
        }

        return false;
    }

    private static boolean isFull(Integer[] intArr) {
        int count = 0;

        for ( int i = 0; i < intArr.length; i++) {
            if (intArr[i] != null) {
                count++;
            }
            if (count == 10) return true;
        }
        return false;
    }



    public void contents() {
        for(int i = 0; i < intArr.length ; i++) {
            if ((intArr)[i] != null) {
                System.out.printf("%s\n", intArr[i]);
            }
        }

        System.out.println("Η  FIFO στοίβα έχει " + i + " στοιχεία");


    }


}
