import models.Stnds;

public class Students {
    public static void main(String[] args) {
        Stnds student1_total= new Stnds("Wizi",17,487);
        Stnds student2_total = new Stnds("british man",18,399);
        Stnds student3_total = new Stnds("American woman",19,421);
        Stnds student4_total = new Stnds("Chad",18,415);
        Stnds student5_total = new Stnds("Zaen",19,422);

        System.out.println("Percent of the first student is: " + student1_total.getPercent());
        System.out.println("Percent of the second student is: " + student2_total.getPercent());
        System.out.println("Percent of the third student is: " + student3_total.getPercent());
        System.out.println("Percent of the fourth student is: " + student4_total.getPercent());
        System.out.println("Percent of the fifth student is: " +student5_total.getPercent());

        System.out.println(student1_total.getAeg());
        System.out.println(student2_total.getAeg());
        System.out.println(student3_total.getAeg());
        System.out.println(student4_total.getAeg());
        System.out.println(student5_total.getAeg());
        }


    }

