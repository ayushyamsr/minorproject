/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

import java.sql.Date;

/**
 *
 * @author dell
 */
public class HospitalDTO {

    public Date getLastDD() {
        return lastDD;
    }

    public void setLastDD(Date lastDD) {
        this.lastDD = lastDD;
    }

    public Date getNextDD() {
        return nextDD;
    }

    public void setNextDD(Date nextDD) {
        this.nextDD = nextDD;
    }

    public HospitalDTO(String name, long number,Date nextDD,Date lastDD) {
        this.name = name;
        this.number = number;
        this.nextDD=nextDD;
        this.lastDD=lastDD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    String name;
    long number;
    Date nextDD,lastDD;
}
