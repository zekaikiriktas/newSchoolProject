package day32maps.newokulproje;

import day32maps.hashcityproject.City;

import java.util.*;

public class Okul {
    private String adSoyad;
    private Long newTc;
    private int sinif;
    static Scanner input = new Scanner(System.in);
    static int count = 0;

    public Okul(String adSoyad, Long newTc, int sinif) {
        this.adSoyad = adSoyad;
        this.newTc = newTc;
        this.sinif = sinif;
    }

    static HashMap<Integer, IlkOkul> hashMapIlkokul = new HashMap<>();
    static Set<Integer> ilkokulNumaralariSet1 = hashMapIlkokul.keySet();

    static HashMap<Integer, OrtaOkul> hashMapOrtaokul = new HashMap<>();
    static Set<Integer> ortaokulNumaralariSet1 = hashMapOrtaokul.keySet();

    static HashMap<Integer, Lise> hashMapLise = new HashMap<>();
    static Set<Integer> liseNumaralariSet1 = hashMapLise.keySet();

    public static void panelOkul() {
        hashMapIlkokul.put(34, new IlkOkul("Ahmet", 2000000L, 2));
        hashMapIlkokul.put(35, new IlkOkul("Ali", 1000000L, 1));
        hashMapIlkokul.put(06, new IlkOkul("Veli", 1500000L, 4));
        hashMapIlkokul.put(58, new IlkOkul("Zekai", 750000L, 3));
        System.out.println(hashMapIlkokul.size());
        boolean dongu = true;

        do {
            System.out.println("Öğrenci işlem sayfası");
            System.out.println("1- Primary School student process");
            System.out.println("2- Middle School student process");
            System.out.println("3- High School student process");
            System.out.println("4- All student list");
            System.out.println("5- Quit");
            System.out.println("What action do you want to do");
            String choice = input.next().substring(0);
            switch (choice) {
                case "1":
                    studentPriAffair();
                    break;

                case "2":
                    studentMidAffair();
                    break;

                case "3":
                    studentHighAffair();
                    break;

                 case "4":
                     System.out.println("Primary Student List");
                     System.out.println("---------------------------------------");
                     IlkOkul.listIlk();
                     System.out.println("Middle Student List");
                     System.out.println("---------------------------------------");
                     OrtaOkul.listOrta();
                     System.out.println("High Student List");
                     System.out.println("---------------------------------------");
                     Lise.listLise();
                     break;

                case "5":
                    System.out.println("Güle güle");
                    dongu=false;
                    break;
                default:
                    System.out.println("Geçerli bir seçim yapınız");
                    panelOkul();
                    break;
            }

        } while (dongu);
        }
        public static void studentPriAffair(){
            boolean newDongu=true;
            do {

            System.out.println("Primary Student Affairs Page");
            System.out.println("A- Create New Student ");
            System.out.println("B- Search Student");
            System.out.println("C- Delete Student");
            System.out.println("D- Update Student information");
            System.out.println("E- List of Student");
            System.out.println("Q- Go to student panel");
            System.out.println("What action do you want to do");

            String newChoice = input.next().substring(0);
                        switch (newChoice) {
                            case "A":
                                count++;
                                hashMapIlkokul.put(100 + count, IlkOkul.newIlkokul());
                                IlkOkul ilkOkul = hashMapIlkokul.get(100 + count);
                                System.out.println(ilkOkul);
                                System.out.println(hashMapIlkokul.size());
                                System.out.println("Are you enter a new student[Y/N]");
                                Scanner scanner = new Scanner(System.in);
                                String newSecimIlk=scanner.next().substring(0);
                                if (newSecimIlk.equalsIgnoreCase("N")) {
                                    newDongu=false;
                                    break;
                                }
                                break;


                            case "B":
                                IlkOkul.IlkSerach();
                                break;

                            case "C":
                                IlkOkul.ilkDelete();
                                break;

                            case "D":
                                IlkOkul.ilkUpdate();
                                break;
                            case "E":
                                IlkOkul.listIlk();
                                break;
                            case "Q":
                                newDongu=false;
                                panelOkul();
                                break;
                            default:
                                System.out.println("Geçerli bir seçim yapın");
                                break;
                            }
        } while (newDongu);
        }
    public static void studentMidAffair() {
        boolean newDongu = true;
        do {

            System.out.println("Middle Student Affairs Page");
            System.out.println("A- Create New Student ");
            System.out.println("B- Search Student");
            System.out.println("C- Delete Student");
            System.out.println("D- Update Student information");
            System.out.println("E- List of Student");
            System.out.println("Q- Go to student panel");
            System.out.println("What action do you want to do");

            String newChoice = input.next().substring(0);
            switch (newChoice) {
                case "A":
                    count++;
                    hashMapOrtaokul.put(200 + count, OrtaOkul.newOrtaOkul());
                    OrtaOkul ortaOkul = hashMapOrtaokul.get(100 + count);
                    System.out.println(ortaOkul);
                    System.out.println(hashMapOrtaokul.size());
                    System.out.println("Are you enter a new student[Y/N]");
                    Scanner scanner = new Scanner(System.in);
                    String newSecimIlk=scanner.next().substring(0);
                    if (newSecimIlk.equalsIgnoreCase("N")) {
                        newDongu = false;
                        break;
                    }
                    break;
                case "B":
                    OrtaOkul.ortaSerach();
                    break;

                case "C":
                    OrtaOkul.ortaDelete();
                    break;

                case "D":
                    OrtaOkul.ortaUpdate();
                    break;

                case "E":
                    OrtaOkul.listOrta();
                    break;
                case "Q":
                    newDongu=false;
                    panelOkul();
                    break;
                default:
                    System.out.println("Geçerli bir seçim yapın");
                    break;

            }
        }while (newDongu);
    }






