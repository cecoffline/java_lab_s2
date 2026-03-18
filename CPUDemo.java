import java.util.Scanner;

class CPU {
    int price;

CPU(int price) {
        this.price = price;
    }

class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }
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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CPU price: ");
        int cpuPrice = sc.nextInt();
        CPU cpu = new CPU(cpuPrice);

        System.out.print("Enter number of processor cores: ");
        int cores = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter processor manufacturer: ");
        String processorManufacturer = sc.nextLine();
        CPU.Processor processor = cpu.new Processor(cores, processorManufacturer);

        System.out.print("Enter RAM size (GB): ");
        int ramSize = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter RAM manufacturer:");
        String ramManufacturer = sc.nextLine();
        CPU.RAM ram = new CPU.RAM(ramSize, ramManufacturer);

        System.out.println("\nCPU DETAILS");
        System.out.println("CPU PRICE: " + cpu.price);
        System.out.println("\nPROCESSOR DETAILS");
        processor.display();
        System.out.println("\nRAM DETAILS");
        ram.display();

        sc.close();
    }
}

