// Base class (common details)
class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

// InPatient class (extra features like room number)
class InPatient extends Patient {
    int roomNumber;
    String admissionDate;

    InPatient(String name, int age, int roomNumber, String admissionDate) {
        super(name, age);  // Reuse parent properties
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    void displayInPatientDetails() {
        displayDetails();
        System.out.println("Room Number   : " + roomNumber);
        System.out.println("Admission Date: " + admissionDate);
    }
}

// OutPatient class (extra features like appointment date)
class OutPatient extends Patient {
    String appointmentDate;

    OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    void displayOutPatientDetails() {
        displayDetails();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("Alice", 30, 101, "2025-08-20");
        OutPatient p2 = new OutPatient("Bob", 25, "2025-08-25");

        System.out.println("=== InPatient Details ===");
        p1.displayInPatientDetails();

        System.out.println("\n=== OutPatient Details ===");
        p2.displayOutPatientDetails();
    }
}