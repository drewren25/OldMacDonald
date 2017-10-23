class NamedCow extends Cow
{
private String myName;
public NamedCow(String name, String sound){
String myName = name;
}
public NamedCow(){
  myName = "Elsie";
}
public String getName(){
  return "Elsie";
}
}