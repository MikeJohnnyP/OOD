package more_lab10.model;

public class ModelAdapterImpl implements IModelAdapter {
    IModel model;

    public ModelAdapterImpl(IModel model) {
        this.model = model;
    }

    @Override
    public double getDegreeFtoC(double degree) {
        return model.converFtoC(degree);
    }

    @Override
    public double getDegreeCtoF(double degree) {
        return model.convertCtoF(degree);
    }

}
