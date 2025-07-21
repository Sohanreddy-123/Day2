class Hello
{
    int id;
    String name;
    public void set(int num,String cname)
    {
        id=num;
        name=cname;
    }
    public void get()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
class Main{
    public static void main(String[] args){
        Hello obj=new Hello();
        obj.set(11,"sohan");
        obj.get();
    
    }
}
  
