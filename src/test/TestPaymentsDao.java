package test;

import by.javastudy.zinovich.api.dao.PaymentsDAO;
import by.javastudy.zinovich.api.domain.Payment;
import by.javastudy.zinovich.impl.dao.DaoFactoryImpl;

    public class TestPaymentsDao {
        public static void main(String[] args) {

            try (PaymentsDAO paymentsDAO = new DaoFactoryImpl().getPaymentsDao()) {
                paymentsDAO.addPayment(new Payment(14, 150, "test Deposit"));
                paymentsDAO.addPayment(new Payment(11111, 150, "test Deposit","XXXXXXX"));
                paymentsDAO.deletePayment(11);
                paymentsDAO.updatePayment(new Payment(14, 150, "test Deposit", 33));

                for (Payment p : paymentsDAO.getAllPaymentList()) {
                    System.out.println(p);
                }

                System.out.println("person ");
                for (Payment p : paymentsDAO.getPaymentListForPerson("22")) {
                    System.out.println(p);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////