    public static void studentHighAffair() {
        boolean newDongu = true;
        do {

            System.out.println("High Student Affairs Page");
            System.out.println("A- Create New Student ");
            System.out.println("B- Search Student");
            System.out.println("C- Delete Student");
            System.out.println("D- Update Student information");
            System.out.println("E- List of Student");
            System.out.println("Q- Go to student panel");
            System.out.println("What action do you want to do");

            String newChoice = input.next().substring(0);
            switch (newChoice) {
                case "A":
                    count++;
                    hashMapLise.put(200 + count, Lise.newLise());
                    Lise lise = hashMapLise.get(300 + count);
                    System.out.println(lise);
                    System.out.println(hashMapLise.size());
                    System.out.println("Are you enter a new student[Y/N]");
                    Scanner scanner = new Scanner(System.in);
                    String newSecimIlk=scanner.next().substring(0);
                    if (newSecimIlk.equalsIgnoreCase("N")) {
                        newDongu = false;
                        break;
                    }
                    break;
                case "B":
                    Lise.liseSerach();
                    break;

                case "C":
                    Lise.liseDelete();
                    break;

                case "D":
                    Lise.liseUpdate();
                    break;

                case "E":
                    Lise.listLise();
                    break;
                case "Q":
                    newDongu=false;
                    panelOkul();
                    break;
                default:
                    System.out.println("Geçerli bir seçim yapın");
                    break;

            }
        }while (newDongu);
    }


        /*System.out.println("Değiştirmek istediğiniz öğrenci kodu");
        Scanner scanner = new Scanner(System.in);
        int degis= scanner.nextInt();
        while(iterator.hasNext()){
            Integer key = iterator.next().getKey();
            if(degis==key) {
                hashMapIlkokul.replace(key,50);
            }
            }*/


       /* Collection<City> values = hashMapCity.values();
        Iterator<City> iterator = values.iterator();
        while (iterator.hasNext()){
            City citys = iterator.next();
            System.out.println(citys);
        }*/





    @Override
    public String toString() {
        return adSoyad + '\'' + "------" + newTc+ "------" + sinif ;
    }
}


