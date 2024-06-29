package more_lab10.view;

public class ViewAdapterImpl implements IViewAdpater {
    IView view;

    public ViewAdapterImpl(IView view) {
        this.view = view;
    }

    @Override
    public void update() {
        view.update();
    }

}
