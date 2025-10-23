package unidad3.actividad3;

public class ReadBooks {

public void ReadBooks() {
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
        sistem.out.println("reading books from " + FILE_PATH);
        String line;
        int bookNumber = 1;

        while ((line = reader.readLine()) != null) {
            String title = line;
            String author = reader.readLine();
            double price = Double.parseDouble(reader.readLine().substring(1));
            if (author != null && price != null) {
                double price = Double.parseDouble(priceLine.substring(1));
            }
            System.out.println("Book " + bookNumber + ":");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
            System.out.println();

            bookNumber++;
        }
    
}
}
