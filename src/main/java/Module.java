public class Module {	
	
	//(Module Name, ID (CT417), List of students).
	private String moduleName;
	private String moduleId;
	
	Module(String moduleName, String moduleId) {

		this.moduleName = moduleName;
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public String getModuleId() {
		return moduleId;
	}
}