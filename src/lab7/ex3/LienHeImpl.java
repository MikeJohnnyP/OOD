package lab7.ex3;

public class LienHeImpl implements LienHe {

    private String ho, ten, chucVu, toChuc;

    public LienHeImpl(String ho, String ten, String chucVu, String toChuc) {
        this.ho = ho;
        this.ten = ten;
        this.chucVu = chucVu;
        this.toChuc = toChuc;
    }

    @Override
    public String getHo() {
        return ho;
    }

    @Override
    public String getTen() {
        return ten;
    }

    @Override
    public String getChucVu() {
        return chucVu;
    }

    @Override
    public String getToChuc() {
        return toChuc;
    }

    @Override
    public void setHo(String ho) {
        this.ho = ho;
    }

    @Override
    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;

    }

    @Override
    public void setToChuc(String toChuc) {
        this.toChuc = toChuc;
    }

    @Override
    public String toString() {
        return "Ho: " + ho + "\nTen: " + ten + "\nTo Chuc: " + toChuc + "\nChuc Vu: " + chucVu;
    }

    @Override
    public void setLienHe(Contact lienHe) {

    }

}
