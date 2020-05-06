package jsp_test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO2 {
	public static List<Book> findAll() throws Exception {
		String sql = "SELECT b.*, c.categoryName" + "FROM  book b LEFT JOIN category c ON B.id = c.id";

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
				list.add(Book);
			}
			return list;

		}
	}

public static List<Book> findByName(String author) throws Exception {
    String sql = "SELECT b.*, c.categoryName" + "FROM  book b LEFT JOIN category c ON B.id = c.id"+
                 "WHERE b.author LIKE ?";
    try (Connection connection = DB.getConnection("book");
         PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, author + "%");
        try (ResultSet resultSet = statement.executeQuery()) {
            ArrayList<Book> list = new ArrayList<Book>();
            while (resultSet.next()) {
				Book Book = new Book();
				Book.setId(resultSet.getInt("id"));
				Book.setAuthor(resultSet.getString("author"));
				Book.setTitle(resultSet.getString("title"));
				Book.setCategoryName(resultSet.getString("categoryname"));
				Book.setPrice(resultSet.getInt("price"));
				Book.setPublisher(resultSet.getString("publisher"));
				list.add(Book);
			}
            return list;
        }
    }

}
}