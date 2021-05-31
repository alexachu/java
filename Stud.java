class Stud{  
        private int id;  
        private String name;  
        Stud(int i,String n) {  
        id = i;  
        name = n;  
        }  
        void display() {
	System.out.println(id+" "+name);
         }  
       
        public static void main(String args[ ]) {  
        Stud s1 = new Stud(111,"Karan");  
        Stud s2 = new Stud(222,"Aryan");  
        s1.display();  
        s2.display();  
       }  
    } 