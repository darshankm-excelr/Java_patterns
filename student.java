class student{
    int id;
    String name;
    student s; //address of student
    student(int id,String name){
        this.id=id;
        this.name=name;

    }
    student(student s){
        this.s=s;
    }
    public static void main(String[] args) {
        student s1=new student(25,"RAM");
        student s2=new student(s1);
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
        //System.out.println(s1.s.id+" "+s1.s.name);
        System.out.println(s2.s.id+" "+s2.s.name);

    }
}