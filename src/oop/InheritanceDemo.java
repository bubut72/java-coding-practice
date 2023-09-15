package oop;

public class InheritanceDemo {

  public static void main(String[] args) {
    Programmer p = new Programmer("Joana Nimar", "Payment");
    String name = p.getName();
    String team = p.getTeam();
    System.out.println(name + " is assigned to the "+ team + " team");
  }

  public static class Employee {
    private String name;

    public Employee(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static class Programmer extends Employee {
    private String team;

    public Programmer(String name, String team) {
      super(name);
      this.team = team;
    }

    public String getTeam() {
      return team;
    }

    public void setTeam(String team) {
      this.team = team;
    }
  }

}
