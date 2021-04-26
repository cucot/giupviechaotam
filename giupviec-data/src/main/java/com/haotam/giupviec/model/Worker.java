package com.haotam.giupviec.model;

/**
 * worker là class map tới bảng giúp việc, lưu trữ thông tin các cô giúp việc như họ tên, năm sinh, quê quán, số điện thoại, CMND...
 */

public class Worker extends Person {

    private String phoneNumber;

    private String identityNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

}
