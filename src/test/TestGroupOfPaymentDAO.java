package test;

import by.javastudy.zinovich.api.dao.GroupOfPaymentDAO;
import by.javastudy.zinovich.api.domain.GroupOfPayment;
import by.javastudy.zinovich.exceptions.DaoException;
import by.javastudy.zinovich.impl.dao.DaoFactoryImpl;

public class TestGroupOfPaymentDAO {

    public static void main(String[] args) {

        try {
            GroupOfPaymentDAO groupOfPaymentDAO = new DaoFactoryImpl().getGroupOfPaymentDao();

            GroupOfPayment groupOfPayment = new GroupOfPayment(23,"communicaion",2);
            groupOfPaymentDAO.addGroupForPerson(groupOfPayment);

            for (int i = 0; i <30 ; i++) {
                groupOfPaymentDAO.delete(i);
            }

            for (GroupOfPayment g : groupOfPaymentDAO.getAllGroups()) {
                System.out.println(g);
            }

            groupOfPaymentDAO.updateGroup(new GroupOfPayment(30,"Communicaion",220) );

            System.out.println();
            System.out.println(groupOfPaymentDAO.getAllGroupsForPerson("220"));

            groupOfPaymentDAO.close();

        } catch (DaoException e) {
            e.printStackTrace();
        }

    }
}
//////////////////////////////////////////////