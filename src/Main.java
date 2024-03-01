// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Query query1 = new QueryBuilder().select("name").from("student").build();
            System.out.println(query1.toString()); // Valid query

            Query query2 = new QueryBuilder().select("name").from("student").where("name = 'Name1'").build();
            System.out.println(query2.toString()); // Valid query

            Query query3 = new QueryBuilder().select("name").where("name = 'Name1'").build();
            System.out.println(query3.toString()); // Exception thrown
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}