package more_lab10.view;

import more_lab10.model.IModelAdapter;

public interface IView {
    public void update();

    public void setModel(IModelAdapter model);

    public void initiallize();
}
