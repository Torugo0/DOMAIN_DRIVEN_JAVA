package br.com.fiap;

public class Employee {
    private String name;
    private float valueHour;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getValueHour() {
        return valueHour;
    }
    public void setValueHour(float valueHour) {
        this.valueHour = valueHour;
    }

    public float salary(float hourPerWeek){
        float finalSalary = (valueHour * hourPerWeek) * 4;
        return finalSalary;
    }
}
