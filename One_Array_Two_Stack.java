package datastructure;

import java.util.Scanner;

public class One_Array_Two_Stack
{
int stack[], maxsize, tos1, tos2;
void createStack(int size) {
tos1 = -1;
tos2 = size;
maxsize = size;
stack = new int[maxsize];
}

void pushA(int element) {
tos1++;
stack[tos1] = element;
}

void pushB(int element) {
tos2--;
stack[tos2] = element;
}

int popA() {
int temp = stack[tos1];
tos1--;
return temp;
}

int popB() {
int temp = stack[tos2];
tos2++;
return temp;
}

int peekA() {
return stack[tos1];
}

int peekB() {
return stack[tos2];
}

void printStackA() {
for (int i = tos1; i > -1; i--) {
System.out.println(stack[i]);
}
}

void printStackB() {
for (int i = tos2; i < maxsize; i++) {
System.out.println(stack[i]);
}
}

boolean is_FullA() {
if (tos1 + 1 == tos2)
return true;
else
return false;
}

boolean is_fullB() {
if (tos2 - 1 == tos1)
return true;
else
return false;
}

boolean is_EmptyA() {

if (tos1 == -1)
return true;
else
return false;
}

boolean is_EmptyB() {

if (tos2 == maxsize - 1)
return true;
else
return false;
}




public static void main(String args[])
    {
        int ch;
        Scanner in=new Scanner(System.in);
         One_Array_Two_Stack sc =new One_Array_Two_Stack();
        System.out.println("Enter size of stack:");
        int size=in.nextInt();
        sc.createStack(size);//user given size :stack
        do
        {
        System.out.println("Stack up side");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
            System.out.println("Stack down side");
            System.out.println("5.Push\n6.Pop\n7.Peek\n8.Print\n0.Exit\n:");
            ch=in.nextInt();
            switch(ch)
            {
           case 1:
                if(!sc.is_FullA())//if not full then take data
                {
                    System.out.println("Enter data to push:");
                    int e=in.nextInt();
                    sc.pushA(e);
                    System.out.println("Data to pushed");
                }
                else {
                    System.out.println("Stack Full");
                }
                break;
        case 2:
                if(!sc.is_EmptyA())//if not Empty then pop
                {
                    int e=sc.popA();
                    System.out.println("Data poped:"+e);
                }
                else
                {
                    System.out.println("Stack Empty");
                }
                break;
        case 3:
                if(!sc.is_EmptyA())//if not Empty then peek
                {
                    int e=sc.peekA();
                    System.out.println("Data @ peek is:"+e);
                }
                else
                {
                    System.out.println("Stack Empty");
                }
                break;
        case 4:
                if(!sc.is_EmptyA())//if not Empty then print
                {
                    System.out.println("Data in stack");
                    sc.printStackA();
                }
                else
                {
                    System.out.println("Stack Empty");
                }
                break;
        case 5:
            if(!sc.is_FullA())//if not full then take data
            {
                System.out.println("Enter data to push:");
                int e=in.nextInt();
                sc.pushB(e);
                System.out.println("Data to pushed");
            }
            else {
                System.out.println("Stack Full");
            }
            break;
    case 6:
            if(!sc.is_EmptyB())//if not Empty then pop
            {
                int e=sc.popB();
                System.out.println("Data poped:"+e);
            }
            else
            {
                System.out.println("Stack Empty");
            }
            break;
    case 7:
            if(!sc.is_EmptyA())//if not Empty then peek
            {
                int e=sc.peekB();
                System.out.println("Data @ peek is:"+e);
            }
            else
            {
                System.out.println("Stack Empty");
            }
            break;
    case 8:
            if(!sc.is_EmptyA())//if not Empty then print
            {
                System.out.println("Data in stack");
                sc.printStackB();
            }
            else
            {
                System.out.println("Stack Empty");
            }
            break;
       
        case 0:
                System.out.println("Exiting.....");
                break;
        default:
                System.out.println("Wrong option selected");
                break;
   
            }
         }while(ch!=0);
    }
}