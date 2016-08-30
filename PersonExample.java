class Person
{
private String name;
private String address;

public Person(String name,String address)
{
this.name=name;
this.address=address;
}
public String getName()
{
return name;
}

public String getAddress()

{
return address;
}
public void setAddress(String address)

{
this.address=address;

}

public String toString() {
   return "Person[name=" + name + " Address=" + address + "]";
}


}

class Student extends Person
{
private String program;
private int year;
private double fee;
public Student(String name, String address, String program, int year, double fee)
{
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}

public String getProgram()
{
return program;
}

public void setProgram(String Program)

{
this.program=program;

}
public int getYear()
{
return year;

}
public void setYear(int year)
{
this.year=year;
}
public double getFee()

{
return fee;
}

public void setFee(double fee)
{
this.fee=fee;

}
public String toString() {
   return "Student[name=" + getName() + " Address=" + getAddress() + " Program=" + this.program + " year=" + this.year + " Fee=" + this.fee + "]";
}
    }

class Staff extends Person
{
private String school;
private double pay;
Staff(String name, String address, String school, double pay)
{
super(name,address);
this.school=school;
this.pay=pay;
}

public String getSchool()
{
return school;
}

public void setSchool(String school)

{
this.school=school;

}
public double getPay()

{
return pay;
}

public void setPay(double pay)
{
this.pay=pay;

}
public String toString() {
   return "Staff[name=" + getName() + " Address=" + getAddress() + " School=" + this.school + " Pay=" + this.pay + "]";
}
    }

public class PersonExample
{
public static void main(String args[])
{

Student s1=new Student("Anil","Viayawada","CSE",4,35000);
Staff s2=new Staff("Suresh","Vijayawada","ABC",35000);
System.out.println(s1);                    
System.out.println(s1.getName());          
System.out.println(s1.getAddress());
System.out.println(s1.getProgram());
System.out.println(s1.getYear());
System.out.println(s1.getFee());
System.out.println(s2);                    
System.out.println(s2.getName());          
System.out.println(s2.getAddress());
System.out.println(s2.getSchool());
System.out.println(s2.getPay());
}
}