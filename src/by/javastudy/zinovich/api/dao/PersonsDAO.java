package by.javastudy.zinovich.api.dao;

import by.javastudy.zinovich.api.domain.Person;
import by.javastudy.zinovich.exceptions.DaoException;

import java.util.List;

public interface PersonsDAO extends AutoCloseable {
    List<Person> getAllPersons() throws DaoException;

    void addPerson(Person person) throws DaoException;

    void updatePerson(Person person) throws  DaoException;

    void deletePerson(Integer Person_id) throws DaoException;

    void close() throws DaoException;
}
//////////////////////////////////////////////