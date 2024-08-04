package gr.aueb.cf.ch14;
import gr.aueb.cf.ch14.MathHelper;
import   gr.aueb.cf.ch14.StringUtils;
import gr.aueb.cf.ch14.ValidationUtils;
import gr.aueb.cf.ch14.StackManager;


public class Main {
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 2};
        String s = "Dexter";
        String v = "teneT";
        double ave = MathHelper.findAverage(arry);
        System.out.println(ave);
        System.out.println(MathHelper.findMax(arry));
        System.out.println(MathHelper.findMin(arry));
        System.out.printf("%s\n", StringUtils.reverseStr(s));
        System.out.printf("%s\n", StringUtils.strToUppercase(s));
        System.out.println(StringUtils.isPalindromic(s));
        System.out.println(StringUtils.isPalindromic(v));
        System.out.println(ValidationUtils.isBetween(s));
        System.out.println(ValidationUtils.isBetween(11));

        System.out.println();
        System.out.println();


        StackManager stringLifoArray = StackManager.getInstance();
        stringLifoArray.push(s);
        stringLifoArray.pull();
        stringLifoArray.push(s);
        stringLifoArray.contents();

        System.out.println();

        QueueManager queueFifo = QueueManager.getInstance();
        queueFifo.enqueue(1);
        queueFifo.enqueue(2);
        queueFifo.dequeue();
        queueFifo.contents();









    }
}
