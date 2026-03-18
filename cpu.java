class CPU {
    int price;

    CPU(int price) {
        this.price = price;
    }

    // Inner class (non-static)
    class Processor {
        int no_of_cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.no_of_cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores: " + no_of_cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }
}

public class CPUDemo {
    public static void main(String[] args) {

        // Create CPU object
        CPU cpu = new CPU(45000);
        System.out.println("CPU Price: " + cpu.price);

        // Create inner class object (needs CPU object)
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        processor.display();

        // Create static nested class object (no CPU object needed)
        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        ram.display();
    }
}

