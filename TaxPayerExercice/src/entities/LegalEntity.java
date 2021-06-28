package entities;

public class LegalEntity extends Tax{

    private Integer employeeNumber;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer employeeNumber) {
        super(name, annualIncome);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double tax() {
        if (employeeNumber > 10){
            return getAnnualIncome() * 0.14;
        }
        else{
            return getAnnualIncome() * 0.16;
        }
    }


}
