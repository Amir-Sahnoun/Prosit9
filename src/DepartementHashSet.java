import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departements.stream().anyMatch(departement -> departement.getNomDepartement().equals(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        departements.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(Comparator.comparingInt(Departement::getId));
    }
}