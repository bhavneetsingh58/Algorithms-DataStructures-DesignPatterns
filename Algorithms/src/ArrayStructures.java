public class ArrayStructures {
int[] theArray = new int[50];
static int i = 0;
int arraySize =10;
//-----------------------------------------------------//
private void GenerateArray() {
for(i=0;i<arraySize;i++) {
	theArray[i] =(int)((Math.random()*10)+10);
	}
}

private void printArray(){
	System.out.println("------");
	for(i=0;i<arraySize;i++){
		System.out.print("|"+i);
		System.out.println("|"+theArray[i]+"|");
		System.out.println("------");
		}
}

private int getValueAtIndex(int index){
	if(index < arraySize) return theArray[index];
	return 0;
}

private boolean valueCheck(int SearchValue) {
	boolean ValueInArray = false;
	for(i=0;i<arraySize;i++){
		if(theArray[i] == SearchValue) {
			ValueInArray = true;
		}
	}
return ValueInArray;	
}

private void remove(int index) {
	if(index < arraySize) {
		for(i = index;i<(arraySize-1);i++)
		theArray[i]=theArray[i+1];
	}
	arraySize --;
}

private void insertValue(int Value) {
	if(arraySize < 50) {
		theArray[arraySize] = Value;
	arraySize++;
	}
}

public String LinearSearch(int Value) {
	boolean ValueInArray = false;
	String indexsWithValue = "";
	System.out.println("The Value was found in the following Locations:");
	for(int i=0;i<arraySize;i++) {
		if(theArray[i] == Value) {
			ValueInArray = true;
			System.out.print(i + " ");
			indexsWithValue+= i + " ";
		}
	}
	if(!ValueInArray) {
		indexsWithValue = "None";
		System.out.print("indexsWithValue");
	}
	return indexsWithValue;	
}

/*public void bubblesort() {
	for(i=arraySize-1;i>0;i--) {
		for(int j=0;j<arraySize-1;j++) {
			//if((theArray(j))<(theArray(j+1))){}
		}
	}
}*/ 

//-----------------------------------------------------//
public static void main(String[] args) {  //Stubs
ArrayStructures newArray = new ArrayStructures();
newArray.GenerateArray();
//newArray.printArray();
System.out.println(newArray.getValueAtIndex(3));
System.out.println(newArray.valueCheck(18));
//newArray.remove(4);
//newArray.printArray();
newArray.insertValue(60);
newArray.printArray();
newArray.LinearSearch(18);
}
}
