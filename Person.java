Public class Person
{
private String firstName;
private String otherNames;
private String familyName;

	public Person()
	{
	firstName = "";
	otherNames = "";
	familyName = new String();
	}

	public Person(String firstName, String familyName)
	{
	this.firstName = firstName;
	this.familyName = familyName;
	}

	public String getFirstName(){
	return firstName;
	}

	public void setFirstName(String firstName){
	this.firstName = firstName;
	}

	public String getFamilyName(){
	return familyName;
	}

	public void setFamilyName(String familyName){
	this.familyName = familyName;
	}

	public int getAge(){
	int age = 5;
	return age;
	}

}