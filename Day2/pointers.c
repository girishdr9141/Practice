#include<stdio.h>
int * function(){
    int a=10;
    return &a;
}
int main(){
    int *p=function();
    printf("Value is %d\n",*p);
    return 0;
    
    
        int a=10;
        int *ptr=&a;
        //Dereferencing the pointer
        printf("Value of a is%d\n",*ptr);
    printf("Address of a is %p\n",ptr);
    printf("Address of a is %x\n",ptr);
}