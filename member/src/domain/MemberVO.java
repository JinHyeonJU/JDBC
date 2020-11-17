package domain;

public class MemberVO {
   private int Id;
   private String name;
   private String addr;
   private String nation;
   private String email;
   private int age;
   
   
   
   
   @Override
   public String toString() {
      return "Id=" + Id + ", name=" + name + ", addr=" + addr + ", nation=" + nation + ", email="
            + email + ", age=" + age ;
   }
   public int getId() {
      return Id;
   }
   public void setId(int Id) {
      this.Id = Id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getAddr() {
      return addr;
   }
   public void setAddr(String addr) {
      this.addr = addr;
   }
   public String getNation() {
      return nation;
   }
   public void setNation(String nation) {
      this.nation = nation;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public MemberVO(int Id, String name, String addr, String nation, String email, int age) {
      super();
      this.Id = Id;
      this.name = name;
      this.addr = addr;
      this.nation = nation;
      this.email = email;
      this.age = age;
   }
   public MemberVO() {
      super();
   }
   public MemberVO(String name, String addr, String nation, String email, int age) {
      super();
      this.name = name;
      this.addr = addr;
      this.nation = nation;
      this.email = email;
      this.age = age;
   }
   
   
   
   
   
   
   
   
   
   
}