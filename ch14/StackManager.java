package gr.aueb.cf.ch14;

import java.util.ArrayList;
import java.util.Stack;

public class StackManager {

    private static StackManager STACKMAN = null;
    private  String[] strArr ;
    private  int i;

    private StackManager() {
        this.strArr = new String[10];
        this.i = 0;

    }

    public static StackManager getInstance() {
        if (STACKMAN == null) {
            STACKMAN = new StackManager();
        }
        return STACKMAN ;
    }

    public void push(String str) {
        if(isFull(strArr)) {
            System.out.println("Ο LIFO πίνακας είναι γεμάτος, θα πρέπει πρώτα να βγάλετε ένα ή περισσότερα στοιχεία");
            return;
        }
        strArr[i] = str;
        i++;

    }

    public void pull() {
        if(isEmpty(strArr)) {
            System.out.println("Ο LIFO πίνακας είναι άδειος, θα πρέπει πρώτα να προσθέσετε τουλάχιστον ένα στοιχείο");
            return;
        }
        strArr[i-1] = null;
        i--;

    }


    private static boolean isEmpty(String[] stringArray) {

        for (int i = 0; i < stringArray.length ; i++) {
            if (stringArray[i] != null)  { return false;}
        }
        return true;
    }

    private static boolean isFull(String[] stringArray) {

       if (stringArray[9] != null) {return true;}
       return false;

        }



    public void contents() {
        for( int i = 0; i < strArr.length ; i++) {
            if ((strArr)[i] != null) {
                System.out.printf("%s\n", strArr[i]);
            }
        }

         System.out.println("Η LIFO στοίβα έχει " + i + " στοιχεία");


  }


}
