package day5.association.isa;

public class Manager {
	private int teamSize;

	// constructors
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	// getter/setter methods
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
				+ ", Department=" + getDepartment() + "]";
	}

	private String getEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
