class BloodData{
	private String BloodType;
	private String RhFactor;
	
	public void setBloodType(String BloodType) {
		this.BloodType = BloodType;
	}
		public String getBloodType(){
		return BloodType;
	}
	public void setRhFactor(String RhFactor) {
		this.RhFactor = RhFactor;
	}
	public String getRhFactor(){
		return RhFactor;
	}
	public BloodData(){
		BloodType = "O";
		RhFactor = "+";
	}
	public void display(){
		System.out.println(BloodType+RhFactor+" is added to the blood bank.");
	}
}