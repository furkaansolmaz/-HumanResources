package İnsanKaynakları;

import java.util.Stack;

public class calisan {
    private String name;
    private String surname;
    private String birthDate;
    private String birthPlace;
    private String position;
    private int registryNumber;
    private Stack<String> previousWorkPlaces;
    private Stack<String> education;
    private int salary;


    public calisan(String name, String surname, String birthDate, String birthPlace, String position, int registryNumber,
                   Stack<String> previousWorkPlaces, Stack<String> education, int salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.position = position;
        this.registryNumber = registryNumber;
        this.previousWorkPlaces = previousWorkPlaces;
        this.education = education;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public String getBirthPlace() {
        return birthPlace;
    }


    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }


    public int getRegistryNumber() {
        return registryNumber;
    }


    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }


    public Stack<String> getPreviousWorkPlaces() {
        return previousWorkPlaces;
    }


    public void setPreviousWorkPlaces(Stack<String> previousWorkPlaces) {
        this.previousWorkPlaces = previousWorkPlaces;
    }


    public Stack<String> getEducation() {
        return education;
    }


    public void setEducation(Stack<String> education) {
        this.education = education;
    }


    public int getMaas() {
        return salary;
    }


    public void setMaas(int salary) {
        this.salary = salary;
    }

    public String getPozisyon() {
        return position;
    }

    public void setPozisyon(String position) {
        this.position = position;
    }


}
