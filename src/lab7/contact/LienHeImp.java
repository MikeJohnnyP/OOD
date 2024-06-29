package lab7.contact;

public class LienHeImp implements LienHe {
  private String tenDau;
  private String tenCuoi;
  private String toChuc;
  private String tieuDe;

  @Override
  public String tenDau() {
    return tenDau;
  }

  @Override
  public String tenCuoi() {
    return tenCuoi;
  }

  @Override
  public String tieuDe() {
    return tieuDe;
  }

  @Override
  public String toChuc() {
    return toChuc;
  }

  @Override
  public void setTenDau(String tenDau) {
    this.tenDau = tenDau;
  }

  @Override
  public void setTieuDe(String tieuDe) {
    this.tieuDe = tieuDe;
  }

  @Override
  public void setTenCuoi(String tencuoi) {
    this.tenCuoi = tencuoi;
  }

  @Override
  public void setToChuc(String toChuc) {
    this.toChuc = toChuc;
  }

  @Override
  public String toString() {
    return "LienHeImp [tenDau=" + tenDau + ", tenCuoi=" + tenCuoi + ", toChuc=" + toChuc + ", tieuDe=" + tieuDe + "]";
  }

}
