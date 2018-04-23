package be.vdab.composite;

public class Main {
	public static void main(String[] args) {
		Project project = new Project();
		project.add(new Grondstofkost(20, 85));
		project.add(new Arbeidskost(35, 305));
		
		Project subProject = new Project();
		subProject.add(new Grondstofkost(13, 4005));
		subProject.add(new Arbeidskost(25, 83));
		
		project.add(subProject);
		
		System.out.println("Totale kosten: " + project.berekenKost());
		
	}
}
