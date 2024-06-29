package more_lab10.model;

import more_lab10.view.IViewAdpater;

public interface IModel {
    public double converFtoC(double degreeFahrenheit);

    public double convertCtoF(double degreeCelsius);

    public void setView(IViewAdpater view);
}