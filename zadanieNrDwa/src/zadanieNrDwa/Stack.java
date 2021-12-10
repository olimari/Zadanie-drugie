package zadanieNrDwa;

public class Stack {

    double [] tab;
    int first;

    public Stack(int size) {
        tab = new double[size];
        first = 0;
    }

    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (first < tab.length) {
            tab[first] = E;
            first++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Stos jest pelny!");
        }
    }

    double Pop() throws IndexOutOfBoundsException {
        if (first <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty!");
        }

        double temp = tab[first - 1];
        first--;
        return temp;
    }

    void print() throws IndexOutOfBoundsException {
        if (first == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty!");
        }

        int temp = first - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);

    }
    
    double PeekMin() throws IndexOutOfBoundsException {
        if (first == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty!");
        }
        double min= tab[0];
        for (int i=0;i<tab.length;i++) {
        	if (min>tab[i]) {
        		min=tab[i];
        	}
        }
        return min;
    }
}
