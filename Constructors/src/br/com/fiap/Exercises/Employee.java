package br.com.fiap.Exercises;

public class Employee {
    private String name;
    private float hourValue;

    public Employee(){}

    public Employee(String name, float hourValue){
        this.name = name;
        setHourValue(hourValue);

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getHourValue() {
        return hourValue;
    }
    public void setHourValue(float hourValue) {
        try {
            if(hourValue > 0){
                this.hourValue = hourValue;
            }
            else{
                throw new Exception("O valor da hora trabalhada não pode ser menor/igual a 0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public float salary(float hourPerWeek){
        float finalSalary = (hourValue * hourPerWeek) * 4;
        return finalSalary;
    }

}
