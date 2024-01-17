import java.io.File;

public class Directories {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Sandy\\Desktop";

        int[] counters = new int[6];

        counters[0] = countTypeFiles(filePath, "jpg");
        counters[1] = countTypeFiles(filePath, "exe");
        counters[2] = countTypeFiles(filePath, "zip");
        counters[3] = countTypeFiles(filePath, "pdf");
        counters[4] = countTypeFiles(filePath, "docx");
        counters[5] = countTypeFiles(filePath, "png");

        for(int i=0; i<counters.length; i++) {
            String type = getTypeByIndex(i);
            System.out.println("Total " + type + ": " + counters[i]);
        }

    }

    public static int countTypeFiles(String filePath, String type) {

        File directory = new File(filePath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            int counter = 0;

            for (File file : files) {
                System.out.println("Name: " + file.getName());
                System.out.println("Path: " + file.getAbsolutePath());
                System.out.println("File size : " + file.length());
                System.out.println("Last update: " + file.lastModified());
                System.out.println("-------------------------\n");

                if(file.isFile() && file.getName().toLowerCase().endsWith("." + type.toLowerCase())) {
                    counter++;
                }
            }

            return counter;

        } else {
            System.out.println("Isn't a directory");
            return 0;
        }
    }

    public static String getTypeByIndex(int index) {

        switch (index) {
            case 0:
                return "jpg";
            case 1:
                return "exe";
            case 2:
                return "zip";
            case 3:
                return "pdf";
            case 4:
                return "docx";
            case 5:
                return "png";
            default:
                return "unknown";

        }
    }

}