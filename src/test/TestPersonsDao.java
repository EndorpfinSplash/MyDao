package test;

import by.javastudy.zinovich.api.dao.PersonsDAO;
import by.javastudy.zinovich.api.domain.Person;
import by.javastudy.zinovich.impl.dao.DaoFactoryImpl;

public class TestPersonsDao {
    public static void main(String[] args) {

        try (PersonsDAO personsDao = new DaoFactoryImpl().getPersonsDAO()) {
            personsDao.addPerson(new Person("Andrey", "z", "az"));
            personsDao.addPerson(new Person("Andrey2", "ze", "aze"));
            personsDao.deletePerson(5);
            personsDao.updatePerson(new Person(10,"Andrey", "ZZZZ", "Zsad", "xyz123"));

            for (Person p : personsDao.getAllPersons()) {
                System.out.println(p);
            }

            personsDao.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//////////////////////////////////////////////