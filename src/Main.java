import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Prosit 9
        SocieteArrayList societe = new SocieteArrayList();

        Employee emp1 = new Employee(1, "Sahnoun", "Amir", "IT", 5);
        Employee emp2 = new Employee(2, "Test", "Tester", "HR", 4);
        Employee emp3 = new Employee(3, "Example", "Exampler", "Sales", 3);

        // Add employees
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Display employees
        System.out.println("Liste des employés:");
        societe.displayEmploye();

        // Search for an employee
        System.out.println("\nRecherche de l'employé avec le nom 'Sahnoun':");
        boolean found1 = societe.rechercherEmploye("Sahnoun");
        System.out.println("Employee found: " + found1);
        System.out.println("\nRecherche de l'employé avec le nom 'Foulan':");
        boolean found2 = societe.rechercherEmploye("Foulan");
        System.out.println("Employee found: " + found2);

        // Sort employees by ID
        societe.trierEmployeParId();
        System.out.println("\nListe des employés triée par ID:");
        societe.displayEmploye();

        // Sort employees by Name, Department and Grade
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\nListe des employés triée par Nom, Département et Grade:");
        societe.displayEmploye();

        // Test supprimerEmploye
        societe.supprimerEmploye(emp2);
        System.out.println("\nListe des employés après suppression:");
        societe.displayEmploye();

        //Prosit 10
        DepartementHashSet departementHashSet = new DepartementHashSet();

        Departement dep1 = new Departement(1, "IT", 5);
        Departement dep2 = new Departement(2, "HR", 4);
        Departement dep3 = new Departement(3, "Sales", 3);

        // Add departments
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        // Display departments
        departementHashSet.displayDepartement();

        // Search for a department
        boolean found = departementHashSet.rechercherDepartement("IT");
        System.out.println("Department found: " + found);

        // Sort departments by ID
        TreeSet<Departement> sortedDepartments = departementHashSet.trierDepartementById();
        sortedDepartments.forEach(System.out::println);

        //Prosit 11
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        Employee employe1 = new Employee(1, "John", "Doe", "IT", 5);
        Employee employe2 = new Employee(2, "Jane", "Doe", "HR", 4);
        Employee employe3 = new Employee(3, "Jim", "Beam", "Sales", 3);
        Departement depart1 = new Departement(1, "IT", 5);
        Departement depart2 = new Departement(2, "HR", 4);
        Departement depart3 = new Departement(3, "Sales", 3);

        // Add employees to departments
        affectationHashMap.ajouterEmployeeDepartement(employe1, depart1);
        affectationHashMap.ajouterEmployeeDepartement(employe2, depart2);
        affectationHashMap.ajouterEmployeeDepartement(employe3, depart3);

        // Display employees and departments
        affectationHashMap.afficherEmployeesEtDepartements();

        // Remove an employee
        affectationHashMap.supprimerEmployee(employe1);

        // Display employees and departments
        affectationHashMap.afficherEmployeesEtDepartements();

        // Sort employees by ID
        TreeMap<Employee, Departement> sortedMap = affectationHashMap.trierMap();
        sortedMap.forEach((employee, departement) -> System.out.println(employee + " -> " + departement));
    }
}
