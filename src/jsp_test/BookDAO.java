package jsp_test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public static List<Book> findAll() throws Exception {
        String sql = "SELECT b.*, c.categoryName"+
        			 "FROM  book b LEFT JOIN category c ON B.categoryId = c.id";

        try (Connection connection = DB.getConnection("book");
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            ArrayList<Book> list = new ArrayList<Book>();
            while (resultSet.next()) {
                Book Book = new Book();
                Book.setId(resultSet.getInt("id"));
                Book.setAuthor(resultSet.getString("author"));
                Book.setTitle(resultSet.getString("title"));
                Book.setCategoryName(resultSet.getString("categoryname"));
                Book.setPrice(resultSet.getInt("price"));
                Book.setPublisher(resultSet.getString("publisher"));
                Book.setCategoryId(resultSet.getInt("categoryId"));
                list.add(Book);
            }
            return list;
        }
    }
}
