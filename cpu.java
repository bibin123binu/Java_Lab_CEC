class CPU { 
     int price; 
  
     CPU(int p) { 
         price = p; 
     } 
  
     class Processor { 
         int cores; 
         String manufacturer; 
  
         Processor(int n, String m) { 
             cores = n; 
             manufacturer = m; 
         } 
  
         void display() { 
             System.out.println("No of Cores : " + cores); 
             System.out.println("Processor manufacturer : " + manufacturer); 
         } 
     } 
  
     static class Ram { 
         int memory; 
         String manufacturer; 
  
         Ram(int n, String m) { 
             memory = n; 
             manufacturer = m; 
         } 
  
         void display() { 
             System.out.println("Memory Size : " + memory); 
             System.out.println("Memory manufacturer : " + manufacturer); 
         } 
     } 
  
     void display() { 
         System.out.println("Price of CPU : " + price); 
     } 
  
     public static void main(String[] args) { 
         CPU AMD = new CPU(15000); 
         CPU.Processor M4 = AMD.new Processor(8, "AMD"); 
         CPU.Ram corsair = new Ram(2048, "Corsair"); 
         AMD.display(); 
         M4.display(); 
         corsair.display(); 
     } 
 }

