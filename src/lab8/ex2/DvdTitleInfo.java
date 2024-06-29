package lab8.ex2;

public class DvdTitleInfo extends TitleInfo {

    private String star;
    private String dvdEncodingRegion;

    public DvdTitleInfo(String star, String title, String dvdEncodingRegion) {
        setTitleName(title);
        this.star = star;
        this.dvdEncodingRegion = dvdEncodingRegion;

    }

    @Override
    public String getTitleBurb() {
        return "DVD: " + this.getTitleName() + "\nStar" + this.getStar();
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getDvdEncodingRegion() {
        return "\nDVD encoding region: " + dvdEncodingRegion;
    }

    public void setDvdEncodingRegion(String dvdEncodingRegion) {
        this.dvdEncodingRegion = dvdEncodingRegion;
    }

    @Override
    public String getDvdEncodingInfo() {
        return this.getDvdEncodingRegion();
    }

}
