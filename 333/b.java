interface Animal{
public void animalsound();
public void sleep();
}
class dog implements Animal{
public void animalsound(){
System.out.println("the dog says : BOW BOWW");
}
public void sleep(){
System.out.println("Zzz");
}
}
class b{
public static void main(String [] args){
dog a=new dog();
a.animalsound();
a.sleep();
}
}