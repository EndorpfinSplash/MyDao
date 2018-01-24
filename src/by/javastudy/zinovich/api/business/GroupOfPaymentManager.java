package by.javastudy.zinovich.api.business;

import by.javastudy.zinovich.api.domain.GroupOfPayment;

import java.util.List;

public interface GroupOfPaymentManager {

    List<GroupOfPayment> getGroupOfPaymentList();
    void addGroupOfPayment();
    void updateGroupOfPayment();

}
