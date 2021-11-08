package demo.group.model;


import javax.persistence.*;

@Entity
public class assigment {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commodity;

    @Column
    private int licno;
    @Column
    private String oilname;
    @Column
    private String oilqty;
    @Column
    private String oilprice;

    public int getLicno() {
        return licno;
    }

    public String getOilname() {
        return oilname;
    }

    public String getOilqty() {
        return oilqty;
    }

    public String getOilprice() {
        return oilprice;
    }

    public void setLicno(int licno) {
        this.licno = licno;
    }

    public void setOilname(String oilname) {
        this.oilname = oilname;
    }

    public void setOilqty(String oilqty) {
        this.oilqty = oilqty;
    }

    public void setOilprice(String oilprice) {
        this.oilprice = oilprice;
    }

    public long getCommodity() {
        return commodity;
    }

    public void setCommodity(long commodity) {
        this.commodity = commodity;
    }
}
