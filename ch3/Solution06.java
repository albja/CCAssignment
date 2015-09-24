import java.util.*;

class Animal{
	int arrivalTime; //the arrival time of animal, the earlier the smaller
	public int getTime() { return arrivalTime;}
	public void setTime(int x) { arrivalTime = x;}
}

class Cat extends Animal{
}

class Dog extends Animal{
	
}

class AnimalQueue{
	//matain 1 list for cat and 1 list for dog
	LinkedList<Animal> cat = new LinkedList<Animal>();
	LinkedList<Animal> dog = new LinkedList<Animal>();
	int arrivalTime = 0;	//the arrival time of animal, the earlier the smaller
	
	public void enqueue(Animal a){
		a.setTime(arrivalTime++);
		if(a instanceof Cat)
			cat.add(a);
		else if(a instanceof Dog )
			dog.add(a);
	}
	
	public Animal dequeueAny(){
		//if cat is empty, dequeue dog. vice versa
		if(cat.isEmpty())		return dog.poll();
		else if(dog.isEmpty())	return cat.poll();
		//dequeue the "oldest" animal
		else
			return (cat.peek().getTime() < dog.peek().getTime() ? 
					cat.poll() : dog.poll());
	}
	
	public Animal dequeueCat(){
		return cat.poll();
	}
	
	public Animal dequeueDog(){
		return dog.poll();
	}
	
}

public class Solution06 {

	public static void main(String[] args) {
		AnimalQueue q = new AnimalQueue();
		for(int i=0; i<5; ++i){
			Cat a = new Cat();
			Dog b = new Dog();
			q.enqueue(a);
			q.enqueue(b);
		}
		q.dequeueAny();
		q.dequeueDog();
		q.dequeueDog();
		q.dequeueCat();
		
	}

}
