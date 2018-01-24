package by.javastudy.zinovich.utils;

import by.javastudy.zinovich.exceptions.DaoException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CloseResultSet {
    public static void closeResultSet(ResultSet resultSet, String dataSource) throws DaoException {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DaoException("Failed to close result set for " +
                        dataSource, e);
            }
        }
    }
}
////////////////////////////////////////////////////////////////