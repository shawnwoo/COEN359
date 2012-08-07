package coen359;

public abstract class IndividualResource implements LabResources {

	private String resourceId;
	private int modelyear;
	private boolean status=true;
	private String supervisor;
	private double costOfMaintain;

	public abstract ComputerCluster getComputerCluster();
	
	public double costOfmaintenance() {
		// TODO Auto-generated method stub
		return this.getCostOfMaintain();
	}


	/** 
	 * check if the model year of this resource is older than parameter
	 * @param year
	 * @return
	 */
	public boolean oldMode(int year) {
		if (year > this.modelyear)
			return true;
		else
			return false;

	};
/**
 * Display resource informaiton in the console
 */
	public void showResourceDetails() {
		System.out.println("Individual Resource informaiton: ");
		System.out.println("Resource ID: " + this.getResourceId());
		System.out.println("Supervisor: " + this.getSupervisor());
		System.out.println("Model Year: " + this.getModelyear());

		if (this.isStatus()) {
			System.out.println("Status is : Active");
		} else {
			System.out.println("Status is : Inactive");
		}
		;
		System.out.println("*************************");
	}

	public void setInactive() {
		setStatus(false);
	}

	/**
	 * @return the resourceId
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * @param resourceId
	 *            the resourceId to set
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * @return the modelyear
	 */
	public int getModelyear() {
		return modelyear;
	}

	/**
	 * @param modelyear
	 *            the modelyear to set
	 */
	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the supervisor
	 */
	public String getSupervisor() {
		return supervisor;
	}

	/**
	 * @param supervisor
	 *            the supervisor to set
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	/**
	 * @return the costOfMaintain
	 */
	public double getCostOfMaintain() {
		return costOfMaintain;
	}

	/**
	 * @param costOfMaintain
	 *            the costOfMaintain to set
	 */
	public void setCostOfMaintain(double costOfMaintain) {
		this.costOfMaintain = costOfMaintain;
	}

}
