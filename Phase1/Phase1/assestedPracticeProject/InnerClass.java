package Phase1.assestedPracticeProject;

public class InnerClass {
    public static void main(String[] args) {

        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();

        System.out.println("Processor Cache = " + processor.getCache());
     
    }
}

class CPU {
    double price;
   
    class Processor{
        double cores;
        String manufacturer;

        double getCache(){
            return 6.3;
        }
    }

    }


