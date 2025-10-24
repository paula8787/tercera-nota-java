package unidad3.actividad3;

public class BookFileHandler {

    private static final String FILE_PATH = "books.txt";

    public void saveBook(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Book book : books) {
                writer.write(book.getTitle() );
                writer.newLine();
                writer.write(book.getAuthor());
                writer.newLine();
                writer.write("," + String.valueOf(book.getPrice()));
                writer.newLine();
            }
            System.out.println("Books saved successfully to " + FILE_PATH);

        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }  finally {
            System.out.println("Save operation completed.");
        }

    }
    
}