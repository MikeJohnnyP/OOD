package more_lab9_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Department extends CompanyComponent {
    ArrayList<CompanyComponent> companyComponents = new ArrayList<CompanyComponent>();

    @Override
    void add(CompanyComponent g) {
        companyComponents.add(g);
    }

    @Override
    void remove(CompanyComponent g) {
        companyComponents.remove(g);
    }

    @Override
    void display() {
        System.out.println("Department");
        Iterator iterator = (Iterator) companyComponents.iterator();
        while (iterator.hasNext()) {
            CompanyComponent company = (CompanyComponent) iterator.next();
            company.display();
        }
    }

}
