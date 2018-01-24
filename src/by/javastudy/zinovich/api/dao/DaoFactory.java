package by.javastudy.zinovich.api.dao;

import by.javastudy.zinovich.exceptions.DaoException;

public interface DaoFactory  {
    PaymentsDAO getPaymentsDao() throws DaoException;
    GroupOfPaymentDAO getGroupOfPaymentDao() throws DaoException;
    PersonsDAO getPersonsDAO() throws DaoException;
}
////////////////////////////////////////////////