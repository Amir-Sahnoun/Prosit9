import java.util.*;

class AffectationHashMap {
    private Map<Employee, Departement> affectations = new HashMap<>();

    public void ajouterEmployeeDepartement(Employee e, Departement d) {
        affectations.put(e, d);
    }

    public void afficherEmployeesEtDepartements() {
        affectations.forEach((Employee, departement) -> System.out.println(Employee + " -> " + departement));
    }

    public void supprimerEmployee(Employee e) {
        affectations.remove(e);
    }

    public void supprimerEmployeeEtDepartement(Employee e, Departement d) {
        affectations.entrySet().removeIf(entry -> entry.getKey().equals(e) && entry.getValue().equals(d));
    }

    public void afficherEmployees() {
        affectations.keySet().forEach(System.out::println);
    }

    public void afficherDepartements() {
        affectations.values().forEach(System.out::println);
    }

    public boolean rechercherEmployee(Employee e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
