/*A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons, 
 * each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus,
 *  write a method to compute the largest possible number of people in such a tower.
 *   EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
 *   Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) 
 */
package Java_HackathonTest;

class Person implements Comparable<Person> {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if(this.height>p.height) {
            return 1;
        } else if(this.height < p.height) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Q33Circus {

	public static void main(String[] args) {

	}

}
