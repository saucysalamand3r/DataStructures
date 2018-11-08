class Name
   {
   private String Lastname;
   private String Firstname;
   
   public Name(String fname, String lname)
      {
      Lastname = lname;
      Firstname = fname;
      }
   public void setName(String fname, String lname)
      {
      Lastname = lname;
      Firstname = fname;
      }
   public String returnName()
      {
      return Firstname + " " + Lastname;
      }
   public String lastName()
      { return Lastname; }
   public String firstName()
      { return Firstname; }
   }
   
class MailInfo
   {
   private String Address;
   private String City;
   private String State;
   private String Zipcode;
   
   public MailInfo(String add, String cty, String st, String zip)
      {
      Address = add;
      City = cty;
      State = st;
      Zipcode = zip;
      }
   public void setAddress(String add, String cty, String st, String zip)
      {
      Address = add;
      City = cty;
      State = st;
      Zipcode = zip;
      }
   public String returnAddress()
      { return Address; }
   public String returnCity()
      { return City; }
   public String returnState()
      { return State; }
   public String returnZipcode()
      { return Zipcode; }
   }
   
class Date
   {
   private int month;
   private int day;
   private int year;
   
   public Date(int mon, int dy, int yr)
      {
      month = mon;
      day = dy;
      year = yr;
      }
   public void setDate(int mon, int dy, int yr)
      {
      month = mon;
      day = dy;
      year = yr;
      }
   public String returnDate()
      {
      return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
      }
   public int returnMonth()
      { return month; }
   public int returnDay()
      { return day; }
   public int returnYear()
      { return year; }
   }
   
class Person
   {
   private Name name;
   private MailInfo mailInfo;
   private Date dateOfBirth;
   private String familyFriendAssociate;
   public Person next;
   
   public Person(Person entry)
      {
      name = entry.returnName();
      mailInfo = entry.returnMailInfo();
      dateOfBirth = entry.returnDateOfBirth();
      familyFriendAssociate = entry.returnFamilyFriendAssociate();
      }
   public Person(Name theName, MailInfo theMailInfo, Date dob, String fFA)
      {
      name = theName;
      mailInfo = theMailInfo;
      dateOfBirth = dob;
      familyFriendAssociate = fFA;
      }
   public void setPerson(Name theName, MailInfo theMailInfo, Date dob, String fFA)
      {
      name = theName;
      mailInfo = theMailInfo;
      dateOfBirth = dob;
      familyFriendAssociate=fFA;
      }
   public Name returnName()
      { return name; }
   public MailInfo returnMailInfo()
      { return mailInfo; }
   public Date returnDateOfBirth()
      { return dateOfBirth; }
   public String returnFamilyFriendAssociate()
      { return familyFriendAssociate; }
   public void displayEntry()
      {
      System.out.println(name.returnName());
      System.out.println(mailInfo.returnAddress());
      System.out.print(mailInfo.returnCity());
      System.out.print(", ");
      System.out.print(mailInfo.returnState());
      System.out.print(" ");
      System.out.print(mailInfo.returnZipcode());
      System.out.println();
      System.out.println(dateOfBirth.returnDate());
      System.out.println();
      }
   }
   
class AddressBookApp
   {
   public static void main(String[] args)
      {
      AddressBook cartoons = new AddressBook();
      listIterator iter = cartoons.getIterator();
      Name name = new Name("Buggs","Bunny");
      MailInfo mailInfo= new MailInfo("123 Rabbit Hole Dr.","Hollywood","CA","90028");
      Date dob = new Date(5,3,1925);
      Person person = new Person(name,mailInfo,dob,"Friend");
      iter.insertFront(person);
      name = new Name("Daffy","Duck");
      mailInfo= new MailInfo("652 Mallard Hw.","Hollywood","CA","90068");
      dob = new Date(9,14,1926);
      person = new Person(name,mailInfo,dob,"Friend");
      iter.insertFront(person);
      name = new Name("Cecil","Turtle");
      mailInfo= new MailInfo("452 Racetrack Rd.","Hollywood","CA","90038");
      dob = new Date(10,21,1936);
      person = new Person(name,mailInfo,dob,"Family");
      iter.insertFront(person);
      name = new Name("Elmer J.","Fudd");
      mailInfo= new MailInfo("6135 Shotgun Way","Hollywood","CA","90069");
      dob = new Date(3,10,1928);
      person = new Person(name,mailInfo,dob,"Associate");
      iter.insertFront(person);
      
      iter.reset();
      Person findPerson = iter.findLastname("Duck");
      if (findPerson == null)
         System.out.println("Person not found.");
      else
         findPerson.displayEntry();
      findPerson = iter.findLastname("Duck");
      if (findPerson == null)
         {
         System.out.println("Person not found.");
         System.out.println();
         }
      else
         findPerson.displayEntry();
      
      iter.reset();
      while (iter.getCurrent() != null)
         {
         iter.getCurrent().displayEntry();
         iter.nextLink();
         }
         
      iter.reset();
      findPerson = iter.findLastname("Bunny");
      System.out.println("The following record was deleted.");
      findPerson.displayEntry();
      iter.deleteCurrent();

      iter.reset();
      while (iter.getCurrent() != null)
         {
         iter.getCurrent().displayEntry();
         iter.nextLink();
         }
      
      }
   } 
         
   
