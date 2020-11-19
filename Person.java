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
}