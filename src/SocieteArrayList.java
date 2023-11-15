import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SocieteArrayList implements IGestion<Employee> {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employees.stream().anyMatch(employee -> employee.getName().equals(nom));
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        employees.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        employees.sort(Comparator.comparingInt(Employee::getId));
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employees.sort(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getDepartmentName)
                .thenComparingInt(Employee::getGrade));
    }
}