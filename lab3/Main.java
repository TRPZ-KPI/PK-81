package lab3;

public class Main {
    public static void main(String[] args) {
        String stringValue = "ABCDE"; // new String("ABCDE")
        System.out.println(stringValue);
        stringValue += "F";
        System.out.println(stringValue);

        StringBuffer stringBufferValue = new StringBuffer("ABCDE");
        System.out.println(stringBufferValue);
        stringBufferValue.append("F");
        System.out.println(stringBufferValue);
        System.out.println("Done!");

        StringBuilder stringBuilderValue = new StringBuilder("ABCDE");
        System.out.println(stringBuilderValue);
        stringBuilderValue.append("F");
        System.out.println(stringBuilderValue);
        System.out.println("Done!");
    }
}
