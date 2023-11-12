package fpoly.phucvvph34858.duanmau.model;

public class ThanhVien {
    private int matv;
    private String hoten;
    private String namsinh;
    private  String stk;

    public
    String getStk() {
        return stk;
    }

    public
    void setStk(String stk) {
        this.stk = stk;
    }

    public
    ThanhVien(int matv, String hoten, String namsinh,String stk) {
        this.matv = matv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.stk=stk;
    }

    public int getMatv() {
        return matv;
    }

    public void setMatv(int matv) {
        this.matv = matv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

}
