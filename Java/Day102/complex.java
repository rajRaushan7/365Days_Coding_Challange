package Java.Day102;
import java.util.*;

public class complex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();
        Complex a = new Complex(real1, img1);
        Complex b = new Complex(real2, img2);

        Complex sum = Complex.add(a, b);
        System.out.print("Sum: ");
        sum.printComplex();

        Complex diff = Complex.sub(a, b);
        System.out.print("Difference: ");
        diff.printComplex();

        Complex mul = Complex.product(a, b);
        System.out.print("Produce: ");
        mul.printComplex();
        sc.close();
    }
}

class Complex {
    int real;
    int img;

    public Complex(int r, int i){
        this.real = r;
        this.img = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex sub(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex( ((a.real)*(b.real)) - ((a.img)*(b.img)) , ((a.real)*(b.img)) + ((b.real)*(b.img )) );
    }

    public void printComplex() {
        if(real == 0 && img != 0){
            System.out.println(img + "i");
        }
        else if(real != 0 && img == 0){
            System.out.println(real);
        }
        else{
            System.out.println(real + "+" + img + "i");
        }
    }
}