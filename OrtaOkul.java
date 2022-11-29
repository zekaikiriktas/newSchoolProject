package day32maps.newokulproje;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OrtaOkul extends Okul{

    static OrtaOkul ortaOkul1;

    public OrtaOkul(String adSoyad, Long newTc, int sinif) {
        super(adSoyad, newTc, sinif);
    }

    public static OrtaOkul newOrtaOkul(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("New Student Create Page");
        System.out.println("Adı soyadı");
        String newAd=input1.nextLine();
        System.out.println("Tc si");
        Long newTcsi=input1.nextLong();
        System.out.println("Sınıfı");
        int newSinif=input1.nextInt();
        ortaOkul1=new OrtaOkul(newAd,newTcsi,newSinif);
        return ortaOkul1;
    }


    public static void listOrta() {
        System.out.println("Middle student listesi");
        Set<Map.Entry<Integer, OrtaOkul>> entries = hashMapOrtaokul.entrySet();
        Iterator<Map.Entry<Integer, OrtaOkul>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, OrtaOkul> next = iterator.next();
            System.out.print("No  =" + next.getKey() + "  ");
            System.out.println(next.getValue());

        }
    }
    public static void ortaUpdate(){
        System.out.println("Update istediğiniz öğrencinin numarasını giriniz");
        int studentNoUpdate = input.nextInt();
        if (ortaokulNumaralariSet1.contains(studentNoUpdate)) {
            System.out.println("Update student process page ");
            hashMapOrtaokul.put(studentNoUpdate, OrtaOkul.newOrtaOkul());
            OrtaOkul ogrenci1 = hashMapOrtaokul.get(studentNoUpdate);
            System.out.println("\n-----Updeted------" + ogrenci1);
        }
    }
    public static void ortaSerach(){
        System.out.println("Aramak istediğiniz öğrencinin numarasını giriniz");
        int studentNo = input.nextInt();
        if (ilkokulNumaralariSet1.contains(studentNo)) {
            IlkOkul ogrenci = hashMapIlkokul.get(studentNo);
            System.out.println(ogrenci);
        }
    }
    public static void ortaDelete(){
        System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz");
        int studentNoDelete = input.nextInt();
        if (ortaokulNumaralariSet1.contains(studentNoDelete)) {
            OrtaOkul ogrenci = hashMapOrtaokul.get(studentNoDelete);
            System.out.println("\n-----Deleted------"+ogrenci);
            hashMapOrtaokul.remove(studentNoDelete);
        }
    }


}
