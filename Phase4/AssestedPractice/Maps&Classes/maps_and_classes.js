var map1 = new Map(); 
map1.set("first name", "Ankita"); 
map1.set("last name", "Priyanka"); 
map1.set("friend 1","nikita") 
    .set("friend 2","Shradha"); 
console.log(map1); 
console.log("map1 has friend 2 ? " + map1.has("friend 2")); 
console.log("get value for key = friend 2 - "+ map1.get("friend 2")); 
console.log("delete element with key = friend 1 - " + map1.delete("friend 1")); 
map1.clear(); 
console.log(map1);
class Employee
{
    constructor(id,name)
    {
      this.id=id;
      this.name=name;
    }
    detail()
    {
  document.writeln(this.id+" "+this.name+"<br>")
    }
  }
//passing object to a variable 
var e1=new Employee(101.,"Kalyani");
var e2=new Employee(102.,"Ketki");
e1.detail(); 
e2.detail();

