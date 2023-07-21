package ogrenciBilgiSistemi;

public class Main {

    public static void main(String[] args) {

    Course mat = new Course("Matematik", "MAT101", "MAT",20);
    Course fizik = new Course("Fizik", "FZK101", "FZK",10);
    Course kimya = new Course("Kimya", "KMY101", "KMY",30);

    Teacher t1 = new Teacher("Mahmut Tunç", "90550000000", "MAT");
    Teacher t2 = new Teacher("Fatma Kaya", "90550000001", "FZK");
    Teacher t3 = new Teacher("Ali Erkan", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

    Student s1 = new Student(" Aslı Şahin", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkVerbalNote(90,60,44);
        s1.isPass();

    Student s2 = new Student("Tuba Özalp", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkVerbalNote(30,80,70);
        s2.isPass();

    Student s3 = new Student("İsmail Kır", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkVerbalNote(40,50,60);
        s3.isPass();
    }
}
