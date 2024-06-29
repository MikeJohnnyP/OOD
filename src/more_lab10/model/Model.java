package more_lab10.model;

import more_lab10.view.IViewAdpater;

public class Model implements IModel {
    IViewAdpater view;

    @Override
    public double converFtoC(double degreeFahrenheit) {
        return (degreeFahrenheit - 32.0) / 9.0 * 5.0;

    }

    @Override
    public double convertCtoF(double degreeCelsius) {
        return degreeCelsius / 5.0 * 9.0 + 32.0;
    }

    @Override
    public void setView(IViewAdpater view) {
        this.view = view;
    }

}
