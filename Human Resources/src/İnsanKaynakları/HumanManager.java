package İnsanKaynakları;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class HumanManager {

    Scanner scanner;
    Stack<calisan> employeeList;

    public HumanManager() {
        scanner = new Scanner(System.in);
        employeeList = new Stack<calisan>();

    }

    public void menu() {
        while(true) {
            System.out.println("Yapılacak İşlemi Buraya Giriniz");
            System.out.println("1-)Çalışan ekleme");
            System.out.println("2-)Çalışan çıkarma");
            System.out.println("3-)Tüm Çalışan bilgilerini görüntüleme");
            System.out.println("4-)Belirli Çalışan bilgilerini görüntüleme");
            System.out.println("5-)Çalışan sayısını görüntüleme");
            System.out.println("6-)Son giriş yapan çalışanı çıkarma");
            System.out.println("7-)Son giriş yapan çalışanın bilgilerini görüntüleme");
            int select = scanner.nextInt();
            selection(select);
        }
    }

    public void selection(int select) {
        if(select <= 0 && select > 7) {
            System.out.println("Hatalı giriş yaptınız tekrar ana menüye yönlendiriliyorsunuz");
            menu();
        }
        else {
            switch(select) {
                case 1:
                    this.calisanEkleme();
                    break;
                case 2:
                    System.out.println("Çıkaracak Kişinin Sicin Numarasını Giriniz");
                    int id = scanner.nextInt();
                    this.CalisanSilme(id);
                    break;
                case 3:
                    this.showAllEmployee();
                    break;
                case 4:
                    System.out.println("Elemanın Sicil Numarasını Giriniz");
                    int id1 = scanner.nextInt();
                    this.specificEmployeeInf(id1);
                    break;
                case 5:
                    this.showEmployeeCount();
                    break;
                case 6:
                    this.lastEmployeeDelete();
                    break;
                case 7:
                    this.lastEmployeeInf();
                    break;
            }

        }
    }
    public void calisanEkleme() {

        System.out.println("Çalışan...");
        scanner.nextLine();
        System.out.print("Ad : ");
        String name = scanner.nextLine();
        System.out.print("Soyad : ");
        String surname = scanner.nextLine();
        System.out.print("Doğum Tarihi : ");
        String birthdate = scanner.nextLine();
        System.out.print("Doğum yeri : ");
        String birtPlace = scanner.nextLine();
        System.out.print("Pozisyon : ");
        String position = scanner.nextLine();
        System.out.print("Sicil No : ");
        int registryNumber = scanner.nextInt();
        System.out.print("Maaş : ");
        int salary = scanner.nextInt();
        System.out.print("Daha önce çalıştığı yerler : ");
        Stack<String> previousWorkPlace = addStack();
        System.out.print("Daha önce okuduğu yerler : ");
        Stack<String> education = addStack();
        calisan employee = new calisan(name, surname, birthdate, birtPlace, position, registryNumber, previousWorkPlace, education, salary);
        employeeList.add(employee);
    }

    public void CalisanSilme(int id) {
        Iterator<calisan> it = employeeList.iterator();
        while(it.hasNext()) {
            calisan emp = it.next();
            if(emp.getRegistryNumber() == id) {
                it.remove();
            }
        }
    }

    public void showAllEmployee() {
        Iterator<calisan> it = employeeList.iterator();
        while(it.hasNext()) {
            calisan emplo = it.next();
            printEmployeeInf(emplo);
        }
    }

    public void specificEmployeeInf(int id) {
        for (Iterator<calisan> it = employeeList.iterator(); it.hasNext(); ) {
            calisan emplo = it.next();
            if(emplo.getRegistryNumber() == id) {
                printEmployeeInf(emplo);
            }
        }
    }

    public void printEmployeeInf(calisan emp) {
        System.out.println("Ad : " + emp.getName());
        System.out.println("Soyad : " + emp.getSurname());
        System.out.println("Doğum tarihi : " + emp.getBirthDate());
        System.out.println("Doğum yeri : " + emp.getBirthPlace());
        System.out.println("Pozisyon : " + emp.getPozisyon());
        System.out.println("Sicil No : " + emp.getRegistryNumber());
        System.out.println("Maaş : " + emp.getMaas());
        System.out.println("Daha önce çalıştığı yerler : " + emp.getPreviousWorkPlaces());
        System.out.println("Daha önce okuduğu yerler : " + emp.getEducation());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("***********************************************");
        System.out.println();
    }

    public void showEmployeeCount() {
        System.out.println(employeeList.capacity());
    }

    public void lastEmployeeDelete() {
        employeeList.pop();
    }

    public void lastEmployeeInf() {
        printEmployeeInf(employeeList.peek());
    }

    public Stack<String> addStack() {
        boolean akl = true;

        Stack<String> stack = new Stack<String>();
        System.out.println("Çıkış için -4 girin...");
        while(akl) {
            String string = scanner.nextLine();
            if(string.equals("-4"))
                break;
            stack.push(string);
        }
        return stack;
    }


}

