/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

/**
 *
 * @author dell
 */
public class FindBloodBankDTO {

    public FindBloodBankDTO(String bloodBankName, String address, long Opos, long Apos, long Bpos, long ABpos, long Oneg, long Aneg, long Bneg, long ABneg) {
        this.bloodBankName = bloodBankName;
        this.address = address;
        this.Opos = Opos;
        this.Apos = Apos;
        this.Bpos = Bpos;
        this.ABpos = ABpos;
        this.Oneg = Oneg;
        this.Aneg = Aneg;
        this.Bneg = Bneg;
        this.ABneg = ABneg;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getOpos() {
        return Opos;
    }

    public void setOpos(long Opos) {
        this.Opos = Opos;
    }

    public long getApos() {
        return Apos;
    }

    public void setApos(long Apos) {
        this.Apos = Apos;
    }

    public long getBpos() {
        return Bpos;
    }

    public void setBpos(long Bpos) {
        this.Bpos = Bpos;
    }

    public long getABpos() {
        return ABpos;
    }

    public void setABpos(long ABpos) {
        this.ABpos = ABpos;
    }

    public long getOneg() {
        return Oneg;
    }

    public void setOneg(long Oneg) {
        this.Oneg = Oneg;
    }

    public long getAneg() {
        return Aneg;
    }

    public void setAneg(long Aneg) {
        this.Aneg = Aneg;
    }

    public long getBneg() {
        return Bneg;
    }

    public void setBneg(long Bneg) {
        this.Bneg = Bneg;
    }

    public long getABneg() {
        return ABneg;
    }

    public void setABneg(long ABneg) {
        this.ABneg = ABneg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    private String bloodBankName;
    private String address;
    private long Opos;
    private long Apos;
    private long Bpos;
    private long ABpos;
    private long Oneg;
    private long Aneg;
    private long Bneg;
    private long ABneg;
    private String city;
    
}
