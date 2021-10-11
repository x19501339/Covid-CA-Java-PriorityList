package AdvancedDataCa1;

/**
 *
 * @author Conor Keller x18353923
 */
public class PQElement {
      private int key;
      private Patient element;
     
      public PQElement(int priority, Patient e){
		key = priority;
                element = e;
	}

      public int getKey() {
		return key;
	}

      public void setKey(int val) {
		key = val;
	}
	
	public Patient getElement() {
            return element;
      }

	public void setElement(Patient e) {
		element = e;
      }

public String printPatient() {
String message ;
message = "name = "+element.getName()+ ", "+ "Age ="+element.getAge()+ ", "+ "Condition ="+element.getCondition()+" Priority ="+element.getPriorityNew();
return message;
}
 
}
