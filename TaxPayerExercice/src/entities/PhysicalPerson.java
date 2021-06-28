package entities;

public  class PhysicalPerson extends Tax{
    private Double healthTaxes;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthTaxes) {
        super(name, annualIncome);
        this.healthTaxes = healthTaxes;
    }

    @Override
    public double tax() {
        if(getAnnualIncome() < 20000.00){
            return (getAnnualIncome() * 0.15) - (healthTaxes * 0.5) ;
        }
        else{
            return (getAnnualIncome() * 0.25) - (healthTaxes * 0.5);
        }
    }
}
