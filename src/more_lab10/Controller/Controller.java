package more_lab10.Controller;

import more_lab10.model.IModel;
import more_lab10.model.IModelAdapter;
import more_lab10.model.Model;
import more_lab10.model.ModelAdapterImpl;
import more_lab10.view.IView;
import more_lab10.view.IViewAdpater;
import more_lab10.view.View;
import more_lab10.view.ViewAdapterImpl;

public class Controller {
    IModelAdapter modelAdapter;
    IViewAdpater viewAdapter;

    public Controller(IModel model, IView view) {
        this.modelAdapter = new ModelAdapterImpl(model);
        this.viewAdapter = new ViewAdapterImpl(view);
        model.setView(viewAdapter);
        view.setModel(modelAdapter);
        view.initiallize();
    }

    public static void main(String[] args) {
        new Controller(new Model(), new View());
    }
}
