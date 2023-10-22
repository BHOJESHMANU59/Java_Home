package com.referencetype_constructor;

public class Project {
	private int projectcode;
	private String projectname;

	public Project(int projectcode, String projectname) {
		super();
		this.projectcode = projectcode;
		this.projectname = projectname;
	}

	@Override
	public String toString() {
		return "Project [projectcode=" + projectcode + ", projectname=" + projectname + "]";
	}

}
