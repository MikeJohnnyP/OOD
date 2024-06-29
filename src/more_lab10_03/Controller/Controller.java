package more_lab10_03.Controller;

import more_lab10_03.model.ISinhVienList;
import more_lab10_03.model.ListSinhVien;

public class Controller implements IController {
    private ISinhVienList sinhVienList = new ListSinhVien();

    @Override
    public String getDetailList() {
        return sinhVienList.getDetailList();
    }

    @Override
    public String getSimpleList() {
        return sinhVienList.getSimpleList();
    }

}
