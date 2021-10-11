
package AdvancedDataCa1;

/**
 *
 * @author Conor Keller x18353923
 */
public class Patient {
    private String name;
		 private String age;
			 private String condition;
			 private int PriorityNew;

 public Patient(){
        name = new String();
			age = new String();
				condition = new String();
					
	
    }

    public void setName(String n){
        name = n;
    }
    
		public void setAge(String a){
        age = a;
    }
			public void setCondition(String c){
        condition = c;
    }

			public String getName(){
        return name;
    }

				public String getAge(){
        return age;
    }
					public String getCondition(){
        return condition;
    }
					public int getPriorityNew(){
        return PriorityNew;
    }
					
				
	//public static void main(String[] args) {
	//PQInterface pq = new MyPriorityQueue();
       // pq.enqueue(10,"People aged 90 and older");
       // pq.enqueue(9,"People aged 80 and older");
       // pq.enqueue(8,"People aged 70 and older");
       // pq.enqueue(7,"People aged 65‐69");
		//pq.enqueue(6,"People aged 18‐64 with medical condition(s)");
		//pq.enqueue(5,"People aged 55‐64");
		//pq.enqueue(4,"People aged 45‐54");
		//pq.enqueue(3,": People aged 30‐44");
	    // pq.enqueue(2,"people aged 18‐29");
		//pq.enqueue(1,"People aged under 18");
		//System.out.println(pq.printPQueue());
 
}