class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
       this.id=idCounter++;
    }
    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public void setName(){
        this.name=name;
    }
    public void setSurname(){
        this.surname=surname;
    }


    @Override
    public double getPaymentAmount(){
        return 0.0;
    }

    @Override
    public int compareTo(Person person ) {
        return Double.compare(this.getPaymentAmount(),person.getPaymentAmount());

    }
    public String getPosition(){
        return "Student" ;

    }

    @Override
    public String toString() {
        return "Person: " + id + ". " + name + " " + surname;
    }
}
