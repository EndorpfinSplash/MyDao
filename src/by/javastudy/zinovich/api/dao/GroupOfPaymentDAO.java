package by.javastudy.zinovich.api.dao;

import by.javastudy.zinovich.api.domain.GroupOfPayment;
import by.javastudy.zinovich.exceptions.DaoException;

import java.util.List;

public interface GroupOfPaymentDAO extends AutoCloseable {
    List<GroupOfPayment> getAllGroups() throws DaoException;

    List<GroupOfPayment> getAllGroupsForPerson(String person_id) throws DaoException;

    void addGroupForPerson(GroupOfPayment groupOfPayment) throws DaoException;

    void updateGroup(GroupOfPayment groupOfPayment) throws DaoException;

    void delete(Integer id) throws DaoException;

    void close() throws DaoException;
}
//////////////////////////////////////////////