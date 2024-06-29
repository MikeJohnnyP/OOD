package lab7.ex3;

public class LienHeAdapter implements LienHe {
    private Contact lienHe;

    public LienHeAdapter(Contact lienHe) {
        this.lienHe = lienHe;
    }

    @Override
    public String getHo() {
        return lienHe.getFirstName();
    }

    @Override
    public String getTen() {
        return lienHe.getLastName();
    }

    @Override
    public String getChucVu() {
        return lienHe.getTitle();
    }

    @Override
    public String getToChuc() {
        return lienHe.getOrganization();
    }

    @Override
    public void setHo(String ho) {
        lienHe.setFirstName(ho);
    }

    @Override
    public void setTen(String ten) {
        lienHe.setLastName(ten);
    }

    @Override
    public void setChucVu(String chucVu) {
        lienHe.setTitle(chucVu);
    }

    @Override
    public void setToChuc(String toChuc) {
        lienHe.setOrganization(toChuc);
    }

    @Override
    public void setLienHe(Contact lienHe) {
        this.lienHe = lienHe;
    }

    @Override
    public String toString() {
        return "Ho: " + lienHe.getFirstName() + "\nTen: " + lienHe.getLastName() + "\nTo Chuc: "
                + lienHe.getOrganization() + "\nChuc Vu: " + lienHe.getTitle();
    }
}